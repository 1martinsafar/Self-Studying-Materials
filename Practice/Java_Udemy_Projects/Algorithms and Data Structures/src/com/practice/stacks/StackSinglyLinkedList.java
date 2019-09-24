package com.practice.stacks;

import com.practice.linkedlists.Employee;
import com.practice.linkedlists.EmployeeLinkedList;
import com.practice.linkedlists.EmployeeSinglyNode;

public class StackSinglyLinkedList {

    private EmployeeLinkedList stack;
    private EmployeeSinglyNode top;

    public StackSinglyLinkedList() {
        stack = new EmployeeLinkedList();
        top = stack.getHead();
    }

    public void push(Employee item) {
        System.out.println("push(), current top: " + top + ", adding: " + item);
        EmployeeSinglyNode newItem = new EmployeeSinglyNode(item);
        newItem.setNext(top);
        top = newItem;
        System.out.println("new top: " + top);
    }

    public Employee pop() {
        System.out.println("pop(), current top: " + top);
        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }
        Employee popped = top.getEmployee();
        top = top.getNext();
        System.out.println("removing: " + popped);
        System.out.println("new top: " + top);
        return popped;
    }

    public void peek() {
        System.out.println("top: " + top);
    }
}
