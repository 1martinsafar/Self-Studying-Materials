package com.practice.hashtables;

import com.practice.linkedlists.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Challenge #2

        // started code
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        System.out.println("\nLinkedList with duplicates:");
        employees.forEach(e -> System.out.println(e));
        System.out.println();


        // course code
        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            }
            else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee: remove) {
            employees.remove(employee);
        }

        System.out.println("-------------------------");
        employees.forEach(e -> System.out.println(e));


        // my code
//        Map<String, Employee> hashMap = new HashMap<>();
//
//        for (int i = 0; i < employees.size(); i++) {
//            Employee duplicate = hashMap.putIfAbsent(employees.get(i).getFirstName(), employees.get(i));
//
//            if (duplicate != null) {
//                System.out.println("found a duplicate: " + duplicate);
//                employees.remove(i);
//            }
//
//        }
//
//
//        System.out.println("\nLinkedList without duplicates:");
//        employees.forEach(e -> System.out.println(e));







        // Challenge #1

//        int[] nums = new int[10];
//        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
//        for (int i = 0; i < numsToAdd.length; i++) {
//            nums[hash(numsToAdd[i])] = numsToAdd[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }


//        Employee janeJones = new Employee("Jane", "Jones", 123);
//        Employee johnDoe = new Employee("John", "Doe", 4567);
//        Employee marySmith = new Employee("Mary", "Smith", 22);
//        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
//        Employee billEnd = new Employee("Bill", "End", 78);
//
//        SimpleHashtable ht = new SimpleHashtable();
//        ht.put("Jones", janeJones);
//        ht.put("Doe", johnDoe);
//        ht.put("Wilson", mikeWilson);
//        ht.put("Smith", marySmith);
//
//        //ht.printHashtable();
//
//        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
    }

    public static int hash(int value) {
        System.out.println("value: " + value + ", hashed: " + (Math.abs(value % 10)));
        return Math.abs(value % 10);
    }
}
