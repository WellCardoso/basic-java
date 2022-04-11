package secao08;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo67 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product67 product = new Product67();

        System.out.print("Enter product data: ");
        product.name = scanner.nextLine();

        System.out.print("Enter product price: ");
        product.price = scanner.nextDouble();

        System.out.print("Enter product quantity: ");
        product.quantity = scanner.nextInt();

        System.out.println(product);

        System.out.println();
        System.out.print("Enter the number of products added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println("Updated products" + product);

        System.out.println();
        System.out.print("Enter the number of products remove in stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("Updated products" + product);

        scanner.close();
    }
}
