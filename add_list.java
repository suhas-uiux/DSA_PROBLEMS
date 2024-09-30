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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
    int carry=0;
    int x=0;
    int y=0;
        while(l1!=null|| l2!=null || carry!=0){
            if(l1!=null){
                 x=l1.val;
            }
            else{
                x=0;
            }
            if(l2!=null){
                 y=l2.val;
            }
            else{
                y=0;
            }
            int sum=carry+x+y;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        return dummy.next;
    }
}
