class Solution {
    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    private String convertToK(long num, int k) {
        if (num == 0) return "0";
        
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            res.append(num % k);
            num /= k;
        }
        return res.toString();
    }

    public long kMirror(int k, int n) {
        long sum = 0; int l=1;

        while(n>0){
            int half = (l+1)/2;
            long minLen = (long) Math.pow(10,half-1);
            long maxLen = (long)Math.pow(10,half)-1;

            for(long num = minLen; num<=maxLen; num++){
                String firstHalf = Long.toString(num);
                String secondHalf = new StringBuilder(firstHalf).reverse().toString();

                String full;
                if(l%2!=0){
                    full = firstHalf + secondHalf.substring(1);
                }
                else{
                    full = firstHalf + secondHalf;
                }

                long number = Long.parseLong(full);
                String str = convertToK(number,k);

                if(isPalindrome(str)){
                    sum+=number;
                    n--;
                    if (n == 0) {
                        return sum;
                    }
                } 
            }
            l++;

        }
        return sum;
    }
}