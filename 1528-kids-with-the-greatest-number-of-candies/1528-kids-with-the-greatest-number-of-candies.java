class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int i : candies){
            if(max<i){
                max=i;
            }
        }
        for (int c : candies) {
            l.add(c + extraCandies >= max);
        }
        return l;
    }
}