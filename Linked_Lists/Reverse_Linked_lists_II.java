package Leetcode_sols.Linked_Lists;

public class Reverse_Linked_lists_II {
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
