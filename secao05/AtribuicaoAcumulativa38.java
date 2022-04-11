package secao05;

import java.util.Locale;
import java.util.Scanner;

public class AtribuicaoAcumulativa38 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("insira os minutos: ");
        int minutos = scanner.nextInt();

        double conta = 50.0;

        if(minutos > 100){
            conta += (minutos - 100) * 2;
        }

        System.out.print("Valor da conta = R$" + conta);

        scanner.close();
    }
}
