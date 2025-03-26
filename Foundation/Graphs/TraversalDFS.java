package Foundation.Graphs;

import java.util.ArrayList;

public class TraversalDFS {

    public static class Edge {
        public int src;
        public int dest;
        public int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }

    // Given Graph

    /*
     * Bidirectional
     * 
     * 0 -> 1 => 5
     * 
     * 1 -> 0 => 5
     * 1 -> 2 => 1
     * 1 -> 3 => 3
     * 
     * 2 -> 1 => 1
     * 2 -> 4 => 2
     * 2 -> 3 => 1
     * 
     * 3 -> 1 => 3
     * 3 -> 2 => 3
     * 
     * 4 -> 2 => 2
     * 
     * 
     */

    public static void dfsTraversal(ArrayList<ArrayList<Edge>> graph, int current, boolean[] visited) {
        System.out.print(current + " => ");
        visited[current] = true;

        for (int i = 0; i < graph.get(current).size(); i++) {
            Edge edg = graph.get(current).get(i);
            if(!visited[edg.dest]) {
                dfsTraversal(graph, edg.dest, visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(); // Single Array List

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>()); // Each Index Contains a Seperate Array List
        }

        // 0-th index
        graph.get(0).add(new Edge(0, 1, 1)); // first get the index then add

        // 1-st index
        graph.get(1).add(new Edge(1, 0, 5));
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(1).add(new Edge(1, 3, 3));

        // 2-nd index
        graph.get(2).add(new Edge(2, 1, 1));
        graph.get(2).add(new Edge(2, 4, 2));
        graph.get(2).add(new Edge(2, 3, 1));

        // 3-rd index
        graph.get(3).add(new Edge(3, 1, 3));
        graph.get(3).add(new Edge(3, 2, 3));

        // 4-th vertex
        graph.get(4).add(new Edge(4, 2, 2));

        boolean[] visited = new boolean[V];
        dfsTraversal(graph, 0, visited);
    }
}
