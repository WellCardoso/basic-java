package secao05.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalExercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um numero: ");
        numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é impar");
        }

    }
}
