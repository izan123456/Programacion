import java.util.Scanner;

public class Ejercicio32UD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int n = sc.nextInt();

        char a = '*';
        String d = " ";

        for (int b = 0; b < n; b++) {
            System.out.print(a);
        }
        System.out.println();

        for (int i = 0; i < n - 2; i++) {
            d = " ".repeat(n - 2);
            System.out.println(a + d + a);
        }

        for (int c = 0; c < n; c++) {
            System.out.print(a);
        }
        System.out.println();

        sc.close();
    }
}