import java.util.Scanner;

/**
 * Ejercicio 51 · Suma y producto.
 *
 * El enunciado original pedía dos funciones, una para cada operación. Los métodos
 * se estudian en la unidad siguiente, así que aquí se resuelve en el main. En la
 * UD3 este ejercicio vuelve a aparecer, y entonces sí con dos métodos.
 */
public class Ejercicio1_51UD3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primer número: ");
        int a = sc.nextInt();
        System.out.print("Segundo número: ");
        int b = sc.nextInt();

        mostrarRespuesta(a, b);

    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
    public static void mostrarRespuesta(int a, int b) {
        System.out.println("suma:" + sumar(a, b));
        System.out.println("multiplicacion:" + multiplicar(a, b));
    }

}
