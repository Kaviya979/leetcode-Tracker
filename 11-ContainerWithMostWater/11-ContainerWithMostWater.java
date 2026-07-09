// Last updated: 09/07/2026, 15:11:42
class Solution {
    public int maxArea(int[] height) {
     int i = 0;
     int j = height.length - 1;
     int ans = 0;  
     while(i < j){
     int h = Math.min(height[i], height[j]);
     int w = j-i;
     int area = h * w;
     if(area > ans){
        ans = area;
     }
     if(height[i] < height [j]){
        i++;
     }
        else{
            j--;   
        }
    }
    return ans;
    }
}