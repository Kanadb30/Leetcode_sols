package Leetcode_sols;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Linked_List_Cycle_II {
//    public ListNode detectCycle(ListNode head){
//        int size = 0;
//        boolean foundcycle = false;
//        if(head == null || head.next == null){
//            return null;
//        }
//        ListNode fast = head;
//        ListNode slow = head;
//        while(fast != null && fast.next != null ){
//            fast = fast.next.next;
//            slow = slow.next;
//            if(slow == fast){
//                slow = head;
//                while(slow != fast){
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }
}
