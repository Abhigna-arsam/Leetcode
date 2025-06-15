class Solution {
    public int alternatingSubarray(int[] nums) {
        int l = 0, r = 0;
        int n = nums.length;
        int maxLen =-1;
        while(l<n-1){
            if(nums[l+1]-nums[l]!=1){
                l++;
                continue;
            }
            r = l+1;
            int t = 1;
            while(r+1<n && nums[r]-nums[r+1]==t){
                t*=-1;
                r++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
            l++;

        }
        return maxLen;
    }
}