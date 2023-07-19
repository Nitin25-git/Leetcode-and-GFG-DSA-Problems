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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int index=0;
        while(temp!=null)
        {
            temp=temp.next;
            index++;
        }
        int f=index-n;
        if(f==0)
            return head.next;
        ListNode temp1=head;
         for(int i=1;i<f;i++)
         {
             temp1=temp1.next;
         }
        if(temp1.next!=null)
            temp1.next=temp1.next.next;
         return head;
        
    }
    
}