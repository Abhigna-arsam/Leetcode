class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> sad = new HashSet<>(); 
        for (int[] f : friendships) {
            int u = f[0] - 1;
            int v = f[1] - 1;
            Set<Integer> ls = new HashSet<>();
            for (int l : languages[u]) ls.add(l);
            boolean talk = false;
            for (int l : languages[v]) {
                if (ls.contains(l)) {
                    talk = true;
                    break;
                }
            }
            if (!talk) {
                sad.add(u);
                sad.add(v);
            }
        }
        int[] cnt = new int[n + 1];
        int max = 0;
        for (int u : sad) {
            for (int l : languages[u]) {
                cnt[l]++;
                max = Math.max(max, cnt[l]);
            }
        }
        return sad.size() - max;
    }
}