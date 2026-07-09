// Last updated: 09/07/2026, 15:06:30
import java.util.*;

class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.offer(0);
        visited[0] = true;

        int farthest = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == n - 1) {
                return true;
            }

            int start = Math.max(current + minJump, farthest);
            int end = Math.min(current + maxJump, n - 1);

            for (int i = start; i <= end; i++) {
                if (s.charAt(i) == '0' && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }

            farthest = Math.max(farthest, end + 1);
        }

        return false;
    }
}