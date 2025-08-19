package Leetcode_sols.Stacks_and_Queues;
import java.util.Stack;

public class Minimum_Add_to_Make_Parantheses_Valid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else if(ch == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else if(ch == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
