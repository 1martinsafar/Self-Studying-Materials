package com.practice.graphs.AdjacencyMatrixGraphs;

public class DirectedWeightedGraph {

    // Adjacency Matrix representation of a weighted directed graph

    public final int MAX_VERTICES = 30;

    int n;
    int e;
    int[][] adj;
    Vertex[] vertexList;

    public static final int TEMPORARY = 1;
    public static final int PERMANENT = 2;
    public static final int NIL = -1;
    public static final int INFINITY = 99999;


    public DirectedWeightedGraph() {
        adj = new int[MAX_VERTICES][MAX_VERTICES];
        vertexList = new Vertex[MAX_VERTICES];
        // By default n = 0, e = 0
        // By default adj[u][v] = false
    }

    public void findPaths(String source) {
        int s = getIndex(source);

        dijkstra(s); // pathLengths and predecessors of all vertices will have been set after this call

        System.out.println("Source Vertex: " + source + " \n");

        for (int v = 0; v < n; v++) {
            System.out.println("Destination Vertex: " + vertexList[v]);
            if (vertexList[v].pathLength == INFINITY) {
                System.out.println("There is no path from " + source + " to vertex " + vertexList[v] + "\n");
            }
            else {
                findPath(s, v);
            }
        }
    }

    private void findPath(int s, int v) {
        int i, u;
        int[] path = new int[n];
        int sd = 0;
        int count = 0;

        while (v != s) {
            count++;
            path[count] = v;
            u = vertexList[v].predecessor;
            sd += adj[u][v];
            v = u;
        }
        count ++;
        path[count] = s;

        System.out.print("Shortest Path is: ");
        for (i = count; i >= 1; i--) {
            System.out.print(path[i] + " ");
        }
        System.out.println("\n Shortest distance is: " + sd + "\n");
    }

    private void dijkstra(int s) {
        int v, c;

        for (v = 0; v < n; v++) {
            vertexList[v].status = TEMPORARY;
            vertexList[v].pathLength = INFINITY;
            vertexList[v].predecessor = NIL;
        }

        vertexList[s].pathLength = 0;

        while (true) {
            c = tempVertexMinPL();

            if (c == NIL) {
                return;
            }

            vertexList[c].status = PERMANENT;

            for (v = 0; v < n; v++) {
                if (isAdjacent(c,v) && vertexList[v].status == TEMPORARY) {
                    if (vertexList[c].pathLength + adj[c][v] < vertexList[v].pathLength) {
                        vertexList[v].predecessor = c;
                        vertexList[v].pathLength = vertexList[c].pathLength + adj[c][v];
                    }
                }
            }
        }
    }

    private int tempVertexMinPL() {
        int min = INFINITY;
        int x = NIL;

        for (int v = 0; v < n; v++) {
            if (vertexList[v].status == TEMPORARY && vertexList[v].pathLength < min) {
                min = vertexList[v].pathLength;
                x = v;
            }
        }
        return x;
    }

    public int vertices() {
        return n;
    }

    public int edges() {
        return e;
    }

    public void display() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void insertVertex(String name) {
        vertexList[n++] = new Vertex(name);
    }

    private int getIndex(String s) {
        for (int i = 0; i < n; i++) {
            if (s.equals(vertexList[i].name)) {
                return i;
            }
        }
        throw new RuntimeException("Invalid Vertex");
    }

    // Returns true if edge (s1, s2) exists
    public boolean edgeExists(String s1, String s2) {
        return isAdjacent(getIndex(s1), getIndex(s2));
    }

    // Returns true if vertex v is adjacent to vertex u, edge u -> v
    private boolean isAdjacent(int u, int v) {
        return (adj[u][v] != 0);
    }

    // Insert an edge (s1, s2)
    public void insertEdge(String s1, String s2, int wt) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if (u == v) {
            throw new IllegalArgumentException("Not a valid edge");
        }
        if (adj[u][v] != 0) {
            System.out.print("Edge already present");
        }
        else {
            adj[u][v] = wt;
            e++;
        }
    }

    // Delete the edge (s1, s2)
    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if (adj[u][v] == 0) {
            System.out.println("Edge not present in the graph");
        }
        else {
            adj[u][v] = 0;
            e--;
        }
    }

    // Returns number of edges going out from a vertex
    public int outdegree(String s) {
        int u = getIndex(s);

        int out = 0;

        for (int v = 0; v < n; v++) {
            if (adj[u][v] != 0) {
                out++;
            }
        }

        return out;
    }

    // Returns number of edges coming to a vertex
    public int indegree(String s) {
        int u = getIndex(s);

        int in = 0;

        for (int v = 0; v < n; v++) {
            if (adj[v][u] != 0) {
                in++;
            }
        }

        return in;
    }
}
