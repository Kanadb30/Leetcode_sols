package Leetcode_sols.Recursion;
import java.util.*;

public class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char [][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        findqueens(board,0,ans);
        return ans;
    }
    public void findqueens(char[][] board,int row,List<List<String>> ans) {
        if(row == board.length){
            addAns(board,ans);
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                findqueens(board,row+1,ans);
                board[row][col] = '.';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {
        for(int i=0;i<row;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        int MaxLeft = Math.min(row,col);
        int MaxRight = Math.min(row,board.length-1-col);
        for(int i = 1;i<MaxLeft+1;i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            }
        }
        for(int i = 1;i<MaxRight+1;i++){
            if(board[row-i][col+i] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public void addAns(char[][] board,List<List<String>> ans){
        List<String> temp = new ArrayList<>();
        for(int i = 0;i < board.length;i++){
            String add = "";
            for(int j=0;j<board.length;j++){
                add += board[i][j];
            }
            temp.add(add);
        }
        ans.add(temp);
    }
}
