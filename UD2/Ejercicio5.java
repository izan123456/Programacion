import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador 1 (1=piedra, 2=papel, 3=tijera): ");
        int jugador1 = sc.nextInt();

        System.out.print("Jugador 2 (1=piedra, 2=papel, 3=tijera): ");
        int jugador2 = sc.nextInt();

        if (jugador1 < 1 || jugador1 > 3) {
            System.out.println("Error: el jugador 1 debe introducir 1, 2 o 3.");
        }

        if (jugador2 < 1 || jugador2 > 3) {
            System.out.println("Error: el jugador 2 debe introducir 1, 2 o 3.");
        }

        if (jugador1 == jugador2) {
            System.out.println("Empate");
        }

        if (jugador1 == 1 && jugador2 == 3) {
            System.out.println("Gana el jugador 1");
        }

        if (jugador1 == 2 && jugador2 == 1) {
            System.out.println("Gana el jugador 1");
        }

        if (jugador1 == 3 && jugador2 == 2) {
            System.out.println("Gana el jugador 1");
        }

        if (jugador1 == 1 && jugador2 == 2) {
            System.out.println("Gana el jugador 2");
        }

        if (jugador1 == 2 && jugador2 == 3) {
            System.out.println("Gana el jugador 2");
        }

        if (jugador1 == 3 && jugador2 == 1) {
            System.out.println("gana jugador2");
        }

        sc.close();
    }
}




