import java.util.Scanner;

public class Ejercicio13UD2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce la nota");
        double nota = sc.nextDouble();

        switch ((int)nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("sufuciente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobreaaliente");
                break;
            default:
                System.out.println("Nota no valida");

        }

System.out.println(nota >=5 ? "aprobado" : "Suspendido");



    }

}
