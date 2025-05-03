class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        Set<Integer> rSet = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) {
                rSet.add(n);
            }
        }

        int[] res = new int[rSet.size()];
        int i = 0;
        for (int num : rSet) {
            res[i++] = num;
        }

        return res;
    
    }
}