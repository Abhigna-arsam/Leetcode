class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int ans = 0;
        int MAXZ = 200;
        for (int l = 0; l < n; l++) {
            int zeros = 0;
            int ones = 0;
            for (int r = l; r < n; r++) {
                if (s.charAt(r) == '0') {
                    zeros++;
                    if (zeros > MAXZ) break;     
                } else {
                    ones++;
                }
                if (ones >= zeros * zeros) {
                    ans++;
                }
            }
        }
        return ans;
    }
}