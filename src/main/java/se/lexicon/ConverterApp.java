package se.lexicon;

import java.util.Scanner;

public class ConverterApp {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ### Converter App ### ");
        System.out.println(" 1. Length Converter ");
        System.out.println(" 2. Weight Converter ");
        System.out.println(" 3. Time Converter ");
        System.out.println(" 4. Exit ");
        System.out.println(" Choose an option: ");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("What is the length you want to convert to: ");
            double length = scanner.nextDouble();
            System.out.println("Do you want to convert from 1. m => km or 2. km => m: ");
            int unit = scanner.nextInt();
                if (unit == 1) {
                    System.out.println("Result in kilometers: " + length / 1000);
                } else {
                    System.out.println("Result in meters: " + length * 1000);
                }
        } else if (option == 2) {
            System.out.println("Enter the value to convert: ");
            double weight = scanner.nextDouble();
            System.out.println("Which unit you want to convert 1. kg to g, 2. g to kg: ");
            int unit = scanner.nextInt();
            if (unit == 1) {
                System.out.println("Result in kilograms: " + weight * 1000);
            } else {
                System.out.println("Result in grams: " + weight / 1000);
            }
        } else if (option == 3) {
            System.out.println();
        } else {

        }



    }
}
