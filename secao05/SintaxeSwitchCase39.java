package secao05;

import java.util.Scanner;

public class SintaxeSwitchCase39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        int x = scanner.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "domingo";
                break;

            case 2:
                dia = "segunda";
                break;

            case 3:
                dia = "terça";
                break;

            case 4:
                dia = "quarta";
                break;

            case 5:
                dia = "quinta";
                break;

            case 6:
                dia = "sexta";
                break;

            case 7:
                dia = "sabado";
                break;

            default:
                dia = "valor invalido";
        }

        System.out.print("Dia da semana é igual: " + dia);
    }
}
