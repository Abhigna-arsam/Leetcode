class Solution {
    Set<String> exact = new HashSet<>();            
    Map<String, String> caseM = new HashMap<>();            
    Map<String, String> vowelM = new HashMap<>();           

    private String toLower(String s) {
        return s.toLowerCase();
    }

    private String maskVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private String checkForMatch(String query) {
        if (exact.contains(query)) {
            return query;
        }
        String lowerQuery = toLower(query);
        if (caseM.containsKey(lowerQuery)) {
            return caseM.get(lowerQuery);
        }
        String maskedQuery = maskVowels(lowerQuery);
        if (vowelM.containsKey(maskedQuery)) {
            return vowelM.get(maskedQuery);
        }
        return "";
    }

    public String[] spellchecker(String[] wordlist, String[] queries) {
        exact.clear();
        caseM.clear();
        vowelM.clear();
        for (String word : wordlist) {
            exact.add(word);
            String lowerWord = toLower(word);
            caseM.putIfAbsent(lowerWord, word); 
            String maskedWord = maskVowels(lowerWord);
            vowelM.putIfAbsent(maskedWord, word);
        }
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = checkForMatch(queries[i]);
        }
        return result;
    }
}