package com.practice.graphs.AdjacencyMatrixGraphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DirectedGraph {

    // Adjacency Matrix representation of an unweighted directed graph

    public final int MAX_VERTICES = 30;

    int n;
    int e;
    boolean[][] adj;
    Vertex[] vertexList;

    // constants for different states of a vertex
    public static int time;
    public static boolean hasCycle;
    public static final int INITIAL = 0;
    public static final int WAITING = 1;
    public static final int VISITED = 2;
    public static final int FINISHED = 3;

    public static final int NIL = -1;
    public static final int INFINITY = 99999;

    public DirectedGraph() {
        adj = new boolean[MAX_VERTICES][MAX_VERTICES];
        vertexList = new Vertex[MAX_VERTICES];
        // By default n = 0, e = 0
        // By default adj[u][v] = fals e
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
            if (isAdjacent(v, i)) {
                if (vertexList[i].state == INITIAL) {
                    dfsC(i);
                }
                else if (vertexList[i].state == VISITED) { // checking for Back Edge
                    hasCycle = true;
                }
            }
        }
        vertexList[v].state = FINISHED;
    }

    private void dfs_Recursive_Classify(int v) {
        vertexList[v].state = VISITED;
        vertexList[v].discoveryTime = ++time;

        for (int i = 0; i < n; i++) {
            if (isAdjacent(v, i)) {
                if (vertexList[i].state == INITIAL) {
                    System.out.println("Tree Edge - (" + vertexList[v] + ", " + vertexList[i] + ")");
                    dfs_Recursive_Classify(i);
                }
                else if (vertexList[i].state == VISITED) {
                    System.out.println("Back Edge - (" + vertexList[v] + ", " + vertexList[i] + ")");
                }
                else if (vertexList[v].discoveryTime < vertexList[i].discoveryTime) {
                    System.out.println("Forward Edge - (" + vertexList[v] + ", " + vertexList[i] + ")");
                }
                else {
                    System.out.println("Cross Edge - (" + vertexList[v] + ", " + vertexList[i] + ")");
                }
            }
        }
        vertexList[v].state = FINISHED;
        vertexList[v].finishingTime = ++time;
    }

    public void dfsTraversal_All_Classify() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        time = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search: ");
        String s = scan.next();

        dfs_Recursive_Classify(getIndex(s));

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                dfs_Recursive_Classify(v);
            }
        }

        for (v = 0; v < n; v++) {
            System.out.println("Vertex: " + vertexList[v]);
            System.out.print(" Discovery time - " + vertexList[v].discoveryTime);
            System.out.println(" Finishing time - " + vertexList[v].finishingTime);
        }
    }

    private void dfs_Recursive(int v) {
        System.out.print(v + " ");
        vertexList[v].state = VISITED;
        vertexList[v].discoveryTime = ++time;

        for (int i = 0; i < n; i++) {
            if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                dfs_Recursive(i);
            }
        }
        vertexList[v].state = FINISHED;
        vertexList[v].finishingTime = ++time;
    }

    public void dfsTreeEdges() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
            vertexList[v].predecessor = NIL;
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

        System.out.println("Tree Edges: ");
        int u;
        for (v = 0; v < n; v++) {
            u = vertexList[v].predecessor;
            if (u != NIL) {
                System.out.println("(" + vertexList[u] + "," + vertexList[v] + ")");
            }
        }
    }

    public void dfsTraversal() {
        for (int v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        time = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search: ");
        String s = scan.next();

//        dfs(getIndex(s));
        dfs_Recursive(getIndex(s));

        for (int v = 0; v < n; v++) {
            System.out.println("Vertex: " + vertexList[v]);
            System.out.print(" Discovery time - " + vertexList[v].discoveryTime);
            System.out.println(" Finishing time - " + vertexList[v].finishingTime);
        }
    }

    private void dfs(int v) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(v);

        while (!st.isEmpty()) {
            v = st.pop();
            if (vertexList[v].state == INITIAL) {
                System.out.print(vertexList[v] + " ");
                vertexList[v].state = VISITED;
            }
            for (int i = n-1; i >= 0; i--) {
                if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                    st.push(i);
                    vertexList[i].predecessor = v;
                }
            }
        }
        System.out.println();
    }

    public void dfsTraversal_All() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        time = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Depth First Search: ");
        String s = scan.next();

//        dfs(getIndex(s));
        dfs_Recursive(getIndex(s));

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
//                dfs(v);
                dfs_Recursive(v);
            }
        }

        for (v = 0; v < n; v++) {
            System.out.println("Vertex: " + vertexList[v]);
            System.out.print(" Discovery time - " + vertexList[v].discoveryTime);
            System.out.println(" Finishing time - " + vertexList[v].finishingTime);
        }
    }

    public void bfsTreeEdges() {
        int v;
        for (v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter starting vertex for Breadth First Search");
        String s = scan.next();
        bfsTree(getIndex(s));

        for (v = 0; v < n; v++) {
            if (vertexList[v].state == INITIAL) {
                bfsTree(v);
            }
        }
    }

    private void bfsTree(int v) {
        Queue<Integer> qu = new LinkedList<Integer>();
        qu.add(v);
        vertexList[v].state = WAITING;

        while (!qu.isEmpty()) {
            v = qu.remove();
            vertexList[v].state = VISITED;

            for (int i = 0; i < n; i++) {
                if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING;
                    System.out.println("Tree Edge: (" + vertexList[v] + "," + vertexList[i] + ")");
                }
            }
        }
        System.out.println();
    }

    public void findShortestPath(String s) {
        for (int v = 0; v < n; v++) {
            vertexList[v].state = INITIAL;
            vertexList[v].predecessor = NIL;
            vertexList[v].distance = INFINITY;
        }

        bfs(getIndex(s));

        for (int v = 0; v < n; v++) {
            if (vertexList[v].distance == INFINITY) {
                System.out.println("No path from vertex " + s + " to vertex " + vertexList[v]);
            }
            else {
                System.out.println("Shortest distance from vertex " + s + " to vertex "
                        + vertexList[v] + " is " + vertexList[v].distance);
                // Store the full path in array path
                int[] path = new int[n];
                int count = 0;
                int x, y = v;

                while (y != NIL) {
                    count++;
                    path[count] = y;
                    x = vertexList[y].predecessor;
                    y = x;
                }

                System.out.print("Shortest Path is: ");
                int i;
                for (i = count; i > 1; i--) {
                    System.out.print(vertexList[path[i]] + "->");
                }
                System.out.println(vertexList[path[i]]);
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
        vertexList[v].distance = 0;
        vertexList[v].predecessor = NIL;

        while (!qu.isEmpty()) {
            v = qu.remove();
            System.out.print(vertexList[v] + " ");
            vertexList[v].state = VISITED;

            for (int i = 0; i < n; i++) {
                if (isAdjacent(v, i) && vertexList[i].state == INITIAL) {
                    qu.add(i);
                    vertexList[i].state = WAITING;
                    vertexList[i].predecessor = v;
                    vertexList[i].distance = vertexList[v].distance + 1;
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

    public void Warshalls() {
        boolean[][] p = new boolean[n][n];

        // p will be the adj - Adjacency Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = adj[i][j];
            }
        }

        // if the previous matrix has 1, we keep 1, else check [i][k] and [k][j]]
        // n-1 iterations, after 1st iteration, p will be P0,
        // at the end p will be Pn-1 which is the Path Matrix
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    p[i][j] = ( p[i][j] || (p[i][k] && p[k][j]));
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (p[i][j]) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void findPathMatrix() {
        int[][] x;
        int[][] adjp;
        int[][] temp;

        x = new int[n][n];
        adjp = new int[n][n];
        temp = new int[n][n];

        for (int i = 0; i < n; i++) {
            // elements of x and adjp are initialized with elements from adj boolean[][]
            for (int j = 0; j < n; j++) {
                x[i][j] = adjp[i][j] = adj[i][j] ? 1 : 0;
            }
        }

        // find all the powers of adjacency matrix and add them to the x[][]
        for (int p = 2; p <= n; p++) {
            // multiply 2 matrices
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        temp[i][j] = temp[i][j] + adjp[i][k] * (adj[k][j] ? 1 : 0);
                    }
                }
            }
            // copy the temp[][] values to adjp[][]
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    adjp[i][j] = temp[i][j];
                }
            }
            // add all the powers of adjacency matrix to the x[][] - adding elements of adjp[][] to
            // corresponding elements of array x[][]
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    x[i][j] = x[i][j] + adjp[i][j];
                }
            }
        }

        // Display X
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        boolean[][] path;
        path = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (x[i][j] == 0) {
                    path[i][j] = false;
                }
                else {
                    path[i][j] = true;
                }
            }
        }

        // Display Path Matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (path[i][j]) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
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

        if (u == v) {
            throw new IllegalArgumentException("Not a valid edge");
        }
        if (adj[u][v] == true) {
            System.out.print("Edge already present");
        }
        else {
            adj[u][v] = true;
            e++;
        }
    }

    // Delete the edge (s1, s2)
    public void deleteEdge(String s1, String s2) {
        int u = getIndex(s1);
        int v = getIndex(s2);

        if (adj[u][v] == false) {
            System.out.println("Edge not present in the graph");
        }
        else {
            adj[u][v] = false;
            e--;
        }
    }

    // Returns number of edges going out from a vertex
    public int outdegree(String s) {
        int u = getIndex(s);

        int out = 0;

        for (int v = 0; v < n; v++) {
            if (adj[u][v]) {
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
            if (adj[v][u]) {
                in++;
            }
        }

        return in;
    }

















}





