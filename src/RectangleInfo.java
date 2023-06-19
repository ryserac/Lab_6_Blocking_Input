import java.util.Scanner;

import static java.lang.Math.sqrt;

public class RectangleInfo {
    public static void main(String[] args) {
        double recHeight = 0;
        double recWidth = 0;
        double area;
        double perimeter;
        double diagonal;
        String trash = "";
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter the height: ");
            if (in.hasNextDouble()) {
                recHeight = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
            System.out.print("Enter the width: ");
            if (in.hasNextDouble()) {
                recWidth = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("Must enter a valid number: " + trash + "\n");
            }
        }
        while (!done);
        area = recHeight * recWidth;
        perimeter = (recHeight * 2) + (recWidth * 2);
        diagonal = sqrt((recHeight * recHeight) + (recWidth * recWidth));
        System.out.println("Area equals: " + area);
        System.out.println("Perimeter equals: " + perimeter);
        System.out.println("Diagonal equals: " + diagonal);
    }
}