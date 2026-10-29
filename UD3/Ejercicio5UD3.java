
import java.util.Scanner;

public class Ejercicio5UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine();

        System.out.println("Introduce el límite inferior");
        int inf = sc.nextInt();

        System.out.println("Introduce el límite superior");
        int sup = sc.nextInt();

        if (inf < 0) {
            inf = 0;
        }

        String resultado = subcadena(sup, inf, frase);

        System.out.println("La subcadena es: " + resultado);
    }

    public static String subcadena(int sup, int inf, String frase) {

        if (sup >= frase.length()) {
            sup = frase.length() - 1;
        }

        if (inf > sup) {
            return "";
        }

        String resultado = "";

        for (int a = inf; a <= sup; a++) {
            resultado = resultado + frase.charAt(a);
        }

        return resultado;
    }
}
