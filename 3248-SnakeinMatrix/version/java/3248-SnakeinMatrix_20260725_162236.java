// Last updated: 25/07/2026, 16:22:36
1class Solution {
2    public int finalPositionOfSnake(int n, List<String> commands) {
3
4        int row = 0;
5        int col = 0;
6
7        for (String command : commands) {
8
9            switch (command) {
10                case "UP":
11                    row--;
12                    break;
13
14                case "DOWN":
15                    row++;
16                    break;
17
18                case "LEFT":
19                    col--;
20                    break;
21
22                case "RIGHT":
23                    col++;
24                    break;
25            }
26        }
27
28        return row * n + col;
29    }
30}