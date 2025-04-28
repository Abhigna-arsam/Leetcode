class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt = 0;
        int n = nums.length; 
        long sum =0;  
        int j = 0;    
        for(int i = 0; i<n ; i++){
            sum+=nums[i] ;
            // for(int j =i; j<n ; j++){
            //     int len = j-i+1;
            //     sum+=nums[j];
            //     if(sum * len <k){
            //         cnt++;
            //     }

            // }
            
            while(j<=i && sum*(i-j+1)>=k){
                sum-=nums[j];
                j++;
            }
            cnt+=(i-j+1);

        } 
        return cnt;
    }
}