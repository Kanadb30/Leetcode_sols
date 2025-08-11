package Leetcode_sols;

public class Happy_Number {
    int sqr(int a) {
        int sum = 0;
        while (a > 0) {
            sum += (a % 10) * (a % 10);
            a /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        while (fast != 0) {
            fast = sqr(sqr(fast));
            slow = sqr(slow);
            if (fast == 1) {
                return true;
            }
            if (fast == slow) {
                return false;
            }
        }
        return false;
    }
}
