/**
 * Name: Jacob Richman
 * Date: November 13, 2026
 * Course: CSD-402 Java for Programmers
 * Assignment: Fan Class
 *
 * Purpose: This class models a fan with speed, power state,
 * radius, and color.
 */
public class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {

        if (on) {
            return "Fan is ON\n" +
                   "Speed: " + speed +
                   "\nColor: " + color +
                   "\nRadius: " + radius;
        } else {
            return "Fan is OFF\n" +
                   "Color: " + color +
                   "\nRadius: " + radius;
        }
    }
}