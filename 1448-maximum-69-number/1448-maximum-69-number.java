class Solution {
    public int maximum69Number (int num) {
        // String num1 = Integer.toString(num);
        // num1 = num1.replaceFirst("6", "9");
        // return Integer.parseInt(num1);
        int p=1;
        int inc=0;
        int maxInc = 0;
        int temp = num;

        while(temp>0){
            int dig = temp%10;
            if(dig==6){
                inc = 3*p;
                if(inc>maxInc){
                    maxInc=inc;
                }

            }
            temp/=10;
            p*=10;
        }
        return num+maxInc;

    }
}