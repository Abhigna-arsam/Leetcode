class Solution {
public:
    string answerString(string word, int numFriends) {
        if(numFriends==1) return word;
        string res = "";
        int n = word.length();
        int maxlen = n-numFriends+1;

        for (int i = 0; i < n; i++) {
            res = max(res,word.substr(i,maxlen));
        }
        return res;
    }
};