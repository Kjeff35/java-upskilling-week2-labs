package org.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    private Queue<String> taskQueue;

    public TaskScheduler() {
        taskQueue = new LinkedList<>();
    }

    public void addTask(String task) {
        taskQueue.offer(task);
        System.out.println("Task '" + task + "' added to the queue.");
    }

    public void removeTask() {
        if (!taskQueue.isEmpty()) {
            String completedTask = taskQueue.poll();
            System.out.println("Task '" + completedTask + "' has been completed and removed.");
        } else {
            System.out.println("No tasks in the queue to remove.");
        }
    }

    public void displayQueue() {
        if (!taskQueue.isEmpty()) {
            System.out.println("Current task queue:");
            int index = 1;
            for (String task : taskQueue) {
                System.out.println(index++ + ". " + task);
            }
        } else {
            System.out.println("The task queue is empty.");
        }
    }
}
