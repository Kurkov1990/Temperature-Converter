package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a conversion:");
        System.out.println("F: Celsius To Fahrenheit");
        System.out.println("C: Fahrenheit To Celsius");


        Character convType = sc.next().charAt(0);
        double inputValue;
        double convertedValue;
        String exit;

        switch (convType) {
            case 'F':
                while (true) {
                    System.out.print("Enter temperature in Celsius:");
                    inputValue = sc.nextDouble();
                    convertedValue = celsiusToFahrenheit(inputValue);
                    System.out.println("Result is " + convertedValue + " fahrenheit.");
                    System.out.println("Do you want to continue? (yes/no)");
                    exit = sc.next();
                    if (exit.equalsIgnoreCase("no")) {
                        return;
                    }
                }

            case 'C':
                while (true) {
                    System.out.print("Enter temperature in fahrenheit:");
                    inputValue = sc.nextDouble();
                    convertedValue = fahrenheitToCelsius(inputValue);
                    System.out.println("Result is " + convertedValue + " celsius.");
                    System.out.println("Do you want to continue? (yes/no)");
                    exit = sc.next();
                    if (exit.equalsIgnoreCase("no")) {
                        return;
                    }
                }
            default:
                System.out.println("Incorrect choice!");
                break;
        }
        sc.close();
    }

    // Converting Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Converting Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
