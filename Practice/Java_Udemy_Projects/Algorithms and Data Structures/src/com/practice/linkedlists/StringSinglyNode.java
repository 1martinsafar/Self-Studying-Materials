package com.practice.linkedlists;

public class StringSinglyNode {

    private String name;
    private StringSinglyNode next;

    public StringSinglyNode(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringSinglyNode getNext() {
        return next;
    }

    public void setNext(StringSinglyNode next) {
        this.next = next;
    }
}
