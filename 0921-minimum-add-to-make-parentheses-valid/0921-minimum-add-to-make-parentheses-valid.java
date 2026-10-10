class Solution {
    public int minAddToMakeValid(String s) {
        int min = 0;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                min++;
            } else {
                if (min > 0) {
                    min--;
                } else {
                    max++;
                }
            }
        }
        return min + max;
        
    }
}