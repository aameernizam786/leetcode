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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || right==left){
            return head;
        }
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode prev=temp;
        for(int i=1;i<left ;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode revPrev=null;
        ListNode Next;
        for(int i=left ; i<=right ;i++){
            Next=curr.next;
            curr.next=revPrev;
            revPrev=curr;
            curr=Next;
        }
       
       prev.next.next=curr;
       prev.next=revPrev;

        return temp.next;
        
    }
}