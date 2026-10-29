
import java.util.Scanner;

public class Ejercicio1UD3 {

    public static boolean hayNegativo(Scanner sc) {
        boolean hayNegativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int n = sc.nextInt();

            if (n < 0) {
                hayNegativo = true;
            }
        }

        return hayNegativo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean resultado = hayNegativo(sc);

        System.out.println(resultado
                ? "Sí, había algún negativo."
                : "No, ninguno era negativo.");
    }
}



