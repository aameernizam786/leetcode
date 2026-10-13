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
        // if(list1 == null && list2 == null){
        //     return null;
        // }else if(list1 == null){
        //     return list2;
        // }else if(list2==null){
        //     return list1;
        // }
        ListNode root=new ListNode(-1);
        ListNode newRoot=root;
        ListNode temp1=list1;
        ListNode temp2=list2;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                newRoot.next=temp1;
                temp1=temp1.next;
            }else{
                newRoot.next=temp2;
                temp2=temp2.next;
            }
            newRoot=newRoot.next;
        }
        while(temp1 != null){
            newRoot.next=temp1;
            temp1=temp1.next;
            newRoot=newRoot.next;

        }
        while(temp2 != null){
            newRoot.next=temp2;
            temp2=temp2.next;
            newRoot=newRoot.next;
        }
        return root.next;
    }
}