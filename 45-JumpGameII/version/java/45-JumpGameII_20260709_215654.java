// Last updated: 09/07/2026, 21:56:54
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode partition(ListNode head, int x) {
13
14        // Dummy nodes for two partitions
15        ListNode beforeHead = new ListNode(0);
16        ListNode afterHead = new ListNode(0);
17
18        ListNode before = beforeHead;
19        ListNode after = afterHead;
20
21        ListNode current = head;
22
23        while (current != null) {
24
25            if (current.val < x) {
26                before.next = current;
27                before = before.next;
28            } 
29            else {
30                after.next = current;
31                after = after.next;
32            }
33
34            current = current.next;
35        }
36
37        // End the second list
38        after.next = null;
39
40        // Connect before list with after list
41        before.next = afterHead.next;
42
43        return beforeHead.next;
44    }
45}