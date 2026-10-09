// Last updated: 09/10/2026, 20:28:27
1
2/* The guess API is already defined in the parent class.
3   int guess(int num); */
4
5public class Solution extends GuessGame {
6    public int guessNumber(int n) {
7        int left = 1;
8        int right = n;
9
10        while (left <= right) {
11            int mid = left + (right - left) / 2;
12
13            int result = guess(mid);
14
15            if (result == 0) {
16                return mid;
17            } else if (result == -1) {
18                right = mid - 1;
19            } else {
20                left = mid + 1;
21            }
22        }
23
24        return -1;
25    }
26}