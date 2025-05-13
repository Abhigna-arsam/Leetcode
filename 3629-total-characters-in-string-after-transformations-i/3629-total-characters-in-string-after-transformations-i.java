class Solution {
    public int lengthAfterTransformations(String s, int t) {
        final int MOD = 1_000_000_007;
        long freq[] = new long[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        
        while(t-->0){
            long[] freqU = new long[26];
            for(int i = 0; i<26 ; i++){
                if(i == 25){
                    freqU[0] = (freqU[0]+freq[25])% MOD;
                    freqU[1] = (freqU[1]+freq[25])% MOD;
                }

                else{
                    freqU[i+1] = (freqU[i+1]+freq[i])% MOD;
                }
            }
            freq= freqU;
        }
        long sum = 0;
        for(int i = 0; i<26; i++){
            sum= (sum +freq[i])% MOD;
        }
        return (int)sum;
    }
}