class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);

            int current = nums[i];
            int complement = target - current;

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(current, i);
        }

        return null;
    }
}