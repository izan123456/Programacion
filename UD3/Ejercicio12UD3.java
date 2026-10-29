import java.util.Scanner;

public class Ejercicio12UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce DNI");
        int dni = sc.nextInt();

        int resultado = division(dni);

    }
        public static int division(int dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

            int nif = dni / 23;

            return nif;

        }
}
