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
    public void reorderList(ListNode head) {
        ListNode prev=null;
        ListNode mid= getMid(head);
        ListNode curr=mid.next;
        mid.next=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode leftHead=head;
        ListNode rightHead=prev;
        ListNode lhead,rhead;

        while(leftHead!=null && rightHead!=null){
           lhead=leftHead.next;
           leftHead.next=rightHead;
           rhead=rightHead.next;
           rightHead.next=lhead;
           leftHead=lhead;
           rightHead=rhead;
        }
       
    }
    public ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
}