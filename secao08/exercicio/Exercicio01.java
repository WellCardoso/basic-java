package secao08.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Enter rectangle height: ");
        rectangle.height = scanner.nextDouble();

        System.out.println();
        System.out.println(rectangle);
    }
}
