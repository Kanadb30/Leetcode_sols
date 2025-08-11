package Leetcode_sols.Linked_Lists;

public class Middle_of_the_linked_list {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        int mid = size/2 + 1;
        for(int i = 1;i < mid;i++){

            head = head.next;
        }
        return head;
    }
}
