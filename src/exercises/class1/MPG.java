package exercises.class1;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of miles driven: ");
        double miles = input.nextDouble();
        System.out.println("Please enter the number of gallons consumed: ");
        double gals = input.nextDouble();
        System.out.println("You got " + miles/gals + " miles per gallon of fuel.");
        input.close();
    }
}