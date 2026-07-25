// Last updated: 25/07/2026, 16:05:40
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        if (head == null || head.next == null) {
15            return null;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head;
20
21        // Step 1: Detect cycle
22        while (fast != null && fast.next != null) {
23            slow = slow.next;
24            fast = fast.next.next;
25
26            if (slow == fast) {
27                // Step 2: Find the start of the cycle
28                slow = head;
29
30                while (slow != fast) {
31                    slow = slow.next;
32                    fast = fast.next;
33                }
34
35                return slow;
36            }
37        }
38
39        return null;
40    }
41}