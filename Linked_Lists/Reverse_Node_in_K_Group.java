package Leetcode_sols.Linked_Lists;

public class Reverse_Node_in_K_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int left = 1;
        int right = left + k - 1;
        while(right <= size){
            head = reverseBetween(head,left,right);
            left = right + 1;
            right = left + k - 1;
        }
        return head;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        ListNode start = prev;
        ListNode next = current.next;

        ListNode last = current;
        for (int i = 0; current != null && i < right - left; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }

        }
        current.next = prev;
        if(start != null){
            start.next = current;
        }else{
            head = current;
        }

        last.next = next;
        return head;
    }
}
