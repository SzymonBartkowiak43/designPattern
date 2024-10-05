package org.example.Singelton;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> figures = new ArrayList<>();

        int choice;
        do {
            System.out.println("Choose a figure to add (1 - Circle, 2 - Rectangle, 3 - Triangle, 0 - Exit): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                double radius = scanner.nextDouble();
                figures.add(new Circle(radius));
            } else if (choice == 2) {
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                figures.add(new Rectangle(width, height));
            } else if (choice == 3) {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                figures.add(new Triangle(a, b, c));
            }
        } while (choice != 0);

        System.out.println("\nFigures in the collection:");
        for (Object figure : figures) {
            if (figure instanceof Circle)
                System.out.println("Perimeter: " + ((Circle) figure).calculatePerimeter() + ", Area: " + ((Circle) figure).calculateArea());
            else
                System.out.println("Perimeter: " + ((Rectangle) figure).perimeter() + ", Area: " + ((Rectangle) figure).area());
        }

        scanner.close();
    }
    }
