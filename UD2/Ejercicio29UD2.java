import java.util.Scanner;
public class Ejercicio29UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int N = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
            System.out.println(i + "! = " + factorial);
        }
    }
}
