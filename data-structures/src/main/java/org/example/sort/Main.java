package org.example.sort;

public class Main {
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        int[] bubbleSortArr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array for Bubble Sort:");
        printArray(bubbleSortArr);
        sortingAlgorithms.bubbleSort(bubbleSortArr);
        System.out.println("Sorted array using Bubble Sort:");
        printArray(bubbleSortArr);

        int[] selectionSortArr = {64, 25, 12, 22, 11};
        System.out.println("\nOriginal array for Selection Sort:");
        printArray(selectionSortArr);
        sortingAlgorithms.selectionSort(selectionSortArr);
        System.out.println("Sorted array using Selection Sort:");
        printArray(selectionSortArr);
    }
}
