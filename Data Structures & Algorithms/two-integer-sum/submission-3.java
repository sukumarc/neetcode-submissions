class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        int ans[] = new int[2];
        int length = nums.length;

        for(int i =0; i < length; i++){
            int find = target-nums[i];
            if(sumMap.containsKey(find)){
                 ans[0] = sumMap.get(find);
                 ans[1] = i;
                return ans;
            } else{
                sumMap.put(nums[i], i);
                
            }
        }

        return ans;
        
    }
}
