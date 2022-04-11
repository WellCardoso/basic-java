package secao08.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Enter your name: ");
        funcionario.name = scanner.nextLine();


        System.out.print("Enter your salary: ");
        funcionario.grossSalary = scanner.nextDouble();


        System.out.print("Enter your tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.print("Which percentage in increment salary? ");
        double percentage = scanner.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println(funcionario);

        scanner.close();
    }

}
