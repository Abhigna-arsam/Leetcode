class Solution {
    public int longestOnes(int[] nums, int k) {
        int l =0, r=0;
        int n = nums.length;
        int maxi = 0;
        int zero = 0;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            r++;
            maxi = Math.max(maxi,r-l);
        }
        return maxi;
    }
}