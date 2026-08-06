// Last updated: 06/08/2026, 20:52:46
1class Solution {
2    public TreeNode sortedListToBST(ListNode head) {
3        if (head == null) {
4            return null;
5        }
6
7        if (head.next == null) {
8            return new TreeNode(head.val);
9        }
10
11        ListNode prev = null;
12        ListNode slow = head;
13        ListNode fast = head;
14
15        // Find the middle node
16        while (fast != null && fast.next != null) {
17            prev = slow;
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        // Split the list into two halves
23        prev.next = null;
24
25        TreeNode root = new TreeNode(slow.val);
26
27        root.left = sortedListToBST(head);
28        root.right = sortedListToBST(slow.next);
29
30        return root;
31    }
32}