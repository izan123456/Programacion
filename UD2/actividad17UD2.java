import java.util.Scanner;

public class actividad17UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int N = sc.nextInt();

        int suma = 1;
        int con = 1;

        while (con <= N) {
            suma = suma * con;
            con++;
        }

        System.out.println("El factorial es: " + suma);


        sc.close();
    }
} 