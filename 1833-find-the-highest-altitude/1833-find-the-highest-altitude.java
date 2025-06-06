class Solution {
    public int largestAltitude(int[] gain) {
        int[] pArr = new int[gain.length+1];
        int len = pArr.length;
        pArr[0]=0;
        for(int i = 1; i<len ; i++){
            pArr[i]=pArr[i-1]+gain[i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int i : pArr){
            if(i>max){
                max = i;
            }
        }

        return max;
        
    }
}