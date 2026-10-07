import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {

        // Variables, scanner, and generate a random number
        Scanner in = new Scanner(System.in);
        Random generator = new Random();
        int val = generator.nextInt(1, 11);
        int guess = 0;
        String trash = "";
        boolean done = false;

        // Loop until a valid integer between 1 and 10 is entered
        do {
            System.out.print("Guess the number (1-10): ");
            if (in.hasNextInt()) {
                guess = in.nextInt();

                // Check range
                if (guess >= 1 && guess <= 10) {
                    if (guess == val) {
                        System.out.println("You guess the right number!");
                    }
                    else {
                        System.out.println("You guessed the wrong number");
                    }
                    done = true;
                }
                else {
                    System.out.println("Incorrect! Please enter a number between 1 and 10.");
                }
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid integer.");
            }
        } while (!done);

        // Display the random number and result
        System.out.println("\nThe random number was: " + val);

        if (guess < val) {
            System.out.println("Your guess was LOW!");
        } else if (guess > val) {
            System.out.println("Your guess was HIGH!");
        } else {
            System.out.println("Your guess was ON THE MONEY!");
        }
    }
}