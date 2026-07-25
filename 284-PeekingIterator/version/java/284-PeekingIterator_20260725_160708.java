// Last updated: 25/07/2026, 16:07:08
1import java.util.Iterator;
2
3class PeekingIterator implements Iterator<Integer> {
4
5    private Iterator<Integer> iterator;
6    private Integer nextElement;
7
8    public PeekingIterator(Iterator<Integer> iterator) {
9        this.iterator = iterator;
10        if (iterator.hasNext()) {
11            nextElement = iterator.next();
12        } else {
13            nextElement = null;
14        }
15    }
16
17    // Returns the next element without moving the iterator
18    public Integer peek() {
19        return nextElement;
20    }
21
22    @Override
23    public Integer next() {
24        Integer current = nextElement;
25
26        if (iterator.hasNext()) {
27            nextElement = iterator.next();
28        } else {
29            nextElement = null;
30        }
31
32        return current;
33    }
34
35    @Override
36    public boolean hasNext() {
37        return nextElement != null;
38    }
39}