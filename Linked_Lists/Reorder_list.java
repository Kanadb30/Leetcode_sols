package Leetcode_sols.Linked_Lists;

public class Reorder_list {
    public void reorderList(ListNode head) {
        if(head.next == null){
            return;
        }
        int size = 0;
        ListNode temp1 = head;
        while(temp1 != null){
            temp1 = temp1.next;
            size++;
        }
        ListNode mid_1 = middleNode(head,size);
        ListNode second = null;
        if(size%2 != 0){
            mid_1 = mid_1.next;
        }
        second = mid_1.next;
        mid_1.next = null;
        second = reverseList(second);

        ListNode temp = head;
        while(second != null){
            ListNode s = temp.next;
            temp.next = second;
            second = second.next;
            temp.next.next = s;
            temp = s;
        }
        return;


    }
    public ListNode middleNode(ListNode head,int size) {

        int mid = size/2 + 1;
        for(int i = 1;i < mid-1;i++){

            head = head.next;
        }
        return head;
    }
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
