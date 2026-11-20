import java.util.ArrayList;

public class UseFans {

    // Display one Fan object
    public static void displayFan(Fan fan) {

        System.out.println("Fan Information");

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());

        System.out.println();
    }

    // Display a collection of Fan objects
    public static void displayFans(ArrayList<Fan> fans) {

        for (Fan fan : fans) {
            displayFan(fan);
        }
    }

    public static void main(String[] args) {

        ArrayList<Fan> fans = new ArrayList<>();

        fans.add(new Fan(Fan.FAST, true, 10.0, "Yellow"));
        fans.add(new Fan(Fan.MEDIUM, false, 5.0, "Blue"));
        fans.add(new Fan(Fan.SLOW, true, 8.0, "Black"));
        fans.add(new Fan(Fan.STOPPED, false, 6.0, "White"));

        System.out.println("Displaying Collection of Fans");
        System.out.println("-----------------------------");

        displayFans(fans);

        System.out.println("Displaying Single Fan");
        System.out.println("---------------------");

        displayFan(fans.get(0));
    }
}