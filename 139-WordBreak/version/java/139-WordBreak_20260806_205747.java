// Last updated: 06/08/2026, 20:57:47
1class Solution {
2    public Node connect(Node root) {
3        Node current = root;
4
5        while (current != null) {
6            Node dummy = new Node(0);
7            Node tail = dummy;
8
9            while (current != null) {
10
11                if (current.left != null) {
12                    tail.next = current.left;
13                    tail = tail.next;
14                }
15
16                if (current.right != null) {
17                    tail.next = current.right;
18                    tail = tail.next;
19                }
20
21                current = current.next;
22            }
23
24            current = dummy.next;
25        }
26
27        return root;
28    }
29}