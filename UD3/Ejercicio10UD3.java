
import java.util.Scanner;

public class Ejercicio10UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        int uno = sc.nextInt();

        System.out.println("Introduce el segundo número:");
        int dos = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        int tres = sc.nextInt();

        int mayor = maximo(uno, dos);
        int resultado = maximo(mayor, tres);

        System.out.println("El mayor es: " + resultado);

        sc.close();
    }

    public static int maximo(int uno, int dos) {
        return uno > dos ? uno : dos;
    }
}
