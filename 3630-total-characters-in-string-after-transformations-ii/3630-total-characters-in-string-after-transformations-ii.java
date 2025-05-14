class Solution {
    public int lengthAfterTransformations(String s, int t, List<Integer> nums) {
        
        int MOD = 1_000_000_007;
        int[][] T = new int[26][26];

        for (int i = 0; i < 26; i++) {
            int len = nums.get(i);
            for (int j = 1; j <= len; j++) {
                int to = (i + j) % 26;
                T[i][to]++;
            }
        }


        long[][] mat = new long[26][26];
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < 26; j++)
                mat[i][j] = T[i][j];

        long[][] Tt = matrixPower(mat, t, MOD);

        long[] freq = new long[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        long[] result = new long[26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                result[j] = (result[j] + freq[i] * Tt[i][j]) % MOD;
            }
        }

        long total = 0;
        for (long val : result) {
            total = (total + val) % MOD;
        }

        return (int) total;
    }

    private long[][] matrixPower(long[][] base, int exp, int MOD) {
        int n = base.length;
        long[][] result = new long[n][n];

        for (int i = 0; i < n; i++)
            result[i][i] = 1;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = multiply(result, base, MOD);
            base = multiply(base, base, MOD);
            exp >>= 1;
        }

        return result;
    }

    private long[][] multiply(long[][] A, long[][] B, int MOD) {
        int n = A.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                for (int j = 0; j < n; j++) {
                    res[i][j] = (res[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }
        return res;

    }
}