class Solution {
    public int[] shuffle(int[] nums, int n) {
       int xA[] = new int[2*n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            xA[idx++] = nums[i];     
            xA[idx++] = nums[i + n];
        }
     
        return xA;
    }
}