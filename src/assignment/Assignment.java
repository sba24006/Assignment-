/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
         https://github.com/sba24006/Assignment-/blob/master/src/assignment/Assignment.java
 */
package assignment;

import java.util.HashSet;
import java.util.Scanner;

public class Assignment {

    /**
     * Main method: Entry point of the program
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Validate the size to ensure it's a positive number
        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return; // Exit the program if the size is invalid
        }

        // Create an array to store the elements entered by the user
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];

        // Loop to read each element of the array from the user
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Store the input in the array
        }

        // Call the helper method to find the first repeated element in the array
        int firstRepeated = findFirstRepeated(array);

        // Display the result to the user
        if (firstRepeated == -1) {
            // If no repeated element is found
            System.out.println("No repeated elements found.");
        } else {
            // If a repeated element is found, display it
            System.out.println("First repeated element: " + firstRepeated);
        }
    }

    /**
     * Helper method to find the first repeated element in the array
     * 
     * @param array the input array to search for repeated elements
     * @return the first repeated element, or -1 if no repeated element is found
     */
    private static int findFirstRepeated(int[] array) {
        // Create a HashSet to keep track of elements we have seen so far
        HashSet<Integer> seen = new HashSet<>();

        // Loop through each element in the array
        for (int value : array) {
            // Check if the current value already exists in the set
            if (seen.contains(value)) {
                // If it exists, this is the first repeated element
                return value; // Return the repeated element immediately
            }
            // If it doesn't exist in the set, add it to the set
            seen.add(value);
        }

        // If the loop finishes and no repeated elements were found, return -1
        return -1;
    }
}

  
    


