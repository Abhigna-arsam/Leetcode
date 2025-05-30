class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        int idx = 0;
        int num = 1;
        if(n%2==1){
            res[idx]=0;
            idx++;
        }
        while(idx < n){
            res[idx]=num;
            res[idx+1]=-num;

            idx+=2;
            num++;
        }
        return res;
    }
}