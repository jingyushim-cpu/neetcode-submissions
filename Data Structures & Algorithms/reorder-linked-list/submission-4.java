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
    public void reorderList(ListNode head) {
        ListNode first = head;
        ListNode left = first;
        ListNode right = first;
        
        while(right != null && right.next != null){
            left = left.next;
            right = right.next.next;
        }

        ListNode secondTmp = left.next;
        left.next = null;

        ListNode second = null;

        while(secondTmp != null){
            ListNode tmp = secondTmp.next;
            secondTmp.next = second;
            second = secondTmp;
            secondTmp = tmp;
        }
        
        while(second != null){
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}
