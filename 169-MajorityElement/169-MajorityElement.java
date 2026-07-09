// Last updated: 09/07/2026, 15:09:35
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n =nums.length;
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }
            int m = n/2;
            for(Map.Entry <Integer,Integer> en : map.entrySet()){
                if(en.getValue()>m)
                return en.getKey();
            }
            return 0 ;
        }
    }

