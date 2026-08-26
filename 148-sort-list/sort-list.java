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
    public ListNode sortList(ListNode head) {
        int temp = 0;
        ListNode slow = head;
        while(slow!=null){
            temp++;
            slow = slow.next;
        }
        int[] arr = new int[temp];
        slow = head;
        for(int i=0;i<temp;i++){
            arr[i] = slow.val;
            slow = slow.next;
        }
        slow = head;
        Arrays.sort(arr);
        for(int i=0;i<temp;i++){
            slow.val = arr[i];
            slow = slow.next;
        }
        return head;
    }
}