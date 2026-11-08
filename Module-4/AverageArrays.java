/*
 * Name: Jacob Richman
 * Course: CSD-402
 * Module: 4
 * Assignment: Overloaded Average Methods
 * Date: 11/07/2026
 *
 * This program demonstrates method overloading by calculating
 * the average value of arrays containing different numeric data types.
 */

public class AverageArrays {

    // Average method for short array
    public static short average(short[] array) {
        short sum = 0;

        for (short value : array) {
            sum += value;
        }

        return (short) (sum / array.length);
    }

    // Average method for int array
    public static int average(int[] array) {
        int sum = 0;

        for (int value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Average method for long array
    public static long average(long[] array) {
        long sum = 0;

        for (long value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    // Average method for double array
    public static double average(double[] array) {
        double sum = 0;

        for (double value : array) {
            sum += value;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Different-sized arrays
        short[] shortArray = {10, 20, 30, 40};

        int[] intArray = {5, 10, 15, 20, 25, 30};

        long[] longArray = {100L, 200L, 300L, 400L, 500L};

        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display short array
        System.out.println("SHORT ARRAY:");
        for (short value : shortArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(shortArray));

        System.out.println("\n--------------------------------");

        // Display int array
        System.out.println("INT ARRAY:");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(intArray));

        System.out.println("\n--------------------------------");

        // Display long array
        System.out.println("LONG ARRAY:");
        for (long value : longArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(longArray));

        System.out.println("\n--------------------------------");

        // Display double array
        System.out.println("DOUBLE ARRAY:");
        for (double value : doubleArray) {
            System.out.print(value + " ");
        }
        System.out.println("\nAverage: " + average(doubleArray));
    }
}