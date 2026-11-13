/**
 * Name: [Jacob Richman]
 * Date: November 12, 2026
 * Course: CSD-402 - Java for Programmers
 * Assignment: Module 5 Programming Assignment
 * 
 * Purpose: This program defines four overloaded methods to locate the row and 
 * column indices of the largest and smallest elements within two-dimensional 
 * int and double arrays, returning the coordinates as a 1D integer array.
 */

public class ArrayLocator {

    /**
     * Locates the position of the largest element in a 2D double array.
     * 
     * @param arrayParam The 2D array of doubles to search.
     * @return A 1D int array containing [row, column] of the largest element.
     */
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[]{0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the largest element in a 2D int array.
     * 
     * @param arrayParam The 2D array of integers to search.
     * @return A 1D int array containing [row, column] of the largest element.
     */
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[]{0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the smallest element in a 2D double array.
     * 
     * @param arrayParam The 2D array of doubles to search.
     * @return A 1D int array containing [row, column] of the smallest element.
     */
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[]{0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Locates the position of the smallest element in a 2D int array.
     * 
     * @param arrayParam The 2D array of integers to search.
     * @return A 1D int array containing [row, column] of the smallest element.
     */
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[]{0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    /**
     * Main method to test all four overloaded locateLargest and locateSmallest methods.
     */
    public static void main(String[] args) {
        // Sample 2D int array
        int[][] intArray = {
            {12, 45, 7},
            {89, 3, 54},
            {23, 67, 19}
        };

        // Sample 2D double array
        double[][] doubleArray = {
            {14.5, 2.3, 99.8},
            {45.1, -4.7, 33.2},
            {10.0, 88.4, 12.6}
        };

        // Test int array methods
        int[] largestIntLoc = locateLargest(intArray);
        int[] smallestIntLoc = locateSmallest(intArray);

        System.out.println("Int Array Results:");
        System.out.println("Largest element is at: [" + largestIntLoc[0] + ", " + largestIntLoc[1] + "]");
        System.out.println("Smallest element is at: [" + smallestIntLoc[0] + ", " + smallestIntLoc[1] + "]");

        System.out.println(); // Blank line for readability

        // Test double array methods
        int[] largestDoubleLoc = locateLargest(doubleArray);
        int[] smallestDoubleLoc = locateSmallest(doubleArray);

        System.out.println("Double Array Results:");
        System.out.println("Largest element is at: [" + largestDoubleLoc[0] + ", " + largestDoubleLoc[1] + "]");
        System.out.println("Smallest element is at: [" + smallestDoubleLoc[0] + ", " + smallestDoubleLoc[1] + "]");
    }
}
