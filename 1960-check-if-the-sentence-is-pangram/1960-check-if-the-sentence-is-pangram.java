class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean v[] = new boolean[26];

        for(int i = 0; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch>='a' && ch<='z'){
                v[ch-'a']=true;
            }
        }
        for(int i = 0; i<26; i++){
            if(v[i]==false){
                return false;
            }
        }
        return true;
        
    }
}