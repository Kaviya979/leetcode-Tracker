// Last updated: 09/07/2026, 15:06:39
class Solution {
    public int numWaterBottles(int NB, int NE) {
        int drink=NB;
        int empty=NB;
        while(empty>=NE){
            int newD=empty/NE;
            drink+=newD;
            empty=(empty%NE)+newD;

        }
        return drink;
       
    }
}