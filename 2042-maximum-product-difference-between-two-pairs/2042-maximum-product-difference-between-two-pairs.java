class Solution {
    public int maxProductDifference(int[] nums) {
        int fL = Integer.MIN_VALUE, sL = Integer.MIN_VALUE;
        int fS = Integer.MAX_VALUE, sS=Integer.MAX_VALUE;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>fL){
                sL = fL;
                fL = nums[i];
            }
            else{
                sL = Math.max(sL,nums[i]);
            }
            if(nums[i]<fS){
                sS = fS;
                fS = nums[i];
            }
            else{
                sS = Math.min(nums[i],sS);
            }

        }
        return (fL*sL)-(fS*sS);
        
    }
}