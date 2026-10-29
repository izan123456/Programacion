import java.util.Scanner;

public class Ejercicio18UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un n numero");
        int N = sc.nextInt();
        int con = 0;
        int mul = 1;


        while (con < 10) {
            mul = N * con+N;
            con++;
            System.out.println(N + "x" + con + "=" + mul);
        }





        sc.close();



    }

}
