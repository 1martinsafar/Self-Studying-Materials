package com.practice.graphs.AdjacencyMatrixGraphs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UndirectedWeightedGraph g = new UndirectedWeightedGraph();

        g.insertVertex("Zero");
        g.insertVertex("One");
        g.insertVertex("Two");
        g.insertVertex("Three");
        g.insertVertex("Four");
        g.insertVertex("Five");
        g.insertVertex("Six");
        g.insertVertex("Seven");
        g.insertVertex("Eight");
        g.insertVertex("Nine");

        g.insertEdge("Zero", "One", 19);
        g.insertEdge("Zero", "Three", 14);
        g.insertEdge("Zero", "Four", 12);

        g.insertEdge("One", "Two", 20);
        g.insertEdge("One", "Four", 18);

        g.insertEdge("Two", "Four", 17);
        g.insertEdge("Two", "Five", 15);
        g.insertEdge("Two", "Nine", 29);

        g.insertEdge("Three", "Four", 13);
        g.insertEdge("Three", "Six", 28);

        g.insertEdge("Four", "Five", 16);
        g.insertEdge("Four", "Six", 21);
        g.insertEdge("Four", "Seven", 22);
        g.insertEdge("Four", "Eight", 24);

        g.insertEdge("Five", "Eight", 26);
        g.insertEdge("Five", "Nine", 27);

        g.insertEdge("Six", "Seven", 23);

        g.insertEdge("Seven", "Eight", 30);

        g.insertEdge("Eight", "Nine", 35);

        g.kruskals();

//        g.Prims();



//        DirectedWeightedGraph g = new DirectedWeightedGraph();
//
//        g.insertVertex("Zero");
//        g.insertVertex("One");
//        g.insertVertex("Two");
//        g.insertVertex("Three");
//        g.insertVertex("Four");
//        g.insertVertex("Five");
//        g.insertVertex("Six");
//        g.insertVertex("Seven");
//        g.insertVertex("Eight");
//
//        g.insertEdge("Zero", "Three", 2);
//        g.insertEdge("Zero", "One", 5);
//        g.insertEdge("Zero", "Four", 8);
//
//        g.insertEdge("One", "Four", 2);
//
//        g.insertEdge("Two", "One", 3);
//        g.insertEdge("Two", "Five", 4);
//
//        g.insertEdge("Three", "Four", 7);
//        g.insertEdge("Three", "Six", 8);
//
//
//        g.insertEdge("Four", "Five", 9);
//        g.insertEdge("Four", "Seven", 4);
//
//        g.insertEdge("Five", "One", 6);
//
//        g.insertEdge("Six", "Seven", 9);
//
//        g.insertEdge("Seven", "Five", 3);
//        g.insertEdge("Seven", "Eight", 5);
//
//        g.insertEdge("Eight", "Five", 3);
//
//        g.findPaths("Zero");





//        UndirectedGraph g = new UndirectedGraph();
//
//        g.insertVertex("Zero");
//        g.insertVertex("One");
//        g.insertVertex("Two");
//        g.insertVertex("Three");
//        g.insertVertex("Four");
//        g.insertVertex("Five");
//        g.insertVertex("Six");
//        g.insertVertex("Seven");
//        g.insertVertex("Eight");
//        g.insertVertex("Nine");
//
//        g.insertEdge("Zero", "One");
//        g.insertEdge("Zero", "Seven");
//
//        g.insertEdge("One", "Two");
//        g.insertEdge("One", "Four");
//        g.insertEdge("One", "Five");
//
//        g.insertEdge("Two", "Three");
//        g.insertEdge("Two", "Five");
//
//        g.insertEdge("Three", "Six");
//
//        g.insertEdge("Four", "Seven");
//
//        g.insertEdge("Five", "Six");
//        g.insertEdge("Five", "Eight");
//
//        g.insertEdge("Six", "Nine");
//
//        g.insertEdge("Seven", "Eight");
//
//        g.insertEdge("Eight", "Nine");

//        g.dfsTraversal_All();
//        System.out.println(g.isCyclic());

//        g.bfsTraversal();
//        g.bfsTraversal_All();

//        g.isConnected();






//        DirectedGraph g = new DirectedGraph();
//
//        g.insertVertex("Zero");
//        g.insertVertex("One");
//        g.insertVertex("Two");
//        g.insertVertex("Three");
//        g.insertVertex("Four");
//        g.insertVertex("Five");
//        g.insertVertex("Six");
//        g.insertVertex("Seven");
//        g.insertVertex("Eight");
//        g.insertVertex("Nine");
//
//        g.insertEdge("Zero", "One");
//        g.insertEdge("Zero", "Three");
//
//        g.insertEdge("One", "Two");
//        g.insertEdge("One", "Four");
//        g.insertEdge("One", "Five");
//
//        g.insertEdge("Two", "Three");
//        g.insertEdge("Two", "Five");
//
//        g.insertEdge("Three", "Six");
//
//        g.insertEdge("Four", "Five");
//        g.insertEdge("Four", "Seven");
//
//        g.insertEdge("Five", "Six");
//        g.insertEdge("Five", "Eight");
//
//        g.insertEdge("Six", "Eight");
//        g.insertEdge("Six", "Nine");
//
//        g.insertEdge("Seven", "Eight");
//
//        g.insertEdge("Eight", "Nine");

//        g.dfsTraversal_All_Classify();
//        System.out.println(g.isCyclic());

//        g.dfsTraversal();
//        g.dfsTraversal_All();

//        g.dfsTreeEdges();
//        g.bfsTreeEdges();

//        g.dfsTraversal();
//        g.dfsTraversal_All();

//        g.bfsTraversal();
//        g.bfsTraversal_All();

//        g.findShortestPath("Two");

//        g.bfsTreeEdges();






//        DirectedGraph g1 = new DirectedGraph();
//
//        g1.insertVertex("Zero");
//        g1.insertVertex("One");
//        g1.insertVertex("Two");
//        g1.insertVertex("Three");
//
//        g1.insertEdge("Zero", "One");
//        g1.insertEdge("Zero", "Three");
//        g1.insertEdge("One", "Two");
//        g1.insertEdge("Two", "One");
//        g1.insertEdge("Three", "Zero");
//        g1.insertEdge("Three", "Two");
//
//        g1.Warshalls();





//        DirectedGraph g1 = new DirectedGraph();
//
//        g1.insertVertex("Zero");
//        g1.insertVertex("One");
//        g1.insertVertex("Two");
//        g1.insertVertex("Three");
//
//        g1.insertEdge("Zero", "One");
//        g1.insertEdge("Zero", "Three");
//        g1.insertEdge("One", "Two");
//        g1.insertEdge("One", "Three");
//        g1.insertEdge("Three", "Two");
//
//        g1.findPathMatrix();
//
//        System.out.println();

//        DirectedGraph g2 = new DirectedGraph();
//
//        g2.insertVertex("Zero");
//        g2.insertVertex("One");
//        g2.insertVertex("Two");
//        g2.insertVertex("Three");
//
//        g2.insertEdge("Zero", "One");
//        g2.insertEdge("Zero", "Three");
//        g2.insertEdge("One", "Two");
//        g2.insertEdge("One", "Three");
//        g2.insertEdge("Two", "Zero");
//        g2.insertEdge("Three", "Two");
//
//        g2.findPathMatrix();





//        DirectedGraph g = new DirectedGraph();
//
//        g.insertVertex("Zero");
//        g.insertVertex("One");
//        g.insertVertex("Two");
//
//        g.insertEdge("One", "Two");
//        g.insertEdge("Two", "Zero");
//
//        g.display();
//
//        System.out.println("Vertices = " + g.vertices() + ", Edges = " + g.edges());





//        Scanner scan = new Scanner(System.in);
//        DirectedGraph g = new DirectedGraph();
//        int choice;
//        String s1;
//        String s2;
//
//        while (true) {
//            System.out.println("1. Display Adjacency Matrix");
//            System.out.println("2. Insert a vertex");
//            System.out.println("3. Insert an edge");
//            System.out.println("4. Delete an edge");
//            System.out.println("5. Display indegree and outdegree of a vertex");
//            System.out.println("6. Check if there is an edge between two vertices");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//
//            choice = scan.nextInt();
//
//            if (choice == 7) {
//                break;
//            }
//
//            switch (choice) {
//                case 1:
//                    g.display();
//                    System.out.println("Vertices = " + g.vertices() + ", Edges = " + g.edges());
//                    break;
//                case 2:
//                    System.out.print("Insert a vertex: ");
//                    s1 = scan.next();
//                    g.insertVertex(s1);
//                    break;
//                case 3:
//                    System.out.print("Enter start and end vertices: ");
//                    s1 = scan.next();
//                    s2 = scan.next();
//                    g.insertEdge(s1, s2);
//                    break;
//                case 4:
//                    System.out.print("Enter start and end vertices: ");
//                    s1 = scan.next();
//                    s2 = scan.next();
//                    g.deleteEdge(s1, s2);
//                    break;
//                case 5:
//                    System.out.print("Enter a vertex: ");
//                    s1 = scan.next();
//                    System.out.println("Indegree is: " + g.indegree(s1));
//                    System.out.println("Outdegree is: " + g.outdegree(s1));
//                    break;
//                case 6:
//                    System.out.print("Enter two vertices: ");
//                    s1 = scan.next();
//                    s2 = scan.next();
//                    if (g.edgeExists(s1, s2)) {
//                        System.out.println("There is an edge from " + s1 + " to " + s2);
//                    }
//                    else {
//                        System.out.println("There is no edge from " + s1 + " to " + s2);
//                    }
//                    if (g.edgeExists(s2, s1)) {
//                        System.out.println("There is an edge from " + s2 + " to " + s1);
//                    }
//                    else {
//                        System.out.println("There is no edge from " + s2 + " to " + s1);
//                    }
//                    break;
//                default:
//                    System.out.println("Wrong choice");
//                    break;
//            }
//        }





    }
}
