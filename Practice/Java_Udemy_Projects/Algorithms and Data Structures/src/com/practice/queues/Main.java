package com.practice.queues;

import com.practice.linkedlists.Employee;
import com.practice.stacks.StackArray;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {



        //
        // challenge
        //

        // should return true
        System.out.println(checkForPalindromeQueueStack("abccba"));
        // should return true
        System.out.println(checkForPalindromeQueueStack("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeQueueStack("I did, did I?"));
        // should return false
        System.out.println(checkForPalindromeQueueStack("hello"));
        // should return true
        System.out.println(checkForPalindromeQueueStack("Don't nod"));


        // course Queue using Array

//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        ArrayQueueCourse queue = new ArrayQueueCourse(10);
//        queue.add(janeJones);
//        queue.add(johnDoe);
//        queue.add(marySmith);
//        queue.add(mikeWilson);
//        queue.add(billEnd);
//        //queue.printQueue();
//
//        queue.remove();
//        queue.remove();
//        //queue.printQueue();
//
//        //System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        //queue.remove();
//
//        queue.add(mikeWilson);
//
//
//        queue.printQueue();



        // my own Queue using Array

//        ArrayQueue arrayQueue = new ArrayQueue();
//
//        arrayQueue.peek();
//        arrayQueue.dequeue();
//
//        System.out.println();
//
//        arrayQueue.enqueue("One");
//        arrayQueue.enqueue("Two");
//        arrayQueue.enqueue("Three");
//        arrayQueue.enqueue("Four");
//
//        System.out.println();
//        arrayQueue.peek();
//        System.out.println();
//
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//        arrayQueue.dequeue();
//
//        System.out.println();
//        arrayQueue.enqueue("Test");
    }


    // abcd to stack => d c b a
    // abba => a b b a

    // abcd to queue => a b c d
    // abba => a b b a
    public static boolean checkForPalindromeQueueStack(String string) {
        StackArray stack = new StackArray();
        ArrayQueue queue = new ArrayQueue();

        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //System.out.println("\nstring: " + string);

        for (int i = 0; i < string.length(); i++) {
            stack.push(String.valueOf(string.charAt(i)));
            queue.enqueue(String.valueOf(string.charAt(i)));
        }

        for (int i = 0; i < string.length(); i++) {
            //System.out.println(stack.peek());
            //System.out.println(queue.peek());
            //System.out.println();
            if (!stack.pop().equals(queue.dequeue())) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkForPalindromeQueueStackCourse(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }




    public static boolean checkForPalindromeStack(String string) {
        StackArray stack = new StackArray();

        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            stack.push(String.valueOf(string.charAt(i)));
        }

        String reversedString = "";

        for (int i = 0; i < string.length(); i++) {
            String c = stack.pop();
            reversedString += c;
        }


        if (string.equals(reversedString)) {
            return true;
        }

        return false;
    }
}
