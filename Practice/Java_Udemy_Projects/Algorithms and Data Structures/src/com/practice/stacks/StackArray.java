package com.practice.stacks;

import com.practice.sorts.Helpers;

public class StackArray {

    private String[] stack;
    private int indexAt;
    private String top;

    public StackArray() {
        stack = new String[10];
        indexAt = 0;
        top = stack[indexAt];
    }

    public void push(String name) {
//        System.out.println("push(), indexAt: " + indexAt + ", adding: " + name);
        if (indexAt >= stack.length) {
            String[] newArray = new String[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
        }
        stack[indexAt] = name;
        top = stack[indexAt];
        indexAt++;
//        Helpers.printArray(stack);
//        System.out.println("new indexAt: " + indexAt);
    }

    public String pop() {
//        System.out.println("pop(), indexAt: " + indexAt + ", top: " + top);

        if (top == null) {
//            System.out.println("Stack is empty already.");
            return null;
        }

        String item = top;
        stack[indexAt - 1] = null;
        indexAt--;

        if (indexAt > 0) {
            top = stack[indexAt - 1];
        }
        else {
            top = stack[0];
        }

//        System.out.println("popping: " + item);
//        System.out.println("new top: " + top);
//        Helpers.printArray(stack);
        return item;
    }

    public String peek() {
//        System.out.println("peek: " + top);
        return top;
    }
}
