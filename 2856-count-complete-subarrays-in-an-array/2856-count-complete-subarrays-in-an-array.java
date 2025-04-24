class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> totalSet = new HashSet<>();
        for(int num : nums){
            totalSet.add(num);
        }

        int tSize=totalSet.size();
        int cnt = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> complete = new HashSet<>();
            for (int j = i; j < n; j++) {
                complete.add(nums[j]);
                if(complete.size() == tSize){
                    cnt += (nums.length - j);
                    break;
                }
            }
        }
        return cnt;
    }
}