package com.practice.trees.avl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AVLTree tree = new AVLTree();
        int choice;
        int x;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display Tree");
            System.out.println("2. Insert a new node");
            System.out.println("3. Delete a node");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Quit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            if (choice == 5) {
                break;
            }

            switch(choice) {
                case 1:
                    tree.display();
                    break;
                case 2:
                    System.out.println("Enter the key to be inserted: ");
                    x = scan.nextInt();
                    tree.insert(x);
                    break;
                case 3:
                    System.out.println("Enter the key to be deleted: ");
                    x = scan.nextInt();
                    tree.delete(x);
                    break;
                case 4:
                    tree.inorder();
                    break;
            }
        }

        scan.close();
    }
}
