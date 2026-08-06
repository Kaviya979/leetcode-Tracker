// Last updated: 06/08/2026, 20:32:05
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        while (prev.next != null && prev.next.next != null) {
9            ListNode first = prev.next;
10            ListNode second = first.next;
11
12            // Swap nodes
13            first.next = second.next;
14            second.next = first;
15            prev.next = second;
16
17            // Move to the next pair
18            prev = first;
19        }
20
21        return dummy.next;
22    }
23}