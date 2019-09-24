package com.practice.linkedlists;

public class StringSinglyLinkedList {

    private StringSinglyNode head;

    public StringSinglyLinkedList() {
        this.head = null;
    }

    public StringSinglyLinkedList(String name) {
        StringSinglyNode initialStringSinglyNode = new StringSinglyNode(name);
        this.head = initialStringSinglyNode;
    }

    public void insert(String name) {
        StringSinglyNode node = new StringSinglyNode(name);
        node.setNext(head);
        head = node;
    }

    public StringSinglyNode delete() {
        if (head == null) {
            System.out.println("StringSinglyLinkedList is empty, nothing to delete.");
            return null;
        }

        StringSinglyNode deletedStringSinglyNode = head;
        this.head = this.head.getNext();

        System.out.println("deleting: " + deletedStringSinglyNode.getName());
        return deletedStringSinglyNode;
    }

    public void printItems() {
        if (head == null) {
            System.out.println("StringSinglyLinkedList is empty.");
            return;
        }
        StringSinglyNode current = head;
        while (current != null) {
            System.out.println("node: " + current.getName());
            current = current.getNext();
        }
    }
}
