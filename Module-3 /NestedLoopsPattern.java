/*
 * Name: Jacob Richman
 * Course: CSD 402
 * Module 3 Assignment
 * Date: October 2026
 * Description:
 * This program uses nested for loops to display
 * a pattern of powers of 2 with an @ symbol
 * at the end of each line.
 */
public class NestedLoopsPattern {
    public static void main(String[] args) {

        for (int row = 0; row < 7; row++) {

            for (int spaces = 0; spaces < 6 - row; spaces++) {
                System.out.print("  ");
            }

            int value = 1;

            for (int i = 0; i <= row; i++) {
                System.out.print(value + " ");
                value *= 2;
            }

            value /= 4;

            for (int i = 0; i < row; i++) {
                System.out.print(value + " ");
                value /= 2;
            }

            System.out.println("@");
        }
    }
}