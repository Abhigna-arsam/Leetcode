class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for (int num : nums1) s1.add(num);
        for (int num : nums2) s2.add(num);

        List<Integer> d1 = new ArrayList<>();
        List<Integer> d2 = new ArrayList<>();

        for(int num :s1){
            if(!s2.contains(num)){
                d1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                d2.add(num);
            }
        }
        res.add(d1);
        res.add(d2);
        return res;

    }
}