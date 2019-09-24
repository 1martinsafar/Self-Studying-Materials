package com.practice.linkedlists;

public class EmployeeLinkedList {

    private EmployeeSinglyNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeSinglyNode node = new EmployeeSinglyNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeSinglyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeSinglyNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeSinglyNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // for Stack using Singly Linked List implementation
    public EmployeeSinglyNode getHead() {
        return head;
    }
}
