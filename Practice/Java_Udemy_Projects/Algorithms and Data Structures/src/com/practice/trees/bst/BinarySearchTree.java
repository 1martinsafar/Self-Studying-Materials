package com.practice.trees.bst;

public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(int value) {
        TreeNode node = new TreeNode(value);
        this.root = node;
    }

    public void insert(int value) {
        System.out.println("adding: " + value);
        TreeNode node = new TreeNode(value);

        if (root == null) {
            root = node;
            return;
        }

        TreeNode current = root;

        while (current != null) {
            if (value == current.getValue()) {
                System.out.println("Duplicate value, not adding.");
                return;
            }

            if (value < current.getValue()) {
                if (current.getLeft() == null) {
                    System.out.println("found position, left from " + current.getValue());
                    node.setParent(current);
                    current.setLeft(node);
                    return;
                }
                current = current.getLeft();
            }
            if (value > current.getValue()) {
                if (current.getRight() == null) {
                    System.out.println("found position, right from " + current.getValue());
                    node.setParent(current);
                    current.setRight(node);
                    return;
                }
                current = current.getRight();
            }
        }
        System.out.println("Warning, position not found, the value has not been added!");
    }

    public TreeNode remove(int value) {
        TreeNode node = get(value);

        if (node == null) {
            System.out.println("The value is not in the tree.");
            return null;
        }

        // 0 children
        if (node.getLeft() == null && node.getRight() == null) {
            System.out.println("0 children");
            if (node.getValue() < node.getParent().getValue()) {
                node.getParent().setLeft(null);
            } else {
                node.getParent().setRight(null);
            }
            return node;
        }

        // 1 child

        // has right
        if (node.getLeft() == null) {
            System.out.println("has right child");
            TreeNode parent = node.getParent();
            System.out.println("parent: " + parent.getValue());
            TreeNode right = node.getRight();
            if (value < parent.getValue()) {
                parent.setLeft(right);
            } else {
                parent.setRight(right);
            }
        }
        // has left
        else if (node.getRight() == null) {
            System.out.println("has left child");
            TreeNode parent = node.getParent();
            System.out.println("parent: " + parent.getValue());
            TreeNode left = node.getLeft();
            if (value < parent.getValue()) {
                parent.setLeft(left);
            } else {
                parent.setRight(left);
            }
        }
        // 2 children
        else {
            System.out.println("has 2 children");
            // replace it with the MAX left subtree or MIN right subtree
            // let's use max left subtree
            int maxLeftSubtree = max(node.getLeft());
            System.out.println("max left subtree: " + maxLeftSubtree);

            //  can use min right subtree
//            int minRightSubtree = min(node.getRight());
//            System.out.println("min right subtree: " + minRightSubtree);

            TreeNode replacement = get(maxLeftSubtree);
            remove(maxLeftSubtree);

            replacement.setParent(node.getParent());
            if (node.getParent() != null) {
                if (replacement.getValue() < node.getParent().getValue()) {
                    node.getParent().setLeft(replacement);
                } else {
                    node.getParent().setRight(replacement);
                }
            }

            if (node.getLeft() != null) {
                if (node.getLeft().getValue() != replacement.getValue()) {
                    replacement.setLeft(node.getLeft());
                } else {
                    replacement.setLeft(null);
                }

                if (node.getLeft().getValue() != replacement.getValue()) {
                    node.getLeft().setParent(replacement);
                } else {
                    node.getLeft().setParent(null);;
                }
            }

            if (node.getRight() != null) {
                if (node.getRight().getValue() != replacement.getValue()) {
                    replacement.setRight(node.getRight());
                } else {
                    replacement.setRight(null);
                }

                if (node.getRight().getValue() != replacement.getValue()) {
                    node.getRight().setParent(replacement);
                } else {
                    node.getRight().setParent(null);
                }
            }

            System.out.println("replacement's value: " + replacement.getValue());
            if (replacement.getParent() != null) {
                System.out.println("replacement's parent: " + replacement.getParent().getValue());
            }
            if (replacement.getLeft() != null) {
                System.out.println("replacement's left: " + replacement.getLeft().getValue());
            }
            if (replacement.getRight() != null) {
                System.out.println("replacement's right: " + replacement.getRight().getValue());
            }

            System.out.println("node before change: " + node.getValue());
            node = replacement;
            replacement = null;
            if (root.getValue() == value) {
                System.out.println("changing root");
                root = node;
            }

            System.out.println("node new value: " + node.getValue());
        }


        return node;
    }

    public TreeNode get(int value) {
        TreeNode current = root;
        if (current.getValue() == value) {
            System.out.println("Found: " + current.getValue());
            return current;
        }

        while (current != null && current.getValue() != value)
        if (value < current.getValue()) {
            current = current.getLeft();
        } else {
            current = current.getRight();
        }

        if (current == null) {
            System.out.println("Not found.");
            return null;
        }

        System.out.println("Found: " + current.getValue());
        return current;
    }

    public int min(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        TreeNode current = root;
        while (current.getLeft() != null) {
            System.out.println("min() current: " + current.getValue());
            current = current.getLeft();
            System.out.println("min() new current: " + current.getValue());
        }
        System.out.println("min: " + current.getValue());
        return current.getValue();
    }

    public int max(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        TreeNode current = root;
        while (current.getRight() != null) {
            System.out.println("max() current: " + current.getValue());
            current = current.getRight();
            System.out.println("max() new current: " + current.getValue());
        }
        System.out.println("max: " + current.getValue());
        return current.getValue();
    }

    public void printTreePreOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.println("\n*node: " + node.getValue());

        if (node.getLeft() != null) {
            System.out.println("left: " + node.getLeft().getValue());
        }

        if (node.getRight() != null) {
            System.out.println("right: " + node.getRight().getValue());
        }

        printTreePreOrder(node.getLeft());
        printTreePreOrder(node.getRight());
    }

    public TreeNode getRoot() {
        return root;
    }
}
