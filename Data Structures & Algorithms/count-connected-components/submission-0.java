class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n ; i++){
            graph.add(new ArrayList<>());
        }


        for(int [] edge : edges){
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);

        }

        boolean [] visited = new boolean[n];

        int count =0;

        for(int i =0;i<n ; i++){
            if(!visited[i]){
                bfs(graph , visited , i);
                count++;
            }
        }
        return count;

        
        
    }
    public void bfs(List<List<Integer>> graph , boolean [] visited , int startNode){
        Queue<Integer> queue = new LinkedList<>();
       
        queue.offer(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node + " ");


            for(int neighbor : graph.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }




    }
}
