package com.practice.trees.expressiontree;

public class ExpressionTree {

    Node root;

    public ExpressionTree() {
        root = null;
    }

    static boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;
    }

    public void buildTree(String postfix) {
        StackNode stack = new StackNode(30);

        Node t;

        for (int i = 0; i < postfix.length(); i++) {
            if (isOperator(postfix.charAt(i))) { // operator
                t = new Node(postfix.charAt(i));

                t.rchild = stack.pop();
                t.lchild = stack.pop();

                stack.push(t);
            }
            else { // operand
                t = new Node(postfix.charAt(i));
                stack.push(t);
            }
        }
        root = stack.pop();
    }

    public void prefix() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.info);
        preorder(p.lchild);
        preorder(p.rchild);
    }

    public void postfix() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node p) {
        if (p == null) {
            return;
        }
        postorder(p.lchild);
        postorder(p.rchild);
        System.out.print(p.info);
    }

    public void parenthesizedInfix() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node p) {
        if (p == null) {
            return;
        }

        if (isOperator(p.info)) {
            System.out.print("(");
        }

        inorder(p.lchild);
        System.out.print(p.info);
        inorder(p.rchild);

        if (isOperator(p.info)) {
            System.out.print(")");
        }
    }

    public void display() {
        display(root, 0);
        System.out.println();
    }

    private void display(Node p, int level) {
        int i;
        if (p == null) {
            return;
        }

        display(p.rchild, level + 1);
        System.out.println();

        for (i = 0; i < level; i++) {
            System.out.print("     ");
        }
        System.out.print(p.info);

        display(p.lchild, level + 1);
    }

    public int evaluate() {
        if (root == null) {
            return 0;
        }
        return evaluate(root);
    }

    private int evaluate(Node p) {
        if (!isOperator(p.info)) {
            return Character.getNumericValue(p.info);
        }

        int leftValue = evaluate(p.lchild);
        int rightValue = evaluate(p.rchild);

        if (p.info == '+') {
            return leftValue + rightValue;
        }
        else if (p.info == '-') {
            return leftValue - rightValue;
        }
        else if (p.info == '*') {
            return leftValue * rightValue;
        }
        else {
            return leftValue / rightValue;
        }
    }



}















