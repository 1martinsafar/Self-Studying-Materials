package com.practice.linkedlists;

public class StringDoublyLinkedList {

    private StringDoublyNode head;
    private StringDoublyNode tail;

    public StringDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public StringDoublyLinkedList(String name) {
        StringDoublyNode node = new StringDoublyNode(name);
        node.setPrevious(null);
        node.setNext(null);
        this.head = node;
    }

    public void insertAtFront(String name) {
        StringDoublyNode node = new StringDoublyNode(name);
        node.setPrevious(null);
        node.setNext(this.head);

        if (this.head == null) {
            this.tail = node;
        } else {
            this.head.setPrevious(node);
        }

        this.head = node;
    }

    public void insertAtEnd(String name) {
        StringDoublyNode node = new StringDoublyNode(name);
        node.setPrevious(this.tail);
        node.setNext(null);

        System.out.println("Adding: " + name);

        if (this.tail == null) {
            System.out.println("first element");
            this.head = node;
        } else {
            System.out.println("Tail: " + this.tail.getName());
            this.tail.setNext(node);
        }

        this.tail = node;
    }

    public StringDoublyNode deleteFromFront() {
        if (this.head == null) {
            System.out.println("StringDoublyLinkedList is empty, nothing to delete.");
            return null;
        }

        StringDoublyNode deletedNode = this.head;

        if (this.head.getNext() != null) {
            this.head.getNext().setPrevious(null);
        } else {
            this.tail = null;
        }

        this.head = this.head.getNext();
        System.out.println("deleting: " + deletedNode.getName());
        if (this.head != null) {
            System.out.println("new head: " + this.head.getName());
        }

        return deletedNode;
    }

    public StringDoublyNode deleteFromEnd() {
        if (this.tail == null) {
            System.out.println("StringDoublyLinkedList is empty, nothing to delete.");
            return null;
        }

        StringDoublyNode deletedNode = this.tail;

        if (this.tail.getPrevious() != null) {
            this.tail.getPrevious().setNext(null);
        } else {
            this.head = null;
        }

        this.tail = this.tail.getPrevious();
        System.out.println();
        System.out.println("deleting: " + deletedNode.getName());
        if (this.tail != null) {
            System.out.println("new tail: " + this.tail.getName());
        }

        return deletedNode;
    }

    public StringDoublyNode getNode(String name) {
        StringDoublyNode current = this.head;

        while (current != null && current.getName() != name) {
            current = current.getNext();
        }

        return current;
    }

    // To insert a node A between nodes B and C
    //
    public boolean insertBetweenNoDuplicates(String newName, String A, String B) {
        if (getNode(A) == null || getNode(B) == null) {
            System.out.println("A or B does not exist.");
            return false;
        }

        StringDoublyNode nodeA = getNode(A);
        StringDoublyNode nodeB = getNode(B);

        if (nodeA.getNext().getName() != nodeB.getName()) {
            System.out.println("A and B are not next to each other.");
            return false;
        }

        StringDoublyNode nodeNew = new StringDoublyNode(newName);

        nodeNew.setPrevious(nodeA);
        nodeNew.setNext(nodeB);
        nodeA.setNext(nodeNew);
        nodeB.setPrevious(nodeNew);

        return true;
    }

    public StringDoublyNode findInsertBetweenNode(String A, String B) {
        StringDoublyNode current = this.head;

        while (current.getNext() != null) {
            if (current.getName() == A && current.getNext().getName() == B) {
                System.out.println("Found the A node, use A's next node as B");
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    public boolean insertBetweenDuplicates(String newName, String A, String B) {

        StringDoublyNode nodeA = findInsertBetweenNode(A, B);
        if (nodeA == null) {
            System.out.println("valid nodeA does not exist.");
            return false;
        }

        StringDoublyNode nodeB = nodeA.getNext();
        StringDoublyNode nodeNew = new StringDoublyNode(newName);

        nodeNew.setPrevious(nodeA);
        nodeNew.setNext(nodeB);
        nodeA.setNext(nodeNew);
        nodeB.setPrevious(nodeNew);

        return true;
    }

    public StringDoublyNode findRemoveBetweenNode(String name, String A, String B) {
        StringDoublyNode current = this.head;

        while (current.getNext() != null) {
            System.out.println("current: " + current.getName());
            if (current.getPrevious() != null) {
                System.out.println("previous: " + current.getPrevious().getName());
            }
            if (current.getNext() != null) {
                System.out.println("next: " + current.getNext().getName());
            }

            if (current.getName() == name && current.getPrevious().getName() == A && current.getNext().getName() == B) {
                System.out.println("Found the node to be removed, it's between A and B");
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    // To remove node A from between B and C
    //
    public boolean deleteBetweenDuplicates(String name, String A, String B) {

        StringDoublyNode node = findRemoveBetweenNode(name, A, B);
        if (node == null) {
            System.out.println("valid node between A and B does not exist.");
            return false;
        }

        StringDoublyNode nodeA = node.getPrevious();
        StringDoublyNode nodeB = node.getNext();

        nodeA.setNext(nodeB);
        nodeB.setPrevious(nodeA);

        return true;
    }



    public void printList() {
        if (this.head == null) {
            System.out.println("StringDoublyLinkedList is empty.");
            return;
        }

        StringDoublyNode node = this.head;
        while (node != null) {
            System.out.println("node: " + node.getName());
            node = node.getNext();
        }
    }
}
