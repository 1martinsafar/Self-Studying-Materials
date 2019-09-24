package com.practice.trees.bst;

public class TreeNodeCourse {

    private int data;
    private TreeNodeCourse leftChild;
    private TreeNodeCourse rightChild;

    public TreeNodeCourse(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data) {
            return;
        }

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNodeCourse(value);
            }
            else {
                leftChild.insert(value);
            }
        }
        else {
            if (rightChild == null) {
                rightChild = new TreeNodeCourse(value);
            }
            else {
                rightChild.insert(value);
            }
        }
    }

    public TreeNodeCourse get(int value) {
        if (value == data) {
            return this;
        }

        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        }
        else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;
    }

    public int min() {
        if (leftChild == null) {
            return data;
        }
        else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return data;
        }
        else {
            return rightChild.max();
        }
    }

    public void traversePreOrder() {
        System.out.print(data + ", ");

        if (leftChild != null) {
            leftChild.traversePreOrder();
        }

        if (rightChild != null) {
            rightChild.traversePreOrder();
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
        }
    }

    public void traversePostOrder() {
        if (leftChild != null) {
            leftChild.traversePostOrder();
        }

        if (rightChild != null) {
            rightChild.traversePostOrder();
        }

        System.out.print(data + ", ");
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNodeCourse getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNodeCourse leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNodeCourse getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNodeCourse rightChild) {
        this.rightChild = rightChild;
    }

    public String toString() {
        return "Data = " + data;
    }
}