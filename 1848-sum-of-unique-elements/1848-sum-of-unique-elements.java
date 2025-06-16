class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum =0;
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int i=0;i<nums.length;i++) {
            if(mp.get(nums[i])==1) {
                sum += nums[i];
            }
        }
        return sum;

    }
}