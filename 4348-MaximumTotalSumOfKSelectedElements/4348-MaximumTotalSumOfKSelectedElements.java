// Last updated: 09/07/2026, 15:05:35
import java.util.Scanner;
       class Solution{
           public long maxSum(int[] nums, int k, int mul){
               Arrays.sort(nums);
               int n = nums.length;
               long totalSum = 0;
               for(int i = 0; i < k;i++){
                   long currentNum = nums[n - 1-i];
                   long currentmul = mul-i;
                   totalSum += Math.max(currentNum,currentNum * currentmul);
               }
               return totalSum;
           }
       }