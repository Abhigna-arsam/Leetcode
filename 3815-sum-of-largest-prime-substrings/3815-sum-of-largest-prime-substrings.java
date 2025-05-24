class Solution {
    
    public long sumOfLargestPrimes(String s) {
         
       Set<Long> setP = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                long num = Long.parseLong(sub);
                if (isPrime(num)) {
                    setP.add(num);
                }
            }
        }

        List<Long> sP = new ArrayList<>(setP);
        Collections.sort(sP,Collections.reverseOrder());

        long sum = 0;
        for (int i = 0; i < Math.min(3, sP.size()); i++) {
            sum += sP.get(i);
        }
        return sum;
    
    }
    public static boolean isPrime(long nS) {
            if (nS < 2) return false;
            if (nS == 2) return true;
            if(nS%2==0) return false;
            int sq = (int)Math.sqrt(nS);
            for (int i = 3; i<= sq; i+=2) {
                if (nS % i == 0) return false;
            }
            return true;
    }
    
}