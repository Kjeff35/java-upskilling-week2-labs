package org.example.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();
        boolean running = true;

        while (running) {
            System.out.println("\nTask Scheduler Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Remove a task");
            System.out.println("3. Display current queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    scheduler.addTask(task);
                    break;
                case 2:
                    scheduler.removeTask();
                    break;
                case 3:
                    scheduler.displayQueue();
                    break;
                case 4:
                    System.out.println("Exiting the Task Scheduler.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
