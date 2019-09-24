package com.practice.linkedlists;

public class Main {

    public static void main(String[] args) {

        // Challenge #2

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;
        Integer minusOne = -1;
        Integer zero = 0;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(four);
        list.printList();

        list.insertSorted(minusOne);
        list.printList();
        list.insertSorted(zero);
        list.printList();



        // Challenge #1

//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilson);
//        list.printList();
//
//        list.addBefore(billEnd, johnDoe);
//        list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
//        list.printList();








//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//
//        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
//
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilson);
//
//        list.printList();
//        System.out.println(list.getSize());
//
//        Employee billEnd = new Employee("Bill", "End", 78);
//        list.addToEnd(billEnd);
//        list.printList();
//        System.out.println(list.getSize());
//        list.removeFromFront();
//        list.printList();
//        System.out.println(list.getSize());
//        list.removeFromEnd();
//        list.printList();
//        System.out.println(list.getSize());


//        StringDoublyLinkedList doublyList = new StringDoublyLinkedList();
//        doublyList.insertAtFront("John");
//        doublyList.insertAtFront("Jane");
//        doublyList.insertAtFront("Bill");
//        doublyList.insertAtFront("Mary");
//
//        doublyList.insertAtEnd("Mary");
//        doublyList.insertAtEnd("Mike");
//
//        System.out.println();
//        doublyList.printList();
//        System.out.println();

//        doublyList.deleteFromFront();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromEnd();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromFront();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromEnd();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromFront();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromEnd();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromFront();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();
//        doublyList.deleteFromEnd();
//        System.out.println();
//        doublyList.printList();
//        System.out.println();

//        doublyList.insertBetweenNoDuplicates("Robert", "Mary", "Mike");
//        doublyList.insertBetweenDuplicates("Robert", "Mary", "Mike");
//        doublyList.printList();
//
//        doublyList.deleteBetweenDuplicates("Robert", "Mary", "Mike");
//        doublyList.deleteBetweenDuplicates("Robert", "Mary", "Mike");
//        doublyList.printList();


//        StringSinglyLinkedList stringSinglyLinkedList = new StringSinglyLinkedList("Mike");
//        stringSinglyLinkedList.insert("Mary");
//        stringSinglyLinkedList.insert("John");
//        stringSinglyLinkedList.insert("Jane");
//        stringSinglyLinkedList.insert("Bill");
//
//
//        stringSinglyLinkedList.printItems();
//
//        System.out.println();
//
//        stringSinglyLinkedList.delete();
//        stringSinglyLinkedList.delete();
//        stringSinglyLinkedList.delete();
//        stringSinglyLinkedList.delete();
//        stringSinglyLinkedList.delete();
//        stringSinglyLinkedList.delete();
//
//
//        StringSinglyLinkedList emptySinglyLinkedList = new StringSinglyLinkedList();
//        emptySinglyLinkedList.printItems();
//
//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//
//        EmployeeLinkedList list = new EmployeeLinkedList();
//
//        System.out.println(list.isEmpty());
//
//        list.addToFront(janeJones);
//        list.addToFront(johnDoe);
//        list.addToFront(marySmith);
//        list.addToFront(mikeWilson);
//
//        System.out.println(list.getSize());
//
//        list.printList();
//
//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();
    }
}
