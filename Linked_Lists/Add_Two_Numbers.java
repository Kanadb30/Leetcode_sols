package Leetcode_sols.Linked_Lists;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = l1;
        ListNode prev = l1;
        while(l1 != null && l2 != null){
            int temp = carry;
            carry = (l1.val + l2.val + carry)/10;
            l1.val = (l1.val + l2.val + temp)%10;
            prev = l1;
            l1 =l1.next;
            l2=l2.next;
        }
        while(l1 != null){
            int temp = carry;
            carry = (l1.val + carry)/10;
            l1.val = (l1.val + temp)%10;
            prev = l1;
            l1 =l1.next;
        }
        if(l2 != null){
            prev.next = l2;
            l1 = l2;
            while(l1 != null){
                int temp = carry;
                carry = (l1.val + carry)/10;
                l1.val = (l1.val +temp)%10;
                prev = l1;
                l1 = l1.next;
            }
        }
        if(carry != 0){
            ListNode newnode = new ListNode(carry);
            prev.next = newnode;
        }
        return ans;
    }
}
