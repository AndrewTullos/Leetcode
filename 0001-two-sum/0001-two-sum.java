class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int remainder = target - current;

            if (map.containsKey(remainder)) {
                return new int[] { map.get(remainder), i };
            } 

            map.put(nums[i], i);
        
        }

        return null;
    }
}