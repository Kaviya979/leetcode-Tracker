// Last updated: 09/07/2026, 15:08:03
class Solution {
    public String toHex(int num) {
        if (num ==0) return "0";
        char[] map = "0123456789abcdef".toCharArray();
                StringBuffer sb = new StringBuffer();
             while(num!=0){
                int d = num&15;
                sb.append(map[d]);
                num>>>=4;
           }
           return sb.reverse().toString();
    }
}