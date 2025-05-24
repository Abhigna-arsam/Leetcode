class Solution {
    private static final int MOD = 1000000007;
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;

        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        int[] depth = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        depth[1] = 0;
        
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int nei : graph[node]) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    depth[nei] = depth[node] + 1;
                    maxDepth = Math.max(maxDepth, depth[nei]);
                    queue.offer(nei);
                }
            }
        }
        
        if (maxDepth == 0) return 0;
        return modPow(2, maxDepth - 1, MOD);
    }
    
    private int modPow(int base, int exp, int mod) {
        long result = 1;
        long b = base;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * b) % mod;
            }
            b = (b * b) % mod;
            exp >>= 1;
        }
        return (int) result;
    }
    
}