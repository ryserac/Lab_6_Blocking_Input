import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gasGallons = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0;
        double totalGasPrice;
        double tankMiles;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gasGallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                gasPrice = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
        }
        while (!done);
        tankMiles = gasGallons * fuelEfficiency;
        totalGasPrice = (100 / fuelEfficiency) * gasPrice;
        System.out.println("Price per 100 miles: " + totalGasPrice);
        System.out.println("The car can go " + tankMiles + " miles with the gas in the tank.");
    }
}
