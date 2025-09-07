class Solution {
    public int findClosest(int x, int y, int z) {
        int da=Math.abs(x-z);
        int dy = Math.abs(y-z);
        if(da>dy) return 2;
        else if(da<dy) return 1;
        return 0;
        
    }
}