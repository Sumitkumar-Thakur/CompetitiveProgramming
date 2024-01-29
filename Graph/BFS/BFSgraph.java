import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Traversal of the given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        boolean[] vis = new boolean[V];
        vis[0] = true;
        while (!queue.isEmpty()) {
            Integer currNode = queue.poll();
            bfs.add(currNode);
            for (int it : adj.get(currNode)) {
                if (!vis[it]) {
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
