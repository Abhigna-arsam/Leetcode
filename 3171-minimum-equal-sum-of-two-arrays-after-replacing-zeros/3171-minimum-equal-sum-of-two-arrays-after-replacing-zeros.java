class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long nsum1=0, zero1 = 0, nsum2=0, zero2=0;
        for(long i : nums1){
            if(i==0) zero1++;
            else nsum1+=i;
        }
        for(long i : nums2){
            if(i==0) zero2++;
            else nsum2+=i;
        }

        long sum1= nsum1+zero1;
        long sum2= nsum2+zero2;
        long ans = Math.max(sum1,sum2);

        if((zero1 ==0 && sum1 < sum2 ) || (zero2 ==0 && sum1 > sum2 ) ) return -1;
        return ans;
    }
}