class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int i=0, j=1, k=nums.length-1,l=nums.length-2;
        return (nums[k]*nums[l])-(nums[i]*nums[j]);
        
    }
}