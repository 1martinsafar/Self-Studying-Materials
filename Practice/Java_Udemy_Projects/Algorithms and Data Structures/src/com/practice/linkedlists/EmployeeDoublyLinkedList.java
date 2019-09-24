package com.practice.linkedlists;

public class EmployeeDoublyLinkedList {

    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    // CHALLENGE #1

    // Employee has an equals() method so we can use that to compare Employees.

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (this.head == null) { // or if (isEmpty())
            return false;
        }

        EmployeeDoublyNode current = this.head;
        while (current != null) {
            if (current.getEmployee().equals(existingEmployee)) {
                System.out.println("Found the existing Employee: " + existingEmployee);
                EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmployee);
                newNode.setPrevious(current.getPrevious());
                newNode.setNext(current);

                if (current.getPrevious() == null) {
                    this.head = newNode;
                } else {
                    current.getPrevious().setNext(newNode);
                }

                current.setPrevious(newNode);
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public boolean addBeforeCourse(Employee newEmployee, Employee existingEmployee) {

        if (head == null) {
            return false;
        }

        // find the existing employee
        EmployeeDoublyNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;
        }
        else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;

        return true;
    }





    public void addToFront(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);

        if (head == null) {
            tail = node;
        }
        else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeDoublyNode node = new EmployeeDoublyNode(employee);
        if (tail == null) {
            head = node;
        }
        else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeDoublyNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        }
        else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeDoublyNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        }
        else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeDoublyNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }


}