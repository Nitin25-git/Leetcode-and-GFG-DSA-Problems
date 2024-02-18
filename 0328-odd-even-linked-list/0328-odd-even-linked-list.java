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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null)
            return head;
        ListNode evenhead=head.next;
        ListNode oddhead=head;
        
        ListNode evenhead1=head.next;
        while(evenhead!=null && evenhead.next!=null)
        {
            oddhead.next=evenhead.next;
            oddhead=oddhead.next;
            evenhead.next=oddhead.next;
            evenhead=evenhead.next;
        }
        oddhead.next=evenhead1;
        return head;
        
        
    }
}