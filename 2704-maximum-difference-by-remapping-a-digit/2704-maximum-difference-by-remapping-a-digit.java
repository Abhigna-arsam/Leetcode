class Solution {
    public int minMaxDifference(int num) {
        String max = Integer.toString(num);
        String min = max;
        int idx=0;

        for(int i = 0; i<max.length(); i++){
            if(max.charAt(i)!='9'){
                idx = i;
                break;
            }
        }
        if(idx<max.length()){
            char ch = max.charAt(idx);
            max = max.replace(ch,'9');
        }

        min = min.replace(min.charAt(0),'0');

        int mx = Integer.parseInt(max);
        int mn = Integer.parseInt(min);

        return mx-mn;
    }
}