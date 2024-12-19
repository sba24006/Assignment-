/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
         https://github.com/sba24006/Assignment-/blob/master/src/assignment/Assignment.java
 */
package assignment;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
         Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Validate that the size of the array is positive
        if (size <= 0) {
            System.out.println("Invalid size. Please enter a positive integer.");
            return; // Exit the program if the size is invalid
        }

        // Input: elements of the array
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Read each element into the array
        }

        // Find the first repeated element using a helper method
        int firstRepeated = findFirstRepeated(array);

        // Output the result based on the value returned by the helper method
        if (firstRepeated == -1) {
            System.out.println("No repeated elements found.");
        } else {
            System.out.println("First repeated element: " + firstRepeated);
        }
    }
        
            // Helper method to find the first repeated element in the array
    private static int findFirstRepeated(int[] array) {
        // Use a HashSet to keep track of elements that have been seen
        HashSet<Integer> seen = new HashSet<>();

        // Iterate through each element in the array
        for (int value : array) {
            // If the current value is already in the set, it is the first repeated element
            if (seen.contains(value)) {
                return value; // Return the repeated element immediately
            }
            // Otherwise, add the current value to the set
            seen.add(value);
        }

        // If no repeated elements are found, return -1
        return -1;
    }
}

  
    


