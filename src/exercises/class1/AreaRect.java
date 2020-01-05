package exercises.class1;

import java.util.Scanner;

public class AreaRect {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of your rectangle: ");
        double len = input.nextDouble();
        System.out.println("Input the width of your rectangle: ");
        double width = input.nextDouble();
        double area = len * width;
        System.out.println("The area of your rectangle is " + area + " square units.");
        input.close();
    }
}