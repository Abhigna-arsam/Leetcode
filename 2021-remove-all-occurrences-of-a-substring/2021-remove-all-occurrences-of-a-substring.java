class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int pos = sb.indexOf(part);
        while(pos>=0){
            sb.delete(pos, pos + part.length());
            pos=sb.indexOf(part);
        }
        return sb.toString();
    }
}