import java.util.Scanner;
public class Ejercicio19UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int N = sc.nextInt();
        int con = 0;

        while (N > 0) {
            N = N / 10;
            con++;
        }

        System.out.println("cifras " + con);


    }

}
