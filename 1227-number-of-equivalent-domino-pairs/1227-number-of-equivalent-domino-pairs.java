class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int m = dominoes.length;
        int[] count = new int[100];
        int cnt = 0;
        for(int[] d : dominoes){
            int a = d[0], b = d[1];
            int sum = Math.min(a,b)*10+Math.max(a,b);
            cnt+=count[sum];
            count[sum]++;
        }

        return cnt;
    }
}