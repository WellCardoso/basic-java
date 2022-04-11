package secao08.versions;

import secao08.versions.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosStatic71 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.println("Value PI: " + Calculator.PI);

        scanner.close();
    }



}
