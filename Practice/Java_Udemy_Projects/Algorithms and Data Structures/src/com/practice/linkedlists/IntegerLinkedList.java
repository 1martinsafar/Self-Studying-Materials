package com.practice.linkedlists;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {

        IntegerNode newNode = new IntegerNode(value);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        IntegerNode current = head;
        IntegerNode previous = null;
        while (current.getNext() != null && current.getValue() < value) {
            previous = current;
            current = current.getNext();
        }

        if (current.getValue() < value) {
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        } else {
            newNode.setNext(current);
            if (previous == null) {
                head = newNode;
            } else {
                previous.setNext(newNode);
            }
        }

        size++;
    }

    public void insertSortedCourse(Integer value) {
        // assumption: the list is sorted

        if (head == null || head.getValue() >= value) {
            addToFront(value);
            return;
        }                                                           // 0 2  adding 1

        // find the insertion point
        IntegerNode current = head.getNext();                       // 2
        IntegerNode previous = head;                                // 0
        while (current != null && current.getValue() < value) {     // current = 2 => true && false 2 < 1
            previous = current;
            current = current.getNext();
        }

        IntegerNode newNode = new IntegerNode(value);
        newNode.setNext(current);                                   // 1's next: 2
        previous.setNext(newNode);                                  // 0's next: 1

        size++;
    }





    // null 1 null
    // Challenge #2
    public void insertSortedComments(Integer value) {

        IntegerNode newNode = new IntegerNode(value);

        if (head == null) {
            System.out.println("List is empty, adding first element.");
            head = newNode;
            size++;
            return;
        }

        IntegerNode current = head;
        IntegerNode previous = null;
        System.out.println("current start: " + current);
        while (current.getNext() != null && current.getValue() < value) {
            System.out.println("current now: " + current);
            System.out.println("previous now: " + previous);
            System.out.println("current.getNext(): " + current.getNext());
            previous = current;
            current = current.getNext();
        }

        System.out.println("--- outside while ---");
        System.out.println("current now: " + current);
        System.out.println("previous now: " + previous);
        if (current.getNext() != null) {
            System.out.println("current.getNext(): " + current.getNext());
        } else {
            System.out.println("current.getNext(): NULL");
        }


        if (current.getValue() < value) {
            System.out.println("IF, current < value, " + "newNode: " + newNode + ", current: " + current);
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        } else {
            System.out.println("ELSE, newNode: " + newNode + ", previous: " + previous + ", current: " + current + " current.getNext(): " + current.getNext());
            newNode.setNext(current);
            if (previous == null) {
                head = newNode;
            } else {
                previous.setNext(newNode);
            }
        }

        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        int i = 0;
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
            i++;
            if (i > 10) {
                System.out.println("<Error>");
                break;
            }
        }
        System.out.println("null");
    }

}