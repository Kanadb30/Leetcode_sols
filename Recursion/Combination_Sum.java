package Leetcode_sols.Recursion;
import java.util.*;

public class Combination_Sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        findcombinations(candidates,target,0,ans,0,temp);
        return ans;
    }
    public void findcombinations(int[] candidates,int target,int element,List<List<Integer>> ans,int sum,List<Integer> temp){
        if(element == candidates.length || sum > target){
            return;
        }
        if(sum == target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = element;i < candidates.length;i++){
            temp.add(candidates[i]);
            findcombinations(candidates,target,i,ans,sum+candidates[i],temp);
            temp.remove(temp.size()-1);
        }

    }
}
