package org.example.linkedlist;

public class LinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(data + " added at the beginning.");
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(data + " added at the end.");
    }

    public void addAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            addAtBeginning(data);
            return;
        }

        Node current = head;
        int index = 0;

        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Position out of bounds. Adding " + data + " at the end.");
            addAtEnd(data);
        } else {
            newNode.next = current.next;
            current.next = newNode;
            System.out.println(data + " added at position " + position + ".");
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                System.out.println(data + " found in the list.");
                return true;
            }
            current = current.next;
        }
        System.out.println(data + " not found in the list.");
        return false;
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete " + data);
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted from the list.");
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println(data + " not found in the list.");
        } else {
            current.next = current.next.next;
            System.out.println(data + " deleted from the list.");
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}

