// Last updated: 09/07/2026, 15:07:25
class Solution {
    public int[] dailyTemperatures(int[] num) {
        Stack<Integer>stack = new Stack<>();
        int n = num.length;
        int[] arr = new int[n];
        Arrays.fill(arr,0);
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && num[stack.peek()]<num[i]){
                int id = stack.pop();
                arr[id]=i-id;
            }
            stack.push(i);
        }

        return arr;
    }
}