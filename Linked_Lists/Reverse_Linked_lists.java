package Leetcode_sols.Linked_Lists;

public class Reverse_Linked_lists {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode pre = head;
        ListNode next = head.next;
        do{
            pre.next = prev;
            prev = pre;
            pre = next;
            next = next.next;
        }while(pre.next != null);
        pre.next = prev;
        head = pre;
        return head;
    }
}
