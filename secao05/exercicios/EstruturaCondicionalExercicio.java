package secao05.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalExercicio {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        numero = scanner.nextInt();
        if(numero < 0){
            System.out.println("O numero é negativo");
        } else {
            System.out.println("Numero positivo");
        }

        scanner.close();
    }
}
