class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int windowLen = wordLen * wordCount;

        // Build the frequency map of the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Try all possible starting positions within word length offsets
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;
            Map<String, Integer> seenMap = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                // Check if word is part of the given words
                if (wordMap.containsKey(word)) {
                    seenMap.put(word, seenMap.getOrDefault(word, 0) + 1);

                    // If seen too many times, shrink from the left
                    while (seenMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seenMap.put(leftWord, seenMap.get(leftWord) - 1);
                        left += wordLen;
                    }

                    // If window size matches, it's a valid index
                    if (right - left == windowLen) {
                        result.add(left);
                    }
                } else {
                    // Reset if word not in list
                    seenMap.clear();
                    left = right;
                }
            }
        }

        return result;
    }
}