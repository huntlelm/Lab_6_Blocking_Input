import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        // Variables and scanner
        Scanner in = new Scanner(System.in);

        double gallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double costPer100 = 0;
        double distance = 0;
        String trash = "";
        boolean done = false;

        // Gallons of gas in tank
        do {
            System.out.print("Enter how many gallons of gas are in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);
        done = false;

        // Fuel efficiency in mpg
        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);
        done = false;

        // Price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Please enter a valid number.");
            }
        } while (!done);

        // Calculations
        costPer100 = (100 / fuelEfficiency) * pricePerGallon;
        distance = gallons * fuelEfficiency;

        // Display results
        System.out.println("It costs $" + costPer100 + " to drive 100 miles");
        System.out.println("The car can travel " + distance + " miles with a full tank");
    }
}