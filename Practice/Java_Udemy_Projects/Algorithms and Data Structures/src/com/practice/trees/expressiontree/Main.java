package com.practice.trees.expressiontree;

public class Main {

    public static void main(String[] args) {

        ExpressionTree etree = new ExpressionTree();
        String postfix = "45+3/7*42/-";

        etree.buildTree(postfix);

        etree.display();

        System.out.print("Prefix expression: ");
        etree.prefix();

        System.out.print("Postfix expression: ");
        etree.postfix();

        System.out.print("Parenthesized Infix expression: ");
        etree.parenthesizedInfix();

        System.out.print("Value of the tree: ");
        System.out.println(etree.evaluate());
    }
}
