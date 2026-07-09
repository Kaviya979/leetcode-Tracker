// Last updated: 09/07/2026, 15:05:48
class Solution {
    public int accountBalanceAfterPurchase(int PA) {
        if(PA%10<=4) return 100-(PA/10)*10;
        else return 100-((PA/10)+1)*10;
        
    }
}