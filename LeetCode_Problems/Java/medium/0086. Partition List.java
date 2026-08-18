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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode d1 = dummy1;
        ListNode d2 = dummy2;

        while (head != null) {
            if (head.val < x) {
                d1.next = head;
                d1 = d1.next;
            } else {
                d2.next = head;
                d2 = d2.next;
            }
            head = head.next;
        }

        d2.next = null;
        d1.next = dummy2.next;
        return dummy1.next;


    }
}
