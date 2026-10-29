import java.util.Scanner;

public class actividad15UD2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int num = sc.nextInt();
        int con = 1;


        while (con <num) {
            System.out.println("numero" + con);
            con++;
        }

        System.out.println("Fin contador, numero " + num);



    }
}
