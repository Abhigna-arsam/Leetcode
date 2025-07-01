class Solution {
    public String removeDuplicateLetters(String s) {
        int[] idx = new int[26];
        boolean[] sn = new boolean[26];
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            idx[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sn[c - 'a']) continue; 
            while (!st.isEmpty() && c < st.peek() && idx[st.peek() - 'a'] > i) {
                sn[st.pop() - 'a'] = false;
            }

            st.push(c);
            sn[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : st) sb.append(ch);
        return sb.toString();
    }
}