/**
 * COSC 2100 – Fall 2023
 * Worksheet #5
 * This program takes 3 ArrayLists of varying sizes and uses the bubblesort method to sort them, then returns the sorted lists.
 * After sorting, the program then merges the sorted ArrayLists in one ArrayList.
 * @author Darius Dahl
 */

package Worksheet_5;

import java.util.ArrayList;
import java.util.Random;

public class MergeSortedArrayLists {

    public static void main(String[] args) {
        // Define the sizes of A, B, and C
        int P = 10; // Number of elements in A
        int Q = 50; // Number of elements in B
        int R = 100; // Number of elements in C

        // Initialize A, B, and C with random numbers
        ArrayList<Integer> A = initializeRandomList(P);
        ArrayList<Integer> B = initializeRandomList(Q);
        ArrayList<Integer> C = initializeRandomList(R);

        System.out.println("Before sorting:");

        // Print the lists before sorting
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        // Sort A, B, and C using Bubble Sort
        A = bubbleSort(A);
        B = bubbleSort(B);
        C = bubbleSort(C);

        System.out.println("\nAfter sorting:");

        // Print the lists after sorting
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);

        // Merge the sorted lists
        ArrayList<Integer> mergedList = mergeLists(A, B, C);

        // Print the merged list
        System.out.println("\nMerged List:");
        System.out.println(mergedList);
    }

    public static ArrayList<Integer> initializeRandomList(int size) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(500)); // Generate random numbers between 0 and 499
        }
        return list;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    // Swap elements if not in ascending order
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
        return list;
    }

    public static ArrayList<Integer> mergeLists(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        // Initialize an empty merged list
        ArrayList<Integer> mergedList = new ArrayList<>();

        // Initialize pointers and smallest element tracker
        int i = 0, j = 0, k = 0;
        int smallestIndex = -1;

        while (i < A.size() || j < B.size() || k < C.size()) {
            // Find the smallest element among the remaining elements of each list
            int smallest = Integer.MAX_VALUE;
            if (i < A.size() && A.get(i) <= smallest) {
                smallest = A.get(i);
                smallestIndex = 0;
            }
            if (j < B.size() && B.get(j) <= smallest) {
                smallest = B.get(j);
                smallestIndex = 1;
            }
            if (k < C.size() && C.get(k) <= smallest) {
                smallest = C.get(k);
                smallestIndex = 2;
            }

            // Add the smallest element to the merged list
            mergedList.add(smallest);

            // Update the pointer based on the smallest element's list
            switch (smallestIndex) {
                case 0:
                    i++;
                    break;
                case 1:
                    j++;
                    break;
                case 2:
                    k++;
                    break;
            }

            // Loop through remaining elements of other lists to check for new smallest
            while ((i < A.size() && A.get(i) < smallest) ||
                    (j < B.size() && B.get(j) < smallest) ||
                    (k < C.size() && C.get(k) < smallest)) {
                switch (smallestIndex) {
                    case 0:
                        if (A.get(i) < smallest) {
                            smallest = A.get(i);
                            smallestIndex = 0;
                        }
                        i++;
                        break;
                    case 1:
                        if (B.get(j) < smallest) {
                            smallest = B.get(j);
                            smallestIndex = 1;
                        }
                        j++;
                        break;
                    case 2:
                        if (C.get(k) < smallest) {
                            smallest = C.get(k);
                            smallestIndex = 2;
                        }
                        k++;
                        break;
                }
            }
        }

        return mergedList;
    }
}
