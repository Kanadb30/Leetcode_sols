package Leetcode_sols.Recursion;

public class Sudoku_Solver {
    public void solveSudoku(char[][] board) {
        solved(board,0,0);
    }
    public boolean solved(char[][] board,int row,int col){
        if(row == board.length){
            return true;
        }
        if(board[row][col] == '.'){
            for(int i = 1;i < 10;i++){
                if(check(board,row,col,i)){
                    board[row][col] = (char)(i+'0');
                    if(solved(board,row + (col+1)/board.length,(col+1)%board.length)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
            return false;
        }else{
            return solved(board,row + (col+1)/board.length,(col+1)%board.length);
        }
    }
    public boolean check(char[][] board,int row,int col,int k){
        char check = (char)(k+'0');
        for(int i=0;i<board.length;i++){
            if(check == board[row][i]){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(check == board[i][col]){
                return false;
            }
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col%sqrt;
        for(int i = rowStart;i < rowStart+sqrt;i++){
            for(int j= colStart;j < colStart+sqrt;j++){
                if(board[i][j]==check){
                    return false;
                }
            }
        }
        return true;
    }
}
