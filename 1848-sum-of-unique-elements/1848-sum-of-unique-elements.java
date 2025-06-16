class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum =0;
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;

    }
}