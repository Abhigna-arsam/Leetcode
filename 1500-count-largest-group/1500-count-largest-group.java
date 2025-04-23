class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; 
        int maxCount = 0;

        
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            count[sum]++;
            maxCount = Math.max(maxCount, count[sum]); 
        }

        int cnt = 0;
        for (int i = 1; i < count.length; i++) {
            if (count[i] == maxCount) {
                cnt++;
            }
        }

        return cnt;
    }

    private int digitSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}