class Solution {
public:
    string largestGoodInteger(string num) {
        char ans = ' ';
        int n = num.length();
        for(int i = 2 ; i<n; i++){
            if(num[i]==num[i-1] && num[i-1]==num[i-2]){
                ans = max(ans,num[i]);
            }
        }
        if(ans==' '){
            return "";
        }
        return string(3,ans);
    }
};