package Leetcode_sols;

public class Problem_1281 {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        for(int i = n;i > 0;i = i/10){
            int temp = i%10;
            sum += temp;
            pro *= temp;
        }
        return (pro-sum);
    }
}
