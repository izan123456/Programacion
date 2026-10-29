import java.util.Scanner;

public class Ejercicio16UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int num = sc.nextInt();
        int con = 1;
        int suma = 0;

        while (con <= num) {
            suma = con + suma;
            con++;
        }

        System.out.println("Fin contador, numero " + suma);

        System.out.printf(" media: %.2f", (double) suma / num );


    }
}
