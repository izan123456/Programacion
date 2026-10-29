import java.util.Scanner;
public class Ejercicio21UD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
        System.out.println("introduce un numero");
        int num = sc.nextInt();


        for (int con = 1; con < num; con++) {
            System.out.println(con);

        }
*/

/*        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int suma = 0;

        for (int con = 1; con <= num; con++) {
            suma = con + suma;
        }

        System.out.println("Fin contador, numero " + suma);

        System.out.printf("Media: %.2f%n", (double) suma / num);

*/

        System.out.println("Introduce un n numero");
        int N = sc.nextInt();
        int mul = 1;


        for (int con = 0; con < 10; con++) {
            mul = N * con;

            System.out.println(N + "x" + con + "=" + mul);
        }








    }
}
