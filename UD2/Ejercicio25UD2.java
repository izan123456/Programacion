import  java.util.Scanner;
public class Ejercicio25UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad;
        int intentos = 1;


        do {
            System.out.println("Introduce tu edad");
            edad = sc.nextInt();
            intentos++;

            if (edad < 0 || edad > 120){
                System.out.println("Error la edad debe ser entre 0 y 120");
            }

        } while (edad < 0 || edad > 120);
        if (edad >18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

    }
}
