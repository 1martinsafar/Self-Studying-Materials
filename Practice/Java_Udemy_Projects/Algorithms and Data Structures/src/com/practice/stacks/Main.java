package com.practice.stacks;

import com.practice.linkedlists.Employee;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Stack Challenge

        // should return true
        System.out.println("\n ---> " + checkForPalindrome("abccba"));
        // should return true
        System.out.println("\n ---> " + checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println("\n ---> " + checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println("\n ---> " + checkForPalindrome("hello"));
        // should return true
        System.out.println("\n ---> " + checkForPalindrome("Don't nod"));





        // my own Stack using Singly Linked List

//        StackSinglyLinkedList stackList = new StackSinglyLinkedList();
//
////        stackList.peek();
////        stackList.pop();
//
//        stackList.push(new Employee("Jane", "Jones", 123));
//        stackList.push(new Employee("John", "Doe", 4567));
//        stackList.push(new Employee("Mary", "Smith", 22));
//        stackList.push(new Employee("Mike", "Wilson", 3245));
//        stackList.push(new Employee("Bill", "End", 78));
//
//        System.out.println();
//        stackList.peek();
//        System.out.println();
//
//        stackList.pop();
//        stackList.pop();
//        stackList.pop();
//        stackList.pop();
//        stackList.pop();
//        stackList.pop();



        // course StackArray

//        StackArrayCourse stack = new StackArrayCourse(10);
//
//        stack.push(new Employee("Jane", "Jones", 123));
//        stack.push(new Employee("John", "Doe", 4567));
//        stack.push(new Employee("Mary", "Smith", 22));
//        stack.push(new Employee("Mike", "Wilson", 3245));
//        stack.push(new Employee("Bill", "End", 78));
//
//        //stack.printStack();
//
//        System.out.println(stack.peek());
//        //stack.printStack();
//
//        System.out.println("Popped: " + stack.pop());
//        System.out.println(stack.peek());




        // my own StackArray and StackArrayList

//        StackArrayList stackArrayList = new StackArrayList();
//
//        stackArrayList.peek();
//        stackArrayList.pop();
//        System.out.println();
//
//        stackArrayList.push("One");
//        stackArrayList.push("Two");
//        stackArrayList.push("Three");
//        stackArrayList.push("Four");
//
//        System.out.println();
//        stackArrayList.peek();
//        System.out.println();
//
//        stackArrayList.pop();
//        stackArrayList.pop();
//
//        System.out.println();
//        stackArrayList.peek();
//        System.out.println();
//
//        stackArrayList.pop();
//        stackArrayList.pop();
//
//        System.out.println();
//        stackArrayList.peek();
//        System.out.println();
//
//        stackArrayList.pop();
//
//        System.out.println();
//        stackArrayList.peek();
//        System.out.println();
//
//        stackArrayList.push("Test");


//        StackArray stackArray = new StackArray();
//
//        stackArray.push("One");
//        stackArray.push("Two");
//        stackArray.push("Three");
//        stackArray.push("Four");
//
//        System.out.println();
//        stackArray.peek();
//        stackArray.peek();
//        System.out.println();
//
//        stackArray.pop();
//        stackArray.pop();
//
//        stackArray.push("Test");
//
//        stackArray.pop();
//        stackArray.pop();
//        stackArray.pop();
//
//        stackArray.pop();
//
//        stackArray.push("TestAgain");
//        stackArray.pop();
//        stackArray.peek();

    }

//    // should return true
//        System.out.println(checkForPalindrome("abccba"));
//    // should return true
//        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
//    // should return true
//        System.out.println(checkForPalindrome("I did, did I?"));
//    // should return false
//        System.out.println(checkForPalindrome("hello"));
//    // should return true
//        System.out.println(checkForPalindrome("Don't nod"));

    public static boolean checkForPalindrome(String string) {
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

    public static boolean checkForPalindromeCourse(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversedString = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString().equals(stringNoPunctuation.toString());
    }

}
