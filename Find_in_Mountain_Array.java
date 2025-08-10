package Leetcode_sols;


/**
 * (This problem is an interactive problem.)
 *
 * You may recall that an array arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 *
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 *
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 * MountainArray.length() returns the length of the array.
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
 *
 *
 *
 *
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//public class Find_in_Mountain_Array {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int largest = largest_no_index(mountainArr);
//        int ans = -1;
//        ans = search(target,0,largest,mountainArr,true);
//        if(ans == -1){
//            ans = search(target,largest+1,mountainArr.length()-1,mountainArr,false);
//        }
//        return ans;
//    }
//    public int largest_no_index(MountainArray mountainArr){
//        int start = 0;
//        int end = mountainArr.length()-1;
//        while(start!=end){
//            int mid = start + (end - start)/2;
//            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
//                end = mid;
//            }
//            else{
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//    public int search(int target,int start,int end, MountainArray mountainArr,boolean check){
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if(mountainArr.get(mid)<target){
//                if(check){
//                    start = mid + 1;
//                }
//                else{
//                    end = mid - 1;
//                }
//
//            }
//            else if(mountainArr.get(mid)>target){
//                if(check){
//                    end = mid - 1;
//                }
//                else{
//                    start = mid + 1;
//                }
//
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
