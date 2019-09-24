package com.practice.stacks;

import com.practice.sorts.Helpers;

import java.util.ArrayList;
import java.util.Arrays;

public class StackArrayList {

    private ArrayList<String> stack;
    private String top;

    public StackArrayList() {
        stack = new ArrayList<String>();
        top = null;
    }

    // ArrayList add() => appends the specified element to the end of this list.
    // ArrayList remove() => removes the element at the specified position in this list.
    public void push(String name) {
        System.out.println("current top: " + top);
        stack.add(name);
        top = stack.get(stack.size() - 1);
        System.out.println("Adding: " + name + ", new top: " + top);

        System.out.println(Arrays.toString(stack.toArray()));
    }

    public String pop() {
        System.out.println("pop(), current top: " + top);

        if (stack.isEmpty()) {
            System.out.println("Stack is already empty.");
            return null;
        }

        String item = stack.get(stack.size() - 1);
        System.out.println("popping item: " + item);
        stack.remove(stack.size() - 1);

        if (stack.size() > 0) {
            top = stack.get(stack.size() - 1);
        } else {
            top = null;
        }

        System.out.println("new top: " + top);

        System.out.println(Arrays.toString(stack.toArray()));

//        for (item : stack.toArray()) {
//            System.out.print(item + ", ");
//        }

        return item;
    }

    public String peek() {
        System.out.println("peek(), top: " + top);
        return top;
    }

}
