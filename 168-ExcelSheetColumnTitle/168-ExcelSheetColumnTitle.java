// Last updated: 09/07/2026, 15:09:36
class Solution {
    public String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n!=0){
        int d = --n%26;
        sb.append((char)(d+65));
        n/=26;

    }
    return sb.reverse().toString();
    }
}