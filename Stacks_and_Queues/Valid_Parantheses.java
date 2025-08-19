package Leetcode_sols.Stacks_and_Queues;
import java.util.Stack;

public class Valid_Parantheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char cmp : s.toCharArray()){
            if(cmp == '(' || cmp == '{' || cmp == '['){
                stack.push(cmp);
            }else{
                if(cmp == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(cmp == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
                if(cmp == ')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
            }

        }

        return stack.isEmpty();
    }
}
