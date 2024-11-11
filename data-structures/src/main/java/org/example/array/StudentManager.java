package org.example.array;

public class StudentManager {
    private String[] students;
    private int studentCount;

    public StudentManager(int studentCapacity) {
        students = new String[studentCapacity];
        studentCount = 0;
    }

    public void addStudent(String studentName) {
        if (studentCount >= students.length) {
            System.out.println("Cannot add more students.");
            return;
        }
        students[studentCount++] = studentName;
        System.out.println("Student added: " + studentName);

    }

    public void searchStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("Student found: " + name);
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                System.out.println("Student deleted: " + name);
                return;
            }
        }
        System.out.println("Student not found: " + name);
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("List of students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}
