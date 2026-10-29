import java.util.Scanner;

public class Ejercicio6UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 10");
        int numero = sc.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Error, introduce un número del 1 al 10");
        }

        if (numero == 5) {
            System.out.println("¿Es el 5?");
            System.out.println("Correcto");
        }

        if (numero != 5) {
            System.out.println("¿Tu número es menor de 5?");
            String respuesta = sc.next();

            if (respuesta.equals("si")) {
                System.out.println("¿Tu número es el 3?");

                if (numero == 3) {
                    System.out.println("Correcto");
                }
            }

            if (respuesta.equals("no")) {
                System.out.println("¿Tu número es el 8?");
                String respuesta2 = sc.next();

                if (respuesta2.equals("si")) {
                    if (numero == 8) {
                        System.out.println("Correcto");
                    }
                }

                if (respuesta2.equals("no")) {
                    System.out.println("¿Tu número es mayor de 8?");
                    String respuesta3 = sc.next();

                    if (respuesta3.equals("si")) {
                        System.out.println("¿Tu número es el 9?");

                        if (numero == 9) {
                            System.out.println("Correcto");
                        }
                    }

                    if (respuesta3.equals("no")) {
                        System.out.println("¿Tu número es el 7?");


                        if (numero == 7) {
                            System.out.println("Correcto");
                        }
                    }
                }
            }
        }

        sc.close();
    }
}


