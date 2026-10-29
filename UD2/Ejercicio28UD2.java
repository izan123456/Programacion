import java.util.Scanner;

public class Ejercicio28UD2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce la cadena");

        String cadena = sc.nextLine();


        String prohibidos = "\\|@#~€¬!»·$%&/()=";


        boolean encontrado = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);


            if (prohibidos.indexOf(cadena) != -1) {
                encontrado = true;
                break;
            }

        }


        if (encontrado) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }


    }
    }