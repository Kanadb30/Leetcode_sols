package Leetcode_sols;

public class sqrt_x {
    public int mySqrt(int x) {
        if (x==1){
            return 1;
        }
        long start = 0;
        long end = x/2;
        while(start<=end){
            long mid = start + (end - start)/2;
            if((long)x>(long)mid*mid){
                start = mid + 1;
            }else if((long)x<(long)mid*mid){
                end = mid - 1;
            }else {
                return (int)mid;
            }
        }
        return (int)start-1;
    }
}
