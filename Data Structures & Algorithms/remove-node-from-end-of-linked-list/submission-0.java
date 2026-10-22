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
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count+=1;
            curr=curr.next;
        }
        if(count<n){
            return null;
        }
        int targetIndex=count-n+1;
        if(targetIndex==1){
            return head.next;
        }
        ListNode prev=null;
        curr=head;
        int check=0;
        while(curr!=null){
            check++;
            if(check==targetIndex-1){
               curr.next=curr.next.next;
               break;
            }
            curr=curr.next;
        }
        return head;
    }
}
