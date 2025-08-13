package Leetcode_sols.Linked_Lists;

public class Pallindrome_Linked_lists {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        ListNode mid_1 = middleNode(head,size);
        ListNode mid = null;
        if(size%2 == 0){
            mid = mid_1.next;
        }else{
            mid = mid_1.next.next;
        }
        mid_1.next = null;
        mid = reverseList(mid);
        while(head != null){
            if(head.val != mid.val){
                return false;
            }
            head = head.next;
            mid = mid.next;
        }
        return true;
    }
    public ListNode middleNode(ListNode head,int size) {

        ListNode temp = head;

        int mid = size/2 + 1;
        for(int i = 1;i < mid-1;i++){

            temp = temp.next;
        }
        return temp;
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
