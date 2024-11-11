package org.example.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager(5);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    String nameToAdd = scanner.nextLine();
                    manager.addStudent(nameToAdd);
                    break;
                case 2:
                    System.out.print("Enter student name to search: ");
                    String nameToSearch = scanner.nextLine();
                    manager.searchStudent(nameToSearch);
                    break;
                case 3:
                    System.out.print("Enter student name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    manager.deleteStudent(nameToDelete);
                    break;
                case 4:
                    manager.displayStudents();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
