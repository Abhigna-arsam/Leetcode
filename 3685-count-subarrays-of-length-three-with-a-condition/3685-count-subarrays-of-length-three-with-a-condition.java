class Solution {
    public int countSubarrays(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for(int i = 0; i<n-2; i++){            
            int sum = nums[i] + nums[i+2];
            if(nums[i+1] == sum * 2){
                cnt++;
            }
        }
        return cnt;
    }
}