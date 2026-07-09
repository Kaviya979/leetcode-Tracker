// Last updated: 09/07/2026, 15:08:36
class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()) return false;
         char[] a = s.toCharArray();
         char[] b = t.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);
         return Arrays.equals(a,b);
    }
}