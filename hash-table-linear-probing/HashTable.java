/**
 * COSC 2100 - Fall 2023
 * Assignment #6
 * Assignment Problem based on Hashing
 * Implementation of HashTable class using an array to hold the elements.
 * One constructor is provided that allows the calling program to
 * specify the size of the hash table.
 * 
 * @author Dr. Niharika Jain
 */

package Homework_6;

public class HashTable {

    protected int[] elements; // holds hash table elements, int type
    protected int numElements = 0; // no. of elements in the hash table

    // Constructor
    public HashTable(int maxSize) {
        elements = new int[maxSize];
    }

    public void addLP(int element) {
        // Calculate initial hash index
        int index = element % elements.length;

        // Check for collisions. If a collision happens, then use the linear probing
        // method to move the element to the
        // next unoccupied index.
        while (elements[index] != 0) {
            // Linear probing method
            index = (index + 1) % elements.length;

            // Check if table is full
            if (numElements == elements.length) {
                System.out.println("Hash table is full! Cannot add element: " + element);
                return;
            }
        }

        // Add element at the empty index
        elements[index] = element;
        numElements++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != 0) {
                sb.append(elements[i] + ", ");
            } else {
                sb.append("-, ");
            }
        }

        // Remove comma and space
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 2);
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create a hash table with size 5
        HashTable hashTable = new HashTable(5);

        // Print initial empty hash table
        System.out.println("Empty hash table:");
        System.out.println(hashTable.toString());

        System.out.println();

        // Add some elements and print out the hash table after each one
        System.out.println("Start adding elements:");
        hashTable.addLP(936);
        System.out.println(hashTable.toString());
        hashTable.addLP(25);
        System.out.println(hashTable.toString());
        hashTable.addLP(374);
        System.out.println(hashTable.toString());
        hashTable.addLP(237);
        System.out.println(hashTable.toString());
        hashTable.addLP(587);
        System.out.println(hashTable.toString());

        // Print the hash table before attempting to add an element to the full table
        System.out.println("\nFull table:");
        System.out.println(hashTable.toString());

        System.out.println();

        // Try adding an element to a full table
        hashTable.addLP(1);

        // Print the hash table after the table is full to display no change
        System.out.println("\nNo change occured.");
        System.out.println(hashTable.toString());

        System.out.println();

        // Search for an element
        int element = 237;
        int index = -1;
        for (int i = 0; i < hashTable.elements.length; i++) {
            if (hashTable.elements[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + element + " found at index " + index);
        } else {
            System.out.println("Element " + element + " not found");
        }
    }
}
