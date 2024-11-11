package org.example.search;

public class Main {
    public static void main(String[] args) {
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

        int[] arr = {3, 10, 17, 25, 30, 55, 72, 100};
        int target = 55;

        int linearResult = searchAlgorithms.linearSearch(arr, target);
        if (linearResult != -1) {
            System.out.println("Linear Search: Element found at index " + linearResult);
        } else {
            System.out.println("Linear Search: Element not found");
        }

        int binaryResult = searchAlgorithms.binarySearch(arr, target);
        if (binaryResult != -1) {
            System.out.println("Binary Search: Element found at index " + binaryResult);
        } else {
            System.out.println("Binary Search: Element not found");
        }
    }
}
