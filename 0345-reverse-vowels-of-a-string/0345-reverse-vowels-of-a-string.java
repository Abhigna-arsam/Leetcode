class Solution {
    public String reverseVowels(String s) {
        int l = 0; int r = s.length()-1;
        char[] ch = s.toCharArray();
        while(l<=r){
            while (l < r && !isVowel(ch[l])) l++;
            while (l < r && !isVowel(ch[r])) r--;
            char t = ch[l];
            ch[l] = ch[r];
            ch[r] = t;

            l++;
            r--;
        }
        return new String(ch);

    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}