import java.util.Scanner;

public class Ejercicio7UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int n = sc.nextInt();

    boolean resultado = edad(n);
    System.out.println(resultado);

    }

    public static boolean edad(int n) {

        boolean edad = true;

        if (n >= 18) {
            edad = true;
        } else {
            edad = false;
        }

        return edad;
    }




}