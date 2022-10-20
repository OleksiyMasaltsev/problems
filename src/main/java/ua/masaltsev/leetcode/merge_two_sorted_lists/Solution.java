package ua.masaltsev.leetcode.merge_two_sorted_lists;

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
        ListNode head = list1.val >= list2.val ? list1 : list2;
        ListNode node1;
        ListNode node2;

        while ((node1 = list1.next) != null || (node2 = list2.next) != null) {

        }
        return null;
    }
}