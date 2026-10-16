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
        ListNode second = head;

        while(first != null && first.next != null){
            first = first.next.next;
            second = second.next;
        }

        ListNode secondHalf = second.next;
        second.next = null;

        ListNode reversedSecond = null;

        while(secondHalf != null){
            ListNode tmp = secondHalf.next;
            secondHalf.next = reversedSecond;
            reversedSecond = secondHalf;
            secondHalf = tmp;
        }

        ListNode firstHalf = head;

        while(reversedSecond != null){
            ListNode firstNext = firstHalf.next;
            ListNode secondNext = reversedSecond.next;

            firstHalf.next = reversedSecond;
            reversedSecond.next = firstNext;

            firstHalf = firstNext;
            reversedSecond = secondNext;
        }

    }
}
