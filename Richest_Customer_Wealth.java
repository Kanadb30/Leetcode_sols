package Leetcode_sols;

public class Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0;i < accounts.length ; i++){
            int temp = 0;
            for(int j = 0;j < accounts[i].length; j++){
                temp += accounts[i][j];
            }
            if(temp>max){
                max=temp;
            }

        }
        return max;
    }
    // ENHANCED SOLUTION
    public int maximumWealth2(int[][] accounts) {
        int max = 0;
        for(int[] i:accounts){
            int temp = 0;
            for(int j : i){
                temp += j;
            }
            if(temp>max){
                max=temp;
            }

        }
        return max;
    }
}
