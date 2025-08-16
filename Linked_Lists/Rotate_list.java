package Leetcode_sols.Linked_Lists;

public class Rotate_list {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        int size = 1;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        temp.next = head;
        int rotations = k%size;
        while(rotations-->0){
            for(int i = 0;i < size-1;i++){
                head = head.next;
            }
        }
        temp = head;
        while(size-->1){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
}
