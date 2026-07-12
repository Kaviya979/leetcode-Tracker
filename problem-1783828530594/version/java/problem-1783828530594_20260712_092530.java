// Last updated: 12/07/2026, 09:25:30
1class Solution {
2    public int secondsBetweenTimes(String startTime, String endTime) {
3        return getSeconds(endTime) - getSeconds(startTime);
4    }
5    private int getSeconds(String time){
6        String[] parts = time.split(":");
7        int h = Integer.parseInt(parts[0]);
8        int m = Integer.parseInt(parts[1]);
9        int s = Integer.parseInt(parts[2]);
10        return h * 3600 + m * 60 + s;
11    }
12}
13