class Solution {
    public int buyChoco(int[] prices, int money) {
        // Arrays.sort(prices);
        int minP = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;
        for(int p : prices){
            if(p<minP){
                sMin=minP;
                minP=p;
            }
            else{
                sMin=Math.min(sMin,p);
            }
        }
        int sum = minP+sMin;
        if(sum > money){
            return money;
        }
        
        return money-sum;
    }
}