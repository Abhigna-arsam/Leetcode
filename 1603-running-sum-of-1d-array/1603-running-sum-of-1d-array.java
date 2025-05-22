class Solution {
    public int[] runningSum(int[] nums) {
        int pSum=0;
        for(int i = 0; i<nums.length ; i++){
            pSum +=nums[i];
            nums[i]=pSum;
        }
        return nums;
    }
}