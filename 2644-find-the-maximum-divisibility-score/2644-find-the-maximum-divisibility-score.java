class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = -1;
        int ans = Integer.MAX_VALUE;

        for (int d : divisors) {
            int score = 0;
            for (int n : nums) {
                if (n % d == 0) score++;
            }
            if (score > maxScore) {
                maxScore = score;
                ans = d;
            }
            else if (score == maxScore && d < ans) {
                ans = d;
            }

        }
        return ans;
        
    }
}