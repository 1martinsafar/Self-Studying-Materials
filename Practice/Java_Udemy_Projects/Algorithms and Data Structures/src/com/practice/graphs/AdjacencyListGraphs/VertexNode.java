package com.practice.graphs.AdjacencyListGraphs;

public class VertexNode {

    String name;
    VertexNode nextVertex;
    EdgeNode firstEdge;

    public VertexNode(String s) {
        name = s;
    }

    public String toString() {
        return name;
    }
}

