import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        // Variables and Scanner
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;

        // Loop until a valid double is entered
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(" This temperature in Fahrenheit is " + fahrenheit);
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);
    }
}