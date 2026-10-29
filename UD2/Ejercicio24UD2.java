import java.util.Scanner;

public class Ejercicio24UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- MENU ---");

        int a = 0;

        do {

            System.out.println("1. Sumar dos numeros");
            System.out.println("2. ¿Es par?");
            System.out.println("3. Factorial");
            System.out.println("0. Salir");
            int n = sc.nextInt();


            switch (n) {
                case 1:
                    System.out.println("introduce un numero");
                    int suma1 = sc.nextInt();

                    System.out.println("introduce otro numero");
                    int suma2 = sc.nextInt();

                    System.out.println(suma1 + suma2);

                    break;


                case 2:
                    System.out.println("Introduce unn numero");
                    int par = sc.nextInt();

                    if (par % 2 == 0) {
                        System.out.println("Es par");
                    } else {
                        System.out.println("Es impar");
                    }

                    break;

                case 3:
                    System.out.println("Introduce un numero");
                    int factorial = sc.nextInt();

                    int suma = 1;
                    int con = 1;

                    while (con <= factorial) {
                        suma = suma * con;
                        con++;
                    }

                    System.out.println("El factorial es: " + suma);

                    break;

                case 0:
                    System.out.println("saliendo del codigo");
                    break;


            }


        }
     while (a != 0);


    }
}
