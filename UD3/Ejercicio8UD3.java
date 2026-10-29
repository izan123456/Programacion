import java.util.Scanner;

public class Ejercicio8UD3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int n = sc.nextInt();


        int resultado = dimeSigno(n);

        System.out.println(resultado);

        sc.close();
    }
    public static int dimeSigno(int n){


        if (n < 0) {
            n =-1;
        } else if (n == 0) {
            n = 0;
        } else if (n > 0) {
            n = 1;
        }
         return n;

        }



    }


