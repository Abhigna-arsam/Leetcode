class Solution {
    public int specialTriplets(int[] nums) {
        int MOD = 1_000_000_007;
        Map<Integer, Integer> rightC = new HashMap<>();
        Map<Integer, Integer> leftC = new HashMap<>();
        for (int num : nums) {
            rightC.put(num, rightC.getOrDefault(num, 0) + 1);
        }

        long totalT = 0;

        for (int j = 0; j < nums.length; j++) {
            int curr = nums[j];
            rightC.put(curr, rightC.get(curr) - 1);  
            int dVal = curr * 2;

            int left = leftC.getOrDefault(dVal, 0);
            int right = rightC.getOrDefault(dVal, 0);

            totalT = (totalT + (1L * left * right) % MOD) % MOD;

            leftC.put(curr, leftC.getOrDefault(curr, 0) + 1); // add current to left
        }

        return (int) totalT;
    }
}