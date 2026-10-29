import java.util.Scanner;

public class Ejercicio11UD2 {
    public static void main (String[] args){




        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué operacion quieres calcular? (+, *, -, /.): ");
        String operacion = sc.nextLine().toLowerCase();

        System.out.println("introduce el primer numero");
        double numero1 = sc.nextDouble();
        System.out.println("introduce el primer numero");
        double numero2 = sc.nextDouble();


        switch (operacion) {
            case "+":
                System.out.println(numero1 + numero2);
                break;
            case "*":
                System.out.println(numero1 * numero2);
                break;
            case "-":
                System.out.println(numero1 - numero2);
                break;
            case "/":
                System.out.println(numero1 / numero1);
                break;



        }

    }
} 
 