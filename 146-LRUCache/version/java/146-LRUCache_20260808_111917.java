// Last updated: 08/08/2026, 11:19:17
1import java.util.HashMap;
2
3class LRUCache {
4
5    class Node {
6        int key;
7        int value;
8        Node prev;
9        Node next;
10
11        Node(int key, int value) {
12            this.key = key;
13            this.value = value;
14        }
15    }
16
17    private int capacity;
18    private HashMap<Integer, Node> map;
19    private Node head;
20    private Node tail;
21
22    public LRUCache(int capacity) {
23        this.capacity = capacity;
24        map = new HashMap<>();
25
26        // Dummy nodes
27        head = new Node(0, 0);
28        tail = new Node(0, 0);
29
30        head.next = tail;
31        tail.prev = head;
32    }
33
34    public int get(int key) {
35
36        if (!map.containsKey(key)) {
37            return -1;
38        }
39
40        Node node = map.get(key);
41
42        // This key is now recently used
43        remove(node);
44        addToFront(node);
45
46        return node.value;
47    }
48
49    public void put(int key, int value) {
50
51        // Key already exists
52        if (map.containsKey(key)) {
53            Node node = map.get(key);
54
55            node.value = value;
56
57            remove(node);
58            addToFront(node);
59
60            return;
61        }
62
63        // New key
64        Node node = new Node(key, value);
65
66        map.put(key, node);
67        addToFront(node);
68
69        // Capacity exceeded
70        if (map.size() > capacity) {
71            Node lru = tail.prev;
72
73            remove(lru);
74            map.remove(lru.key);
75        }
76    }
77
78    // Remove a node from the linked list
79    private void remove(Node node) {
80        node.prev.next = node.next;
81        node.next.prev = node.prev;
82    }
83
84    // Add node at the front
85    private void addToFront(Node node) {
86        node.next = head.next;
87        node.prev = head;
88
89        head.next.prev = node;
90        head.next = node;
91    }
92}