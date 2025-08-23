package Leetcode_sols.Recursion;

public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        if(n == 0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3 != 0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
