// Last updated: 25/07/2026, 16:09:04
1import java.util.Collections;
2import java.util.PriorityQueue;
3
4class MedianFinder {
5
6    // Max Heap
7    private PriorityQueue<Integer> left;
8
9    // Min Heap
10    private PriorityQueue<Integer> right;
11
12    public MedianFinder() {
13        left = new PriorityQueue<>(Collections.reverseOrder());
14        right = new PriorityQueue<>();
15    }
16
17    public void addNum(int num) {
18
19        left.offer(num);
20
21        right.offer(left.poll());
22
23        if (left.size() < right.size()) {
24            left.offer(right.poll());
25        }
26    }
27
28    public double findMedian() {
29
30        if (left.size() > right.size()) {
31            return left.peek();
32        }
33
34        return (left.peek() + right.peek()) / 2.0;
35    }
36}