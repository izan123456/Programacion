/* import java.util.Scanner;

public class Ejercicio57UD2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número entero: ");
        int n = sc.nextInt();



    }

    public static int esPrimo(Scanner sc) {

        if (n <= 0) {
            System.out.println("El número no es válido: tiene que ser positivo.");

        } else if (n == 1) {
            System.out.println("El 1 no se considera primo.");

        } else {
            boolean primo = true;

            for (int d = 2; d * d <= n; d++) {
                if (n % d == 0) {
                    primo = false;
                    break;
                }
            }
        }
        return n;

        public static void resultado(n, esPrimo()) {
                System.out.println(n + (primo ? " es primo." : " no es primo."));
        }

        sc.close();
    }
}

 */