class Solution {
    public int countCharacters(String[] words, String chars) {
        char[] aStr = new char[26];
        int res = 0;
        for(char ch : chars.toCharArray()){
            aStr[ch-'a']++;
        }

        for(String s : words){
            char[] wrd = new char[26];
            for(char ch : s.toCharArray()){
                wrd[ch-'a']++;
            }
            boolean fl = true;
            for (char ch : s.toCharArray()) {
                if (wrd[ch - 'a'] > aStr[ch - 'a']) {
                    fl = false;
                    break;
                }
            }

            if (fl) {
                res += s.length();
            }
        }
        return res;
    }
}