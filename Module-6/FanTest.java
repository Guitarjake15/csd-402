/**
 * Name: Jacob Richman
 * Date: November 13, 2026
 * Course: CSD-402 Java for Programmers
 * Assignment: Fan Class Test
 *
 * Purpose: Tests the Fan class constructors,
 * getters, setters, and toString method.
 */
public class FanTest {

    public static void main(String[] args) {

        // Fan created with default constructor
        Fan fan1 = new Fan();

        // Fan created with argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("Default Fan:");
        System.out.println(fan1);

        System.out.println("\nArgument Fan:");
        System.out.println(fan2);

        // Demonstrate setter methods
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("\nUpdated Default Fan:");
        System.out.println(fan1);

        // Demonstrate getter methods
        System.out.println("\nGetter Method Results:");
        System.out.println("Speed: " + fan1.getSpeed());
        System.out.println("On: " + fan1.isOn());
        System.out.println("Radius: " + fan1.getRadius());
        System.out.println("Color: " + fan1.getColor());
    }
}