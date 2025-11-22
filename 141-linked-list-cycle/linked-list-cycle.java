/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            ListNode current=head;
        int index=0;
        while(current!=null){
            index++;
            ListNode prv=head;
            for(int i=0;i<index;i++){
                if(current.next==prv){
                    return true;
                }
                prv=prv.next;
            }
            current=current.next;
        }
        return false;
    }
}