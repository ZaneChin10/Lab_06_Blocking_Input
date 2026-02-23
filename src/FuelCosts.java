import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double mpg = 0.0;
        double costPerGallon = 0.0;
        double tankSize = 0.0;
        boolean done = false;

        do {
            System.out.print("Enter the miles per gallon: ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        done = false;

        do {
            System.out.print("Enter the cost per gallon: ");
            if (in.hasNextDouble()) {
                costPerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        done = false;

        do {
            System.out.print("Enter the tank size in gallons: ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                done = true;
            } else
            {
                String trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
            }
        }while(!done);

        double costFor100Miles = (100.0/mpg) * costPerGallon;
        double range = tankSize * mpg;
        System.out.println("The cost to drive 100 miles is $" + costFor100Miles + " and the range of a full tank is " + range + " miles.");
    }
}
