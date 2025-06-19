class Solution {
    public String reversePrefix(String word, char ch) {
        int i = 0;
        int j = word.indexOf(ch);
        
        char[] nch = word.toCharArray();
        while (i < j) {
            char temp = nch[i];
            nch[i] = nch[j];
            nch[j] = temp;
            i++;
            j--;
        }
        
        return new String(nch);
    }
}