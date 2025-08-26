package Leetcode_sols.Recursion;

public class Word_Search {
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(checkword(board,word.toCharArray(),i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean checkword(char[][] board,char[] word,int row,int col,int index){
        if(index == word.length){
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
            return false;
        }
        if(board[row][col] != word[index]){
            return false;
        }

        char remove = board[row][col];
        board[row][col]='.';
        boolean ans = checkword(board,word,row+1,col,index+1);
        board[row][col] = remove;
        if(!ans){
            board[row][col]='.';
            ans = checkword(board,word,row-1,col,index+1);
            board[row][col] = remove;
        }
        if(!ans){
            board[row][col]='.';
            ans = checkword(board,word,row,col-1,index+1);
            board[row][col] = remove;
        }
        if(!ans){
            board[row][col]='.';
            ans = checkword(board,word,row,col+1,index+1);
            board[row][col] = remove;
        }
        return ans;
    }
}
