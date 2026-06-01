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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int size  = count-n;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        
        for(int i=0;i<size;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}