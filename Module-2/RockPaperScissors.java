/*
 * Name: Jacob Richman
 * Course: CSD-402
 * Module: Rock-Paper-Scissors Assignment
 * Date: November 2nd, 2026
 *
 * This program allows a user to play Rock-Paper-Scissors
 * against the computer. The computer randomly selects
 * Rock, Paper, or Scissors and the user enters a choice.
 * The program then displays the selections and the result.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate computer choice (1-3)
        int computerChoice = random.nextInt(3) + 1;

        // User input
        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1-3): ");

        int userChoice = input.nextInt();

        String computerMove = "";
        String userMove = "";
        String result = "";

        // Convert computer number to text
        switch (computerChoice) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }

        // Convert user number to text
        switch (userChoice) {
            case 1:
                userMove = "Rock";
                break;
            case 2:
                userMove = "Paper";
                break;
            case 3:
                userMove = "Scissors";
                break;
            default:
                System.out.println("Invalid choice. Please run the program again.");
                System.exit(0);
        }

        // Determine winner
        if (userChoice == computerChoice) {
            result = "It's a Tie!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            result = "You Win!";
        } else {
            result = "Computer Wins!";
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Computer selected: " + computerMove);
        System.out.println("You selected: " + userMove);
        System.out.println(result);

        input.close();
    }
}