import java.util.Scanner;

public class CtoFConverter
{
    static void main(String[] args)
    {
        double celsius = 0.0;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + "Please enter a number.");
            }
        }
        while (!done);

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}
