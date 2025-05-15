class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
            int currentNum = nums[i];
            int remainder = target - currentNum;

            if (map.containsKey(remainder)) {
                return new int[] { map.get(remainder), i };
            } else {
                map.put(currentNum, i);
            }
        }

        return null;
    }
}