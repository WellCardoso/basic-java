package secao07;

import java.util.Arrays;
import java.util.Locale;

public class FuncoesParaString59 {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG  ";
        String s = "potato apple lemon";

        String[] vect = s.split(" ");

        String minuscula = original.toLowerCase();
        String maiscula = original.toUpperCase();
        String stringTrim = original.trim();
        String subString = original.substring(2);
        String subString2 = original.substring(2,9);
        String stringReplace = original.replace("a", "x");
        String stringReplace2 = original.replace("abc", "xy");
        // Testae com o A e a praverse troca
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: " + original + "!");
        System.out.println("Minusculo" + minuscula + "!");
        System.out.println("Maiusculo" + maiscula + "!");
        System.out.println("Trim: " + stringTrim + "!");
        System.out.println("Substring: " + subString + "!");
        System.out.println("Substring2: " + subString2 + "!");
        System.out.println("Replace: " + stringReplace + "!");
        System.out.println("Replace2: " + stringReplace2 + "!");
        System.out.println("IndexOf: " + i);
        System.out.println("LastIndexOf: " + j);
        System.out.println("Split: " + Arrays.toString(vect));
    }

}
