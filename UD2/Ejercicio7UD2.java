import java.util.Scanner;

public class Ejercicio7UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota");
        int nota = sc.nextInt();

        if (nota < 1 || nota > 10) {
            System.out.println("Error, introduce un número del 1 al 10");
        }

        if (nota < 5) {
            System.out.println("Insufucuente");}

        if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");}

        if (nota >= 6 && nota < 7) {
            System.out.println("Bien");}

        if (nota >= 7 && nota < 9) {
            System.out.println("Notable");}

        if (nota >= 9 && nota < 10) {
            System.out.println("Sobresaliente");}




    }
}