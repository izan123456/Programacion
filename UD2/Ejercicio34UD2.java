import java.util.Scanner;

public class Ejercicio34UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            System.out.println(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        sc.close();
    }
}

