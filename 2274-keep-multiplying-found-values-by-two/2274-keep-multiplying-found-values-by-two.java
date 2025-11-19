class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i =0; i<nums.length; i++){
            if(check(nums,original)){
                original*=2;
            }
            else{
                break;
            }
        }
        return original;
    }
    public boolean check(int[] nums, int original) {
        for(int i =0; i<nums.length; i++){
            if(nums[i]==original){
                return true;
            }
        }
        return false;
    }
}