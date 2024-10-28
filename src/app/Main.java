package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("App for temperature converting.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double farn = convFhrnToCls(fahrenheit);
        System.out.println("Result is " + farn + " celsius.");
        sc.close();
    }

    // Converting Fahrenheit to Celsius
    private static double convFhrnToCls(double farn) {
        return (farn - 32) * 5/9;
    }
}
