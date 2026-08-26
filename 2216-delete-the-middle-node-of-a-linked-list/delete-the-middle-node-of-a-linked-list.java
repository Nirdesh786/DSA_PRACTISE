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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode slow = head;
        int count = 0;
        while(slow!=null ){
            count++;
            slow = slow.next;
        }
        count = (count/2 )-1;
        slow = head;
        while(count>0){
            slow = slow.next;
            count--;
        }
        slow.next = slow.next.next;
        return head;
    }
}