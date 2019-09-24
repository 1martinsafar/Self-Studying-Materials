package com.practice.trees.inthreadedbst;

public class Node {

    public Node left;
    public boolean leftThread;

    public int info;

    public Node right;
    public boolean rightThread;

    public Node(int i) {
        info = i;
        left = null;
        right = null;
        leftThread = true;
        rightThread = true;
    }
}

