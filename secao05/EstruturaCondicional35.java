package secao05;

import java.util.Scanner;

public class EstruturaCondicional35 {
    public static void main(String[] args) {
        int hora;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas horas: ");
        hora = scanner.nextInt();

        if(hora < 12){
            System.out.println("Bom dia");
        }
        else if(hora < 18){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        scanner.close();
    }
}
