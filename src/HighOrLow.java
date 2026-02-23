import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        Random generator = new Random();
        int val = generator.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        int guess = 0;
        String trash = "";

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine();

            } else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + " Please enter a number.");
                continue;
            }
            if (guess <1 || guess > 10) {
                System.out.println("Invalid input, Please enter a number between 1 and 10.");
                continue;
            } else if (guess == val) {
            } else if (guess > val) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
        }while (guess != val);

        System.out.println("You guessed Correctly! The number was " + val + ".");
    }
}
