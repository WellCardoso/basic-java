package secao06;

import java.util.Scanner;

public class Para_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos numeros serão somados: ");
        int N = scanner.nextInt();

        int soma = 0;

        for (int i = 0; i < N; i++){
            int x = scanner.nextInt();
            soma += x;
        }

        System.out.println(soma);

        scanner.close();
    }
}
