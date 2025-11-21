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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list2==null&&list1==null)return null;
        ListNode merge_list = new ListNode(-1);  // dummy node
    ListNode current = merge_list;
     System.out.println(current.val);
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                System.out.println("----");
                current.next=list1;
                System.out.println(current.val);
                list1=list1.next;
            }else if(list1.val>list2.val){
                 System.out.println("+++");
                 current.next=list2;
                list2=list2.next;
            }
            current=current.next;
             System.out.println(current.val+"heee");
        }
        if(list1!=null){
            current.next=list1;
        }
        if(list2!=null){
            current.next=list2;
        }

       
    return merge_list.next;
    }
}