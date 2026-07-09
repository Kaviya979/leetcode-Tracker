// Last updated: 09/07/2026, 15:10:22
import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> path, List<String> result) {

        // If 4 parts are formed
        if (path.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        // Try segments of length 1 to 3
        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String part = s.substring(index, index + len);

            // Leading zero check
            if (part.length() > 1 && part.charAt(0) == '0')
                continue;

            int value = Integer.parseInt(part);

            // Value should be between 0 and 255
            if (value <= 255) {
                path.add(part);
                backtrack(s, index + len, path, result);
                path.remove(path.size() - 1); // Backtrack
            }
        }
    }
}