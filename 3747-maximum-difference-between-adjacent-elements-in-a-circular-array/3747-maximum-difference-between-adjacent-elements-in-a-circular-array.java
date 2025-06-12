class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int m = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int l = (i + 1) % n; 
            int diff = Math.abs(nums[i] - nums[l]);
            m = Math.max(m, diff);
        }

        return m;
    }
}