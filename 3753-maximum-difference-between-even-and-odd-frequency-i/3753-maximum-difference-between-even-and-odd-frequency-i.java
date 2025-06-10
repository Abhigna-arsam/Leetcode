class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        int mO = Integer.MIN_VALUE;
        int mE = Integer.MAX_VALUE;
        boolean hO = false;
        boolean hE = false;

        for(char c : s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

        for(int cnt : freq.values()){
            if(cnt%2==0){
                mE = Math.min(mE,cnt);
                hE = true;
            }
            else{
                mO=Math.max(mO,cnt);
                hO=true;
                
            }
        }

        if(!hO || !hE){
            return 0;
        }
        return mO - mE;
    }
}