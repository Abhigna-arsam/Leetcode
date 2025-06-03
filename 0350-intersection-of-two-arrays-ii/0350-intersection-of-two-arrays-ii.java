class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();
        int i = 0; int j = 0, k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && (j<nums2.length)){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                l.add(nums1[i]);
                i++;
                j++;
                k++;
            }
            
        }
        int ans[] = new int[l.size()];
        for (i = 0; i < l.size(); i++)
            ans[i] = l.get(i);
        return ans;

    }
}