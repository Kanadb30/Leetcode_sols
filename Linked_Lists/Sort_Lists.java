package Leetcode_sols.Linked_Lists;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Sort_Lists {
//    public ListNode sortList(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//        ListNode mid = middleNode(head);
//        ListNode left = sortList(head);
//        ListNode right = sortList(mid);
//        return mergeTwoLists(left,right);
//    }
//
//    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//        ListNode ans = new ListNode();
//        ListNode temp = ans;
//        while(list1 != null && list2 != null){
//            if(list1.val <= list2.val){
//                temp.next = list1;
//                temp = temp.next;
//                list1 = list1.next;
//            }
//            else {
//                temp.next = list2;
//                temp = temp.next;
//                list2 = list2.next;
//            }
//        }
//        if(list2 != null){
//            temp.next = list2;
//        }else if(list1 != null){
//            temp.next = list1;
//        }
//        ans = ans.next;
//        return ans;
//
//    }
//    public ListNode middleNode(ListNode head) {
//        int size = 0;
//        ListNode temp = head;
//        while(temp != null){
//            temp = temp.next;
//            size++;
//        }
//        int mid = size/2 + 1;
//        for(int i = 1;i < mid-1;i++){
//
//            head = head.next;
//        }
//        ListNode ans = head.next;
//        head.next = null;
//        return ans;
//    }
}
