class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long cnt = 0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                cnt += 1;
                res += cnt;
            }
            else{
                cnt = 0;
            }
        }
        return res;
    }
}