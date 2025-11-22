class Solution {
    public int pivotInteger(int n) {
        int sum=0;
       for(int i =1; i<=n; i++){
        sum+=i;
       } 
       int lsum=0, rsum=0;
       for(int i =1; i<=n; i++){
        lsum+=i;
        int rSum = sum-(lsum-i);
        if(lsum==rSum){
            return i;
        }
       }
       return -1;
    }
}