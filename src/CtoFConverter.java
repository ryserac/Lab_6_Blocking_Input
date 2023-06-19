import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter the temperature in celsius: ");
            if (in.hasNextInt()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
        }
        while (!done);
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The temperature of " + celsius + " celsius in fahrenheit is " + fahrenheit);
    }
}