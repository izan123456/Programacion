
import java.util.Scanner;

public class Ejercicios35UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();


        for (int j = 1; j <= altura; j++) {

            for (int i = 1; i <= altura - j; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = altura - 1; i >= 1; i--) {

            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
