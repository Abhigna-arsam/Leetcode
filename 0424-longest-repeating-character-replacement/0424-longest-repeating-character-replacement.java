class Solution {
    public int characterReplacement(String s, int k) {
        int l =0, r=0;
        int n = s.length();
        int[] map=new int[26];
        int maxC = 0;int maxi =0;
        int maxLen = 0;
        while(r<n){
            map[s.charAt(r)-'A']++;

            maxC = Math.max(maxC, map[s.charAt(r)-'A']);

            while((r-l+1)-maxC>k){
                 map[s.charAt(l)-'A']--;
                 l++;
            }
            maxLen = Math.max(maxLen,(r-l+1));
            r++;
        }
        return maxLen;
    }
}