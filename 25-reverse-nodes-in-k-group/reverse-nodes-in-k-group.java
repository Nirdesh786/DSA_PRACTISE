class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null || k == 1) {
            return head;
        }

        ListNode second = head;

        int count = k;

        // Find the node after the kth node
        while (count > 0 && second != null) {
            second = second.next;
            count--;
        }

        // If fewer than k nodes remain, don't reverse them
        if (count > 0) {
            return head;
        }

        // Reset count for reversing
        count = k;

        ListNode prev = null;
        ListNode curr = head;

        // Reverse k nodes
        while (count > 0) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;

            count--;
        }

        // Reverse and connect the remaining groups
        head.next = reverseKGroup(second, k);

        return prev;
    }
}