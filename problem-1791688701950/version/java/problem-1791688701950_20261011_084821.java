// Last updated: 11/10/2026, 08:48:21
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3      int a = 0, b = 1;
4        while(true){
5            int c = a + b;
6            int sum = a + b + c;
7            if(sum == n){
8                return true;
9            }
10            if(sum > n){
11                return false;
12            }
13            a = b;
14            b = c;
15        }
16    }
17}