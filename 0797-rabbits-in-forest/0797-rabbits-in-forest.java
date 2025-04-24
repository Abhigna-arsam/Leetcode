class Solution {
    public int numRabbits(int[] answers) {
        int freq[] = new int[1000];
        for(int ans: answers){
            freq[ans]++;
        }
        int rabbit = 0;
        for (int x = 0; x < 1000; x++) {
            if (freq[x] > 0) {
                int gSize = x + 1;
                int gCount = (int)(freq[x]) / gSize;
                int rem = (freq[x]) % gSize;
                if(rem!=0) gCount++;
                rabbit += gCount * gSize;
            }
        }

        return rabbit;
    }
}