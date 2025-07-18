class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0;
        int r = n - 1;
        for(int i = n - 1; i >= 0; --i) {
            int s;
            if(Math.abs(nums[l]) < Math.abs(nums[r])) {
                s = nums[r];
                r--;
            } else {
                s = nums[l];
                l++;
            }
            res[i] = s*s;
        }
        return res;
    }
}