package com.practice.graphs.AdjacencyMatrixGraphs;

import java.util.PriorityQueue;

public class UndirectedWeightedGraph {

    // Adjacency Matrix representation of a weighted undirected graph

    public final int MAX_VERTICES = 30;

    int n;
    int e;
    int[][] adj;
    Vertex[] vertexList;

    public static final int TEMPORARY = 1;
    public static final int PERMANENT = 2;
    public static final int NIL = -1;
    public static final int INFINITY = 99999;

    public UndirectedWeightedGraph() {
        adj = new int[MAX_VERTICES][MAX_VERTICES];
        vertexList = new Vertex[MAX_VERTICES];
        // By default n = 0, e = 0
        // By default adj[u][v] = false
    }

    public void kruskals() {
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
        int u, v;

        // Inserting all the edges of the graph in the Priority Queue
        for (u = 0; u < n; u++) {
            for (v = 0; v < u; v++) {
                if (adj[u][v] != 0) {
                    pq.add(new Edge(u,v,adj[u][v]));
                }
            }
        }

        for (v = 0; v < n; v++) {
            vertexList[v].father = NIL;
        }

        int v1, v2;
        int r1, r2 = NIL;
        int edgesInTree = 0;
        int wtTree = 0;

        while (!pq.isEmpty() && edgesInTree < n-1) {
            Edge edge = pq.remove();
            v1 = edge.u;
            v2 = edge.v;

            v = v1;
            while (vertexList[v].father != NIL) {
                v = vertexList[v].father;
            }
            r1 = v; // Root 1

            v = v2;
            while (vertexList[v].father != NIL) {
                v = vertexList[v].father;
            }
            r2 = v; // Root 2

            if (r1 != r2) { // Edge (v1,v2) is included
                edgesInTree++;
                System.out.println(vertexList[v1] + "," + vertexList[v2]);
                wtTree += edge.wt;
                vertexList[r2].father = r1;
            }
        } // End of while
        if (edgesInTree < n-1) {
            throw new RuntimeException("Graph is not connected, no Spanning Tree possible\n");
        }
        System.out.println("Weight of Minimum Spanning Tree is " + wtTree);
    }

    public void Prims() {
        int c, v;

        int edgesInTree = 0;
        int wtTree = 0;

        for (v = 0; v < n; v++) {
            vertexList[v].status = TEMPORARY;
            vertexList[v].length = INFINITY;
            vertexList[v].predecessor = NIL;
        }

        int root = 0;
        vertexList[root].length = 0;

        while (true) {
            c = tempVertexMinL();

            if (c == NIL) {
                if (edgesInTree == n - 1) {
                    System.out.println("Weight of minimum spanning tree is " + wtTree);
                    return;
                }
                else {
                    throw new RuntimeException("Graph is not connected, Spanning tree not possible");
                }
            }

            vertexList[c].status = PERMANENT;
            // Include edge ( vertextList[c].predecessor,c ) in the tree - c's predecessor -> c
            if (c != root) {
                edgesInTree++;
                System.out.println("(" + vertexList[c].predecessor + "," + c + ")");
                wtTree = wtTree + adj[vertexList[c].predecessor][c];
            }

            for (v = 0; v < n; v++) {
                if (isAdjacent(c,v) && vertexList[v].status == TEMPORARY) {
                    if (adj[c][v] < vertexList[v].length) {
                        vertexList[v].length = adj[c][v];
                        vertexList[v].predecessor = c;
                    }
                }
            }
        } // End of while
    }

    private int tempVertexMinL() {
        int min = INFINITY;
        int x = NIL;

        for (int v = 0; v < n; v++) {
            if (vertexList[v].status == TEMPORARY && vertexList[v].length < min) {
                min = vertexList[v].length;
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
        if (adj[u][v] != 0) {
            System.out.print("Edge already present");
        }
        else {
            adj[u][v] = wt;
            adj[v][u] = wt;
            e++;
        }
    }

    // Delete the edge (s1, s2)
    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);
        if (adj[u][v] == 0) {
            System.out.print("Edge not present");
        }
        else {
            adj[u][v] = 0;
            adj[v][u] = 0;
            e--;
        }
    }

    public int degree(String s) {
        int u = getIndex(s);

        int deg = 0;

        for (int v = 0; v < n; v++) {
            if (adj[u][v] != 0) {
                deg++;
            }
        }

        return deg;
    }
}
