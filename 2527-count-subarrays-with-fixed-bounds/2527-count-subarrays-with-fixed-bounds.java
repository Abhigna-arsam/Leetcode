class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        
        long count = 0;
       //int c=-1;
        int min = -1;
        int max = -1;
        int lb=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==minK){
                min=i;
            }
            if(nums[i]==maxK){
                max=i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                lb=i;
            }
            if(min != -1 && max!=-1){
                int s=Math.min(min,max);
                
                int t=(s-lb);
                if(t>0){
                    count+=t;
                }
            }  
            
        }
        return count;
        
    }
}

