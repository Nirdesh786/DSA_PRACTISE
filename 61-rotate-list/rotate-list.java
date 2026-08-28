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
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        k = k% count;
        if(k==0){
            return head;
        }
        head = reverse(head,count);
        head = reverseFirstK(head,k);

        ListNode temp2  = head;
        for(int i=0;i<k-1;i++){
            temp2 = temp2.next;
        }
        temp2.next = reverse(temp2.next , count-k);
        return head;
    }
    private ListNode reverse(ListNode head, int k){
        ListNode curr = head;
        ListNode prev = null;

        while (k > 0 && curr != null) {

            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;

            k--;
        }

        return prev;
    }

    private ListNode reverseFirstK(ListNode head,int k){
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while(k>0){
            next= curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;

            k--;
        }
        head.next = curr;
        return prev;
    }
}