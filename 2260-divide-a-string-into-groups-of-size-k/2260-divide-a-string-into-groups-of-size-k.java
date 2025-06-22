class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> l = new ArrayList<>();
        for(int i = 0; i < s.length(); i += k){
            String str = s.substring(i,Math.min(i+k,s.length()));
            if (str.length() < k) {
                int rem = k - str.length();
                for (int j = 0; j < rem; j++) {
                    str += fill;
                }
            }
            l.add(str);
        }
        return l.toArray(new String[0]);

    }
}