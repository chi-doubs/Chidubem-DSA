package com.chidubem.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph_DFS {
    // DFS Technique for undirected graph

    private int Vertices;
    private LinkedList<Integer> adj_list[];

    Graph_DFS(int v){
        Vertices = v;
        adj_list = new LinkedList[v];
        for (int i=0; i<v; i++)
            adj_list[i] = new LinkedList<>();
    }

    void addEdge(int v, int w){
        adj_list[v].add(w);
    }

    void DFS_helper(int v, boolean visited[]){
        // current node is visited
        visited[v] = true;
        System.out.println(v + "  ");

        //process all adjacent vertices
        Iterator<Integer> i = adj_list[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFS_helper(n, visited);
        }
    }

    void DFS(int v){

        boolean visited[] = new boolean[Vertices];

        // call recursive DFS_helper function for DFS technique
        DFS_helper(v,visited);
    }
}

class Cain {
    public static void main(String args[]){
        Graph_DFS g = new Graph_DFS(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,2);
        g.addEdge(2,4);

        System.out.println("Depth First Traversal for given graph" + "(with 0 as starting vertex)");
        g.DFS(0);

    }
}
