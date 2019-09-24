package com.practice.trees.expressiontree;

public class Node {

    Node lchild;
    char info;
    Node rchild;

    public Node(char c) {
        info = c;
        lchild = null;
        rchild = null;
    }
}

