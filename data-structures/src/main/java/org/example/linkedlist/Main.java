package org.example.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Interactive loop
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete");
            System.out.println("5. Search");
            System.out.println("6. Display List");
            System.out.println("7. Exit");
            System.out.print("Choose an option (1-7): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at the beginning: ");
                    int valueToAddBegin = scanner.nextInt();
                    list.addAtBeginning(valueToAddBegin);
                    break;
                case 2:
                    System.out.print("Enter value to add at the end: ");
                    int valueToAddEnd = scanner.nextInt();
                    list.addAtEnd(valueToAddEnd);
                    break;
                case 3:
                    System.out.print("Enter value to add: ");
                    int valueToAddPosition = scanner.nextInt();
                    System.out.print("Enter position to add at: ");
                    int position = scanner.nextInt();
                    list.addAtPosition(valueToAddPosition, position);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    int valueToDelete = scanner.nextInt();
                    list.delete(valueToDelete);
                    break;
                case 5:
                    System.out.print("Enter value to search for: ");
                    int valueToSearch = scanner.nextInt();
                    list.search(valueToSearch);
                    break;
                case 6:
                    list.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (choice != 7);

        scanner.close();
    }
}
