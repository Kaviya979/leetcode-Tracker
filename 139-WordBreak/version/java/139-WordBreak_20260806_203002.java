// Last updated: 06/08/2026, 20:30:02
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode fast = dummy;
7        ListNode slow = dummy;
8
9        // Move fast pointer n+1 steps ahead
10        for (int i = 0; i <= n; i++) {
11            fast = fast.next;
12        }
13
14        // Move both pointers
15        while (fast != null) {
16            fast = fast.next;
17            slow = slow.next;
18        }
19
20        // Remove nth node from end
21        slow.next = slow.next.next;
22
23        return dummy.next;
24    }
25}