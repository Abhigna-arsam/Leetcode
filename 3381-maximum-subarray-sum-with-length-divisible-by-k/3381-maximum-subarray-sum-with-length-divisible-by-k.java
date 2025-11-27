class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long prefix = 0;
        long ans = Long.MIN_VALUE;

        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);
        minPrefix[0] = 0; 

        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int rem = (i + 1) % k;

            if (minPrefix[rem] != Long.MAX_VALUE) {
                ans = Math.max(ans, prefix - minPrefix[rem]);
            }

            minPrefix[rem] = Math.min(minPrefix[rem], prefix);
        }

        return ans;
    }
}