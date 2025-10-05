class Solution {
    public int longestSubsequence(int[] nums) {
        int res = 0; 
        int n = nums.length;

        for (int num : nums) {
            res ^= num; 
        }

        if (res != 0) {
            return n; 
        }
        boolean allZero = true;
        for (int num : nums) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }

        return allZero ? 0 : n - 1;
    }
}