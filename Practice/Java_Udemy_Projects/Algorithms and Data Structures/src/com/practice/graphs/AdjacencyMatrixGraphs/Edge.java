package com.practice.graphs.AdjacencyMatrixGraphs;

public class Edge implements Comparable<Edge> {

    int u; // start vertex
    int v; // end vertex
    int wt; // weight

    public Edge(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }

    public int compareTo(Edge obj) {
        if (wt == obj.wt) {
            return 0;
        }
        else if (wt > obj.wt) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

