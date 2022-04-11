package secao05;

import java.util.Locale;

public class ExpressaoTernaria40 {
    public static void main(String[] args) {
        double preco = 35.5;
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;

        System.out.println("O valor é: " + desconto);

//        if(preco < 20) {
//            desconto = preco * 0.1;
//        } else {
//            desconto = preco * 0.05;
//        }
    }
}
