import java.util.Scanner;

public class HeatWater {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:");
        double waterMass = input.nextDouble();

        System.out.println("Enter the initial temperature in Celsius:");
        double initialTemperature = input.nextDouble();

        System.out.println("Enter the final temperature in Celsius:");
        double finalTemperature = input.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy needed is " + Q + " Joules.");

        input.close();
    }
}