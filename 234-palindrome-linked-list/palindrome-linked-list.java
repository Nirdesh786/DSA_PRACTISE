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
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode temp =slow;
        
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev  = temp;
            temp = next;
        }
        while(prev!=null){
            if(head.val != prev.val){
                return false;
            }else{
                head = head.next;
                prev = prev.next;
            }
        }
        return true;
    }
}