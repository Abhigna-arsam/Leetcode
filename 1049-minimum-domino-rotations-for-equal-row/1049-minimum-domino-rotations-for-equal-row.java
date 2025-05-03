class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int minR = Integer.MAX_VALUE;

        for (int x = 1; x <= 6; x++) {
            int rTop = 0;
            int rBottom = 0;
            int i = 0;

            for (; i < tops.length; i++) {
                if (tops[i] != x && bottoms[i] != x) {
                    break;
                }
                if (tops[i] != x) rTop++;
                if (bottoms[i] != x) rBottom++;
            }

            if (i == tops.length) {
                minR = Math.min(minR, Math.min(rTop, rBottom));
            }
        }

        return minR == Integer.MAX_VALUE ? -1 : minR;
    }
}