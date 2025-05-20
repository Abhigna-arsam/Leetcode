class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        // Step 1: Make difference array using queries   
        // Step 2: Compute cumulative effect on each index 
        // Step 3: Check if each value can reach 0
        int n = nums.length;
        int[] diff = new int[n];
        for (int[] q : queries) {
            int start = q[0];
            int end = q[1];
            diff[start] += 1;
            if (end + 1 < n) {
                diff[end + 1] -= 1;
            }
        }

        int[] res = new int[n];
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += diff[i];
            res[i] = cumSum;
            if (res[i] < nums[i]) {
                return false;
            }
        }

        return true;
    }
}