package com.practice.linkedlists;

public class StringDoublyNode {

    private String name;
    private StringDoublyNode previous;
    private StringDoublyNode next;

    public StringDoublyNode(String name) {
        this.name = name;
        this.previous = null;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public StringDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(StringDoublyNode previous) {
        this.previous = previous;
    }

    public StringDoublyNode getNext() {
        return next;
    }

    public void setNext(StringDoublyNode next) {
        this.next = next;
    }
}
