// Last updated: 17/07/2026, 10:15:59
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3
4        if (head == null || left == right)
5            return head;
6
7        ListNode dummy = new ListNode(0);
8        dummy.next = head;
9
10        ListNode prev = dummy;
11
12        // Move prev to the node before 'left'
13        for (int i = 1; i < left; i++) {
14            prev = prev.next;
15        }
16
17        ListNode curr = prev.next;
18
19        // Reverse nodes from left to right
20        for (int i = 0; i < right - left; i++) {
21            ListNode next = curr.next;
22            curr.next = next.next;
23            next.next = prev.next;
24            prev.next = next;
25        }
26
27        return dummy.next;
28    }
29}