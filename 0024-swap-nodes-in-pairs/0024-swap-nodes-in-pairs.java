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
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next==null)
        return head;
        ListNode c =new ListNode(0);
        ListNode temp =c;
        temp.next=head;
        
        while(temp.next!=null && temp.next.next!=null){
            ListNode f =temp.next;
            ListNode s=f.next;
            f.next=s.next;
            s.next=f;
            temp.next=s;
            temp=f;
        }
        return c.next;
    }
}