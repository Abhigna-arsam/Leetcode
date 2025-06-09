class Solution {
    public int maxProduct(int[] nums) {
        int i = nums.length-1, j=nums.length-2;
        Arrays.sort(nums);
        return (nums[i]-1)*(nums[j]-1);
    }
}