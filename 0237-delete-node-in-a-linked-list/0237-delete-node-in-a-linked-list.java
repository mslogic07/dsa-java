/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // do{
        //     node.val = node.next.val;
        //     ListNode temp = node.next;
        //     node.next = node.next.next;
        //     node = temp;
        // }while(node.next != null);
        // No iteration needed
        node.val = node.next.val;
        node.next = node.next.next;
    }
}