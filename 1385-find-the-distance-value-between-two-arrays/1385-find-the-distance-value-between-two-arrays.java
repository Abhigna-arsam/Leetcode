class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int m = arr1.length;
        int n = arr2.length;
        int cnt=0;
        for(int i =0; i<m; i++){
            boolean v = true;
            for(int j =0; j<n; j++){
                if(Math.abs(arr1[i]-arr2[j]) <= d){
                    v=false;
                    break;
                }
            }
            if(v){
                cnt++;
            }
        }
        return cnt;
    }
}