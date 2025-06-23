class Solution {
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int num : nums){
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }
        for (int freq : mpp.values()) {
            if (isPrime(freq)) {
                return true;
            }
        }
        return false;
    }
}