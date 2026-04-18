/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) {
            return null;

        }

        HashMap<Node , Node > map = new HashMap<>();

        bfs(node , map);

        return map.get(node);
        
    }

    private void bfs(Node start , HashMap<Node , Node> map){
        Queue<Node>  queue = new LinkedList<>();

        queue.add(start);

        map.put(start , new Node(start.val));
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            for(Node neighbor : curr.neighbors){
                if(!map.containsKey(neighbor)){
                    map.put(neighbor , new Node(neighbor.val)) ;
                    queue.add(neighbor);
                }
                map.get(curr).neighbors.add(map.get(neighbor));
            }
        }
    }
}