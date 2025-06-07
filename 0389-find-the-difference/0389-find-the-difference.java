class Solution {
    public char findTheDifference(String s, String t) {
        char sum = 0;
        for(char ch : s.toCharArray()){
            sum^=ch;
        }
        for(char ch : t.toCharArray()){
            sum^=ch;
        }
        return sum;

    }
}