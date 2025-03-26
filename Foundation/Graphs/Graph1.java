package Foundation.Graphs;

import java.util.ArrayList;

public class Graph1 {

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

    public static void printGraph(ArrayList<ArrayList<Edge>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            System.out.print("Node " + i + " => ");
            for (Edge edge : graph.get(i)) {
                System.out.print("(" + edge.src + ", " + edge.dest + ") ");
            }
            System.out.println();
        }
    }

    public static void neighboursOfItem(ArrayList<ArrayList<Edge>> graph){
        System.out.print("Neighbours of Vertex 2 Are: ");
        for (int i = 0; i < graph.get(2).size(); i++) {  // get arraylist at index 2 and iterate
            Edge edg = graph.get(2).get(i);  // each iteration contains data about Edge
            System.out.print(edg.dest + " "); // print destination in each iteration
        }
    }
    

    public static void main(String[] args) {

        int V = 5;

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>(); // Single Array List

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>()); // Each Index Contains a Seperate Array List
        }

        // 0-th index
        graph.get(0).add(new Edge(0, 1, 1));  // first get the index then add

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

        printGraph(graph);

        neighboursOfItem(graph);

    }
}

// Given Graph

/*
 *              Bidirectional 
 * 
 *              0 -> 1 => 5
 * 
 *              1 -> 0 => 5
 *              1 -> 2 => 1
 *              1 -> 3 => 3
 * 
 *              2 -> 1 => 1
 *              2 -> 4 => 2                 
 *              2 -> 3 => 1
 * 
 *              3 -> 1 => 3
 *              3 -> 2 => 3
 *              
 *              4 -> 2 => 2                 
 *              
 * 
 */