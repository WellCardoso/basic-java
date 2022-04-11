package secao08;

import java.util.Locale;
import java.util.Scanner;

public class ComOO65 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle65 x, y;
        x = new Triangle65();
        y = new Triangle65();

        System.out.print("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();


        System.out.print("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Large area: X");
        } else {
            System.out.println("Large area: Y");
        }

        scanner.close();
    }
}
