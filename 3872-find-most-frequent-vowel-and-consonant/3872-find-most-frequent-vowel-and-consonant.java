class Solution {
    public int maxFreqSum(String s) {
        int max = 0;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        String vowels = "aeiou";
        int maxV = 0, maxC = 0;

        for (int i = 0; i < 26; i++) {
            char c = (char)(i + 'a');
            if (freq[i] > 0) {
                if (vowels.indexOf(c) != -1) {
                    maxV = Math.max(maxV, freq[i]);
                } else {
                    maxC = Math.max(maxC, freq[i]);
                }
            }
        }
        return maxV+maxC;
    
    }
}