/**
 * Definition for singly-linked list.
 * public class Node {
 *     int val;
 *     Node next;
 *     Node() {}
 *     Node(int val) { this.val = val; }
 *     Node(int val, Node next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}