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
        ListNode current=head;
        int length=0;
        int i=0;
        int temp=0;
        if(current==null){
            return head;
        }   
        if(current.next==null){
            return head;
        }
        while(current!=null){
            length++;
            current=current.next;
        }
        current=head;
        while(i<length-1){
            temp=current.val;
            current.val=current.next.val;
            current.next.val=temp;
            i=i+2;
            current=current.next.next;
            if(current==null){
                break;
            }
            if(current.next==null){
                break;
            }
         }
         return head;
    }
}
