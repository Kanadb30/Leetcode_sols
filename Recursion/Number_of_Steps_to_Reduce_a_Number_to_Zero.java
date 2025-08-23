package Leetcode_sols.Recursion;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public int count(int num,int steps){
        if(num == 0){
            return steps;
        }
        if(num%2 == 0){
            steps = count(num/2,++steps);
        }else{
            steps = count(num-1,++steps);
        }
        return steps;
    }
    public int numberOfSteps(int num) {
        return count(num,0);
    }
}
