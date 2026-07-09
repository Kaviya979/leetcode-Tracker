// Last updated: 09/07/2026, 15:08:44
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
       HashMap <Integer , Integer > map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        int m = n/3;
        for(Map.Entry <Integer,Integer> en:map.entrySet()){
            if(en.getValue()>m) ans.add(en.getKey());
        }
        return ans;
    }
}