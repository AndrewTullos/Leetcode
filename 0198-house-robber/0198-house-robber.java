class Solution {
    public int rob(int[] nums) { 
    //     int even = 0;
    //     int odd = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (i % 2 == 0) {
    //             even += nums[i];
    //         }
    //         if (i % 2 == 1) {
    //             odd += nums[i];
    //         }
    //     }
    //     return Math.max(even, odd);
    // }

    if (nums.length == 0) return 0;

    int memo[] = new int[nums.length+1];
    memo[0] = 0;
    memo[1] = nums[0];

    for (int i = 1; i < nums.length; i++) {
        memo[i+1] = Math.max(memo[i], memo[i-1] + nums[i]);
    }

    return memo[nums.length];
    }
}