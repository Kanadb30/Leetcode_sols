package Leetcode_sols.Recursion;

public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n == 0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%2 != 0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
