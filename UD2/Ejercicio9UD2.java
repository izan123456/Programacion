import java.util.Scanner;

public class Ejercicio9UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu edad");
        int edad = sc.nextInt();

        sc.hasNextLine();
        System.out.println("dia de la semana");
        int dia = sc.nextInt();


        if (dia < 1 || dia > 7) {
            System.out.println("Error: introduce un día de la semana del 1 al 7");
        } else {

            if ((edad <14 || edad >65) && dia != 3)
                System.out.println("6€");



            if ((edad >= 14 && edad <=65) && dia != 3)
                System.out.println("9€");



            if (dia == 3) {
                System.out.println("2€");

sc.close();

            }
        } }  }