class Solution {
    public int lengthAfterTransformations(String s, int t) {

        int MOD = (int)1e9 + 7, ans = 0;
        long[] count = new long[26];
        for (int c : s.toCharArray())
        	count[c - 'a']++;
        for (; t >= 26; t -= 26) {
        	long z = count[25];
        	for (int i = 25; i > 0; i--)
        		count[i] = (count[i] + count[i - 1]) % MOD;
        	count[0] = (count[0] + z) % MOD;
        	count[1] = (count[1] + z) % MOD;
        }
        for (int i = 0; i < 26; i++)
        	ans = (int)((ans + count[i]) % MOD);
        for (int i = 26 - t; i < 26; i++)
        	ans = (int)((ans + count[i]) % MOD);
        return ans;
        // final int MOD = 1_000_000_007;
        // long freq[] = new long[26];
        // for(char ch : s.toCharArray()){
        //     freq[ch-'a']++;
        // }
        
        // while(t-->0){
        //     long[] freqU = new long[26];
        //     for(int i = 0; i<26 ; i++){
        //         if(i == 25){
        //             freqU[0] = (freqU[0]+freq[25])% MOD;
        //             freqU[1] = (freqU[1]+freq[25])% MOD;
        //         }

        //         else{
        //             freqU[i+1] = (freqU[i+1]+freq[i])% MOD;
        //         }
        //     }
        //     freq= freqU;
        // }
        // long sum = 0;
        // for(int i = 0; i<26; i++){
        //     sum= (sum +freq[i])% MOD;
        // }
        // return (int)sum;
    }
}