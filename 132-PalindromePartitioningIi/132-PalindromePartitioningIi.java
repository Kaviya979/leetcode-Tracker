// Last updated: 09/07/2026, 15:09:53
class Solution {
    public int minCut(String s) {
        int n = s.length();
        boolean[][] palindrome = new boolean[n][n];

        int[] cuts = new int[n];

        for (int end = 0; end < n; end++) {
            cuts[end] = end; 

            for (int start = 0; start <= end; start++) {

                if (s.charAt(start) == s.charAt(end) &&
                    (end - start <= 2 || palindrome[start + 1][end - 1])) {

                    palindrome[start][end] = true;

                    if (start == 0) {
                        cuts[end] = 0;
                    } else {
                        cuts[end] = Math.min(cuts[end], cuts[start - 1] + 1);
                    }
                }
            }
        }

        return cuts[n - 1];
    }
}