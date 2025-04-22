class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] str1 = strs[0].toCharArray();
        char[] str2 = strs[strs.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str2.length; i++){
            if (i >= str1.length || str1[i] != str2[i]) {
                break;
            }
            sb.append(str2[i]);
        }
        return sb.toString();
        
    }
}