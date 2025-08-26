package Leetcode_sols.Recursion;

public class Target_Sum {
    public int findTargetSumWays(int[] nums, int target) {
        return total(nums,target,0);
    }
    public int total(int[] nums,int target,int i){
        if(i == nums.length){
            int sum = 0;
            for(int j : nums){
                sum += j;
            }
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }

        int left = total(nums,target,i+1);
        nums[i] = nums[i]*(-1);
        int right = total(nums,target,i+1);

        return left+right;
    }
}
