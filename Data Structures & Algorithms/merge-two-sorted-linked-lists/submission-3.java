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
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode ans = new ListNode(0);
        ListNode merged = ans;

        while(list1 != null || list2 != null){
            if(list1 == null){
                merged.next = list2;
                break;
            }
            if(list2 == null){
                merged.next = list1;
                break;
            }

            if(list1.val >= list2.val){
                merged.next = list2;
                list2 = list2.next;
            }
            else{
                merged.next = list1;
                list1 = list1.next;
            }

            merged = merged.next;
        }

        return ans.next;
    }
}