import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        double metricMeasure = 0;
        double miles;
        double feet;
        double inches;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter the measurement in meters: ");
            if (in.hasNextDouble()) {
                metricMeasure = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
        }
        while (!done);
        miles = metricMeasure / 1609;
        feet = metricMeasure * 3.281;
        inches = metricMeasure * 39.37;
        System.out.println("Measurement to miles is: " + miles);
        System.out.println("Measurement to feet is: " + feet);
        System.out.println("Measurement to inches is: " + inches);
    }
}
