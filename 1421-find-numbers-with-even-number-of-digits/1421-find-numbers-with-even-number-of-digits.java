class Solution {
    public int findNumbers(int[] nums) {
        int cnt =0;
        
        for(int num : nums){
            cnt+=isEven(num);
        }
        return cnt;
    }

    public int isEven(int n){
        int rem = 0, dg=0;
        while(n>0){    
            n/=10;  
            dg++;  
        }
        return (dg % 2 == 0) ? 1 : 0;    
    }

}