package Leetcode_sols.Recursion;

public class Power_of_Four {
    public boolean isPowerOfFour(int n) {
        if(n == 0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4 != 0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
