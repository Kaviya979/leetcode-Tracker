// Last updated: 30/07/2026, 15:03:43
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14class Solution {
15    public ListNode sortList(ListNode head) {
16        if (head == null || head.next == null)
17            return head;
18
19        // Find middle
20        ListNode slow = head, fast = head, prev = null;
21        while (fast != null && fast.next != null) {
22            prev = slow;
23            slow = slow.next;
24            fast = fast.next.next;
25        }
26
27        // Split into two halves
28        prev.next = null;
29
30        // Sort each half
31        ListNode left = sortList(head);
32        ListNode right = sortList(slow);
33
34        // Merge sorted halves
35        return merge(left, right);
36    }
37
38    private ListNode merge(ListNode l1, ListNode l2) {
39        ListNode dummy = new ListNode(0);
40        ListNode tail = dummy;
41
42        while (l1 != null && l2 != null) {
43            if (l1.val < l2.val) {
44                tail.next = l1;
45                l1 = l1.next;
46            } else {
47                tail.next = l2;
48                l2 = l2.next;
49            }
50            tail = tail.next;
51        }
52
53        if (l1 != null)
54            tail.next = l1;
55        else
56            tail.next = l2;
57
58        return dummy.next;
59    }
60}