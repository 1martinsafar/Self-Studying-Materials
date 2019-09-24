package com.practice.linkedlists;

public class EmployeeSinglyNode {

    private Employee employee;
    private EmployeeSinglyNode next;

    public EmployeeSinglyNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeSinglyNode getNext() {
        return next;
    }

    public void setNext(EmployeeSinglyNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
