import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        // Variables and scanner
        Scanner in = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        boolean done = false;

        // Get valid length
        do {
            System.out.print("Enter the length of the rectangle: ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);
        done = false;

        // Get valid width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        // Calculations
        area = length * width;
        perimeter = 2 * (length + width);
        diagonal = Math.sqrt((length * length) + (width * width));

        // Display results
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The length of the diagonal is " + diagonal);
    }
}