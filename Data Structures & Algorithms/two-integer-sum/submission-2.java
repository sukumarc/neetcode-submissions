class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
 int ans[] = new int[2];

        for(int i =0; i< nums.length; i++){
            if(sumMap.containsKey(target-nums[i])){
                 ans[0] = sumMap.get(target-nums[i]);
                 ans[1] = i;
                return ans;
            } else{
                sumMap.put(nums[i], i);
                
            }
        }

        return ans;
        
    }
}
