class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[]= new int[2*n];
        int i = 0;
        int idx=0;
        while(i<ans.length){
            ans[i]=nums[idx];
            i++;
            idx++;
            if(i==nums.length){
                idx=0;
            }

        }
        return ans;
    }
}