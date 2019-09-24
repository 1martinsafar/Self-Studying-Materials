package com.practice.graphs.AdjacencyMatrixGraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class UndirectedGraph {

    // Adjacency Matrix representation of an unweighted undirected graph

    public final int MAX_VERTICES = 30;

    int n;
    int e;
    boolean[][] adj;
    Vertex[] vertexList;

    // constants for different states of a vertex
    public static boolean hasCycle;
    public static final int INITIAL = 0;
    public static final int WAITING = 1;
    public static final int VISITED = 2;
    public static final int FINISHED = 3;

    public UndirectedGraph() {
        adj = new boolean[MAX_VERTICES][MAX_VERTICES];
        vertexList = new Vertex[MAX_VERTICES];
        // By default n = 0, e = 0
        // By default adj[u][v] = false
    }

    public boolean isCyclic() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        hasCycle = false;

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                dfsC(v);
            }
        }
        return hasCycle;
    }

    private void dfsC(int v) {
        vertexList[v].state = VISITED;

        for (int i = 0; i < n; i++) {
            if (isAdjacent(v,i) && vertexList[v].predecessor != i) {
                if (vertexList[i].state == INITIAL) {
                    vertexList[i].predecessor = v;
                    dfsC(i);
                }
                else if (vertexList[i].state == VISITED) {
                    hasCycle = true;
                }
            }
        }
        vertexList[v].state = FINISHED;
    }

    public void dfsTraversal() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search: ");
        String s = scan.next();
        dfs(getIndex(s));
    }

    private void dfs(int v) {
        vertexList[v].state = VISITED;

        for (int i = 0; i < n; i++) {
            if (isAdjacent(v,i) && vertexList[v].predecessor != i){
                if (vertexList[i].state == INITIAL) {
                    vertexList[i].predecessor = v;
                    System.out.println("Tree Edge (" + vertexList[v] + "," + vertexList[i] + ")");
                    dfs(i);
                }
                else if (vertexList[i].state == VISITED) {
                    System.out.println("Back Edge (" + vertexList[v] + "," + vertexList[i] + ")");
                }
            }
        }
        vertexList[v].state = FINISHED;
    }

    private void dfs_Regular(int v) {
        System.out.print(vertexList[v] + " ");
        vertexList[v].state = VISITED;

        for (int i = 0; i < n; i++) {
            if (isAdjacent(v,i) && vertexList[i].state == INITIAL){
                dfs(i);
            }
        }
        vertexList[v].state = FINISHED;
    }

    public void dfsTraversal_All() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search: ");
        String s = scan.next();
        dfs(getIndex(s));

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                dfs(v);
            }
        }
    }

    public boolean isConnected() {
        for (int v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        int cN = 1;
        bfsC(0,cN);

        for (int v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                cN++;
                bfsC(v, cN);
            }
        }

        if (cN == 1) {
            System.out.println("Graph is connected");
            return true;
        }
        else {
            System.out.println("Graph is not connected, it has " + cN + " connected components");
            for (int v = 0; v > n; v++) {
                System.out.println(vertexList[v] + " " + vertexList[v].componentNumber);
            }
            return false;
        }
    }

    private void bfsC(int v, int cN) {
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(v);
        vertexList[v].state = WAITING;

        while (!qu.isEmpty()) {
            v = qu.remove();
            vertexList[v].state = VISITED;
            vertexList[v].componentNumber = cN;

            for (int i = 0; i < n; i++) {
                if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING;
                }
            }
        }
    }

    public void bfsTraversal() {
        for (int v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Breadth First Search: ");
        String s = scan.next();
        bfs(getIndex(s));
    }

    private void bfs(int v) {
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(v);
        vertexList[v].state = WAITING;

        while (!qu.isEmpty()) {
            v = qu.remove();
            System.out.print(vertexList[v] + " ");
            vertexList[v].state = VISITED;

            for (int i = 0; i < n; i++) {
                if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING;
                }
            }
        }
        System.out.println();
    }

    public void bfsTraversal_All() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Breadth First Search: ");
        String s = scan.next();
        bfs(getIndex(s));

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                bfs(v);
            }
        }
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
                if (adj[i][j]) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
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
        return adj[u][v];
    }

    // Insert an edge (s1, s2)
    public void insertEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);
        if (adj[u][v] == true) {
            System.out.print("Edge already present");
        }
        else {
            adj[u][v] = true;
            adj[v][u] = true;
            e++;
        }
    }

    // Delete the edge (s1, s2)
    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);
        if (adj[u][v] == false) {
            System.out.print("Edge not present");
        }
        else {
            adj[u][v] = false;
            adj[v][u] = false;
            e--;
        }
    }

    public int degree(String s) {
        int u = getIndex(s);

        int deg = 0;

        for (int v = 0; v < n; v++) {
            if (adj[u][v]) {
                deg++;
            }
        }

        return deg;
    }












}
