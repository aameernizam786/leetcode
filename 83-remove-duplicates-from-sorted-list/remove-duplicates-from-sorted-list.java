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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode dummy = new ListNode(-1);
        ListNode pre=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(!set.contains(temp.val)){
                 set.add(temp.val);
                 pre.next=temp;
                 pre=pre.next;
            }
            temp=temp.next;
            
        }
        pre.next=null;
        return dummy.next;
    }
}