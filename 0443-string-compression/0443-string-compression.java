class Solution {
    public int compress(char[] chars) {
        // StringBuilder sb = new StringBuilder();
        int idx=0;
        int i = 0;

        while(i<chars.length){
            char ch = chars[i];
            int cnt = 0;
            while(i<chars.length && chars[i]==ch){
                cnt++;
                i++;
            }
            chars[idx++] = ch;

            if (cnt > 1) {
                for (char c : String.valueOf(cnt).toCharArray()) {
                    chars[idx++] = c;
                }
            }
        }
        return idx;

    }
}