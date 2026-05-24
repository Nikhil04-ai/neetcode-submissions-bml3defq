class Solution {

    public boolean validTree(int n, int[][] edges) {

    
        if (edges.length != n - 1) {
            return false;
        }

        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

       
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();

            for (int neighbor : graph[node]) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        
        for (boolean v : visited) {
            if (!v) {
                return false;
            }
        }

        return true;
    }
}