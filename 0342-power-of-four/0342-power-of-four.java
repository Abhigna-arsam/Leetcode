class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        double val = Math.log(n) / Math.log(4);
        return val == (int) val;
    }
}