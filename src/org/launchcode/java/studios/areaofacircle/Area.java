package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle: ");
        try {
            boolean invalid = true;
            double radius = input.nextDouble();
            do {
                if (radius > 0) {
                    invalid = false;
                    double area = Circle.getArea(radius);
                    System.out.println("The area of your circle with radius " + radius + " is: " + area + " units.");
                } else {
                    System.out.println("Error! Please enter a positive number: ");
                    radius = input.nextDouble();
                }
            } while (invalid);
        } catch (Exception e) {
            System.out.println("Error: Invalid entry!");
        }
        input.close();
    }
}