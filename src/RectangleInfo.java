import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        double width = 0.0;
        double height = 0.0;
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Please enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        done = false;
        do {
            System.out.print("Please enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        System.out.println("The area of the rectangle is " + width * height);
        System.out.println("The perimeter of the rectangle is " + 2 * (width + height));
        System.out.println("The diagonal of the rectangle is " + Math.sqrt(width * width + height * height));
    }
}
