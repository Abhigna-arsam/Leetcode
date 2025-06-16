class Solution {
    public int maximumDifference(int[] nums) {
         int n = nums.length;
        int ans = -1, min = nums[n-1];
       
        for(int i = n-2; i>=0; i--){
            if(nums[i]<min){
                ans = Math.max(ans, min-nums[i]);
            }
            else{
                min = nums[i];
            }
        }
        return ans;
    }
}