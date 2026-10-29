import java.util.Scanner;

public class Ejercicio9UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce millas");
        int millas = sc.nextInt();

        double resultado = millasAKilometros(millas);
        System.out.println("Kilómetros: " + resultado);

        sc.close();
    }
    public static double millasAKilometros(int millas) {
        double kilometros = 1.60934;

        double resultado = millas * kilometros;

        return resultado;
    }
}

