package secao07;

import java.util.Scanner;

public class Funcoes61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os 3 numeros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = max(a, b, c);

        showResult(maior);

        scanner.close();
    }

    public static Integer max(int x, int y, int z){
        int aux;

        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        }
        else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(Integer value){
        System.out.println("O maior numero: " + value);
    }
}
