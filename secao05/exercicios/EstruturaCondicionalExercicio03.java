package secao05.exercicios;

import java.util.Scanner;

public class EstruturaCondicionalExercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("São multiplos");
        } else {
            System.out.println("Não são multiplos");
        }

        scanner.close();
    }
}
