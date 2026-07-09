// Last updated: 09/07/2026, 15:10:54
class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }

        return len;
    }
}