// Last updated: 28/07/2026, 22:02:42
1class Solution {
2    public String getHint(String secret, String guess) {
3        
4        int bulls = 0;
5        
6        int[] secretCount = new int[10];
7        int[] guessCount = new int[10];
8        
9        // Find Bulls
10        for(int i = 0; i < secret.length(); i++) {
11            
12            if(secret.charAt(i) == guess.charAt(i)) {
13                bulls++;
14            }
15            else {
16                secretCount[secret.charAt(i) - '0']++;
17                guessCount[guess.charAt(i) - '0']++;
18            }
19        }
20        
21        // Find Cows
22        int cows = 0;
23        
24        for(int i = 0; i < 10; i++) {
25            cows += Math.min(secretCount[i], guessCount[i]);
26        }
27        
28        return bulls + "A" + cows + "B";
29    }
30}