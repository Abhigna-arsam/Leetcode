class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n];
        int cnt = 0;

        for(int i =0; i<n; i++){
            boolean p = false;
            for(int j = 0; j<n; j++){
                if(!used[j] && fruits[i]<=baskets[j]){
                    used[j] = true;
                    p = true;
                    break;

                }
            }
            if (!p) {
                cnt++;
            }
            
        } 
        return cnt;

        
    }
}