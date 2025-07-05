class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> mp = new HashMap<>();
         for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int res = -1;

        for (int i : mp.keySet()) {
            if (mp.get(i) == i) {
                res = Math.max(res, i);
            }
        }
        return res;
    }
}