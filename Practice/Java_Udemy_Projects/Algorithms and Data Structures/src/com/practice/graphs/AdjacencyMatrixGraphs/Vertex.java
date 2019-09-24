package com.practice.graphs.AdjacencyMatrixGraphs;

public class Vertex {

    String name;
    int state;
    int predecessor;
    int distance;
    int componentNumber;

    int discoveryTime;
    int finishingTime;

    int status;
    int pathLength;

    int length;

    int father;

    Vertex(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

