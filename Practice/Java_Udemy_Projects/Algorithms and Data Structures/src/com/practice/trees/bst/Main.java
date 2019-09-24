package com.practice.trees.bst;

public class Main {

    public static void main(String[] args) {
        // course implementation

        BinarySearchTreeCourse intTree = new BinarySearchTreeCourse();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();
//
//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));

//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

//        intTree.delete(8888);

//        intTree.traverseInOrder();
//        System.out.println();

        // Challenge #1
        intTree.traversePreOrder();
        System.out.println();

        intTree.traversePostOrder();
        System.out.println();




        // my implementation

//        BinarySearchTree bst = new BinarySearchTree(25);
//
//        bst.insert(20);
//        bst.insert(15);
//        bst.insert(27);
//        bst.insert(30);
//        bst.insert(29);
//        bst.insert(26);
//        bst.insert(22);
//
//        bst.printTreePreOrder(bst.getRoot());
//
//        System.out.println();
//
//        bst.max(bst.getRoot());
//        bst.min(bst.getRoot());
//
//        System.out.println();
//
//        TreeNode node = bst.get(26);
//        if (node.getParent() != null) {
//            System.out.println("parent: " + node.getParent().getValue());
//        }
//
//        System.out.println("\n\nremoving: 26, tree:");        // 0 children
//        bst.remove(26);
//
//        System.out.println("\n\nremoving: 22, tree:");        // 0 children
//        bst.remove(22);
//
//        System.out.println("\n\nremoving: 30, tree:");        // 1 child - left
//        bst.remove(30);
//
//        System.out.println("\n\nremoving: 20, tree:");        // 2 children (left subtree)
//        bst.remove(20);
//
//        System.out.println("\n\nremoving: 27, tree:");        // 2 children (right subtree)
//        bst.remove(27);
//
//        System.out.println("\n\nremoving: 25, tree:");        // 2 children + root
//        bst.remove(25);
//
//
//
////        System.out.println("\n\nTree after replacement and deletion");
//        bst.printTreePreOrder(bst.getRoot());
    }
}
