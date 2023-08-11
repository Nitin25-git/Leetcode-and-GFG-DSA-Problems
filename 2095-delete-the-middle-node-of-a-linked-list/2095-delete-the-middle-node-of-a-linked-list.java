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
        ListNode slow=head;
        ListNode fast=head;
        ListNode pvs=null;
        
        if(head==null || head.next==null)
            return null;
        while(fast!=null && fast.next!=null)
        {   pvs=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pvs.next=slow.next;
        return head;
        
    }
}