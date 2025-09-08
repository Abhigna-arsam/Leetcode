class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int s = intervals[0][0], e=intervals[0][1];int k=0;
        int[][] ans = new int[n][2];
        for(int i =1; i<n; i++){
            if(intervals[i][0]<=e) e=Math.max(e,intervals[i][1]);
            else {
            
            ans[k][0]=s;
            ans[k][1]=e;
            k++;
            s=intervals[i][0]; e=intervals[i][1];
            }
        }
        ans[k][0]=s;
        ans[k][1]=e;
        k++;   
        return Arrays.copyOf(ans, k);
    }
}