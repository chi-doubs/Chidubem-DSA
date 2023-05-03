package com.chidubem.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_BFS {
    private int Vertices;
    private LinkedList<Integer> adj_list[];

    Graph_BFS(int v) {
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj_list[i] = new LinkedList();
    }

    void addEdge(int v, int w){
        adj_list[v].add(w);
    }

    void BFS(int root_node){
        boolean visited[] = new boolean[Vertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[root_node] = true;
        queue.add(root_node);

        while (queue.size() != 0){
            root_node = queue.poll();
            System.out.print(root_node+" ");

            // get all adjacent nodes of current node and process
            Iterator<Integer> i = adj_list[root_node].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
//class Main{
//    public static void main(String args[])
//    {
//        //create a graph with 5 vertices
//        Graph_BFS g = new Graph_BFS(5);
//        //add edges to the graph
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(0, 3);
//        g.addEdge(1, 2);
//        g.addEdge(2, 4);
//        //print BFS sequence
//        System.out.println("Breadth-first traversal of graph with 0 as starting vertex:");
//        g.BFS(0);
//    }
//}
