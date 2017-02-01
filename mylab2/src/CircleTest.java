
/**
 * A class that uses the Circle class.
 */
public class CircleTest {

    public static void main(String args[]) {
        Circle myCircle = new Circle(10, 20, 5.5);

        double xValue;
        double yValue;
        double radius;

        xValue = myCircle.getX();
        yValue = myCircle.getY();
        radius = myCircle.getRadius();

        System.out.println("The center of myCircle is at " + xValue + ","
                + yValue + " and its radius is " + radius);

        Circle myNewCircle = new Circle(30, 15, 6.3);

        xValue = myNewCircle.getX();
        yValue = myNewCircle.getY();
        radius = myNewCircle.getRadius();

        System.out.println("\nThe center of myNewCircle is at " + xValue + ","
                + yValue + " and its radius is " + radius);

        myNewCircle.move(5, 2);

        xValue = myNewCircle.getX();
        yValue = myNewCircle.getY();

        System.out.println("\nmyNewCircle is at " + xValue + ","
                + yValue + " and its radius is " + radius);

        myNewCircle.setRadius(8);

        radius = myNewCircle.getRadius();

        System.out.println("\nThe new radius for myNewCircle is at " + radius);

        System.out.println("\nThe area of myNewCircle is " + Math.PI * radius * radius);

        myCircle.move(5, 2);

        xValue = myCircle.getX();
        yValue = myCircle.getY();

        System.out.println("\nThe new location of myCircle is at " + xValue + "," + yValue);

        radius = myCircle.getRadius();

        System.out.println("\nThe new radius for myCircle is at " + radius * 3);
    }

}
