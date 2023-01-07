package com.lab1.exersice4;

import java.util.Scanner;

//Exercise 4.2. CircleComputation
public class CircleComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Circle computation");
        calCircleComputation(in);

        System.out.println("\n1. Sphere computation");
        calSphereComputation(in);

        System.out.println("\n2. Cylinder computation");
        calCylinderComputation(in);
        in.close();
    }

    public static void calCircleComputation(Scanner in) {
        double radius;
        double diameter;
        double circumference;
        double area;

        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }

    //1
    public static void calSphereComputation(Scanner in) {
        double radius;
        double surfaceArea;
        double volume;

        System.out.print("Enter the radius: ");
        radius = in.nextDouble();

        surfaceArea = 4 * Math.PI * radius * radius;
        volume = ((double) 4 / 3) * Math.PI * radius * radius  * radius;

        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }

    //2
    public static void calCylinderComputation(Scanner in) {
        double radius;
        double height;
        double baseArea;
        double surfaceArea;
        double volume;

        System.out.print("Enter the radius: ");
        radius = Double.parseDouble(in.next());
        System.out.print("Enter the height: ");
        height = Double.parseDouble(in.next());

        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI + 2.0 * baseArea;
        volume = baseArea * height;

        System.out.printf("Base area is: %.2f%n", baseArea);
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("volume is: %.2f%n", volume);
    }
}
