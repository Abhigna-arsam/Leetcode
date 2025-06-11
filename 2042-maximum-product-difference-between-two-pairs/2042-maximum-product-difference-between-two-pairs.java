class Solution {
    public int maxProductDifference(int[] nums) {
        int fL = Integer.MIN_VALUE, sL = Integer.MIN_VALUE;
        int fS = Integer.MAX_VALUE, sS=Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>fL){
                sL = fL;
                fL = nums[i];
            }
            else if(nums[i]>sL){
                sL = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<fS){
                sS = fS;
                fS = nums[i];
            }
            else if(nums[i]<sS){
                sS = nums[i];
            }

        }
        return (fL*sL)-(fS*sS);
        
    }
}