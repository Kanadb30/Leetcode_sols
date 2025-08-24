package Leetcode_sols.Recursion;
import java.util.*;

public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        pr(digits,"",ans);
        return ans;
    }
    public String range(char a){
        switch (a){
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
        }
        return "wxyz";
    }
    public void pr(String up,String p,List<String> ans){
        if(up.isEmpty()){
            if(p.isEmpty()){
                return;
            }
            ans.add(p);
            return;
        }
        char ch = up.charAt(0);
        String cmp  = range(ch);
        for(int i = 0;i < cmp.length();i++){
            ch = cmp.charAt(i);
            pr(up.substring(1),p+ch,ans);
        }
    }
}
