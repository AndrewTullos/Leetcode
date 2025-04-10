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

    int dp[] = new int[nums.length+1];
    dp[0] = 0;
    dp[1] = nums[0];

    for (int i = 1; i < nums.length; i++) {
        dp[i+1] = Math.max(dp[i], dp[i-1] + nums[i]);
    }

    return dp[nums.length];
    }
}