package com.practice.trees.bst;

public class TreeNode {
    private int value;
    private TreeNode parent;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        parent = null;
        left = null;
        right = null;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
