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
    public ListNode reverseList(ListNode head) {
         ListNode current=head;
        ListNode prv=null,next;
        while(current!=null) {
            next = current.next;
            current.next = prv;
            prv = current;
            current = next;;
        }
        return prv;
    }
}