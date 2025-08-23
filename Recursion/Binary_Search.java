package Leetcode_sols.Recursion;

public class Binary_Search {

    class Solution {
        public int bsearch(int[] nums,int target,int start,int end){
            if(start > end){
                return -1;
            }
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                return bsearch(nums,target,start,mid-1);
            }else{
                return bsearch(nums,target,mid+1,end);
            }
        }
        public int search(int[] nums, int target) {
            return bsearch(nums,target,0,nums.length-1);
        }
    }

}
