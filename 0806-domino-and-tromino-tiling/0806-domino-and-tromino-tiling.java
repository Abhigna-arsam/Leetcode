class Solution {
    public int numTilings(int n) {
        final int MOD = 1_000_000_007;

        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        long[] nums = new long[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 2;

        for (int i = 3; i <= n; i++) {
            nums[i] = (2 * nums[i - 1] + nums[i - 3]) % MOD;
        }

        return (int) nums[n];
    }
}