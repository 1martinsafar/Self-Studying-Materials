package com.practice.stacks;

import com.practice.linkedlists.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class StackLinkedListCourse {

    private LinkedList<Employee> stack;

    public StackLinkedListCourse() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
