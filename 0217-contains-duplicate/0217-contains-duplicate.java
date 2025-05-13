class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(nums[i])) {
                numSet.add(nums[i]);
                // System.out.println(nums[i]);
            } else {
                return true;
            }
        }

        return false;
    }
}