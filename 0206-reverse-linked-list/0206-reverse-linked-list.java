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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        if(current != null){
            ListNode temp = current.next;
        ListNode temp1 = null;
        while(temp != null){
            temp1 = temp.next;
            temp.next = current;
            current = temp;
            temp = temp1;
        }
        head.next = null;
        }
        return current;
    }
}