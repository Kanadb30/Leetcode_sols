package Leetcode_sols.Binary_Search;

public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int peakIndex = find_peak(nums);
        if(peakIndex == -1){
            return binary_search(nums,target,0,nums.length-1);
        }else if(target == nums[peakIndex]){
            return peakIndex;
        }else if(target >= nums[0]){

            return binary_search(nums,target,0,peakIndex-1);
        }
        return binary_search(nums,target,peakIndex+1,nums.length-1);

    }

    int find_peak(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid > start && nums[mid-1] > nums[mid]){
                return mid-1;
            }
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (nums[mid]<nums[0]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
    int binary_search(int[] nums,int target, int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
