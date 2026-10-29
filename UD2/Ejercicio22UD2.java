import java.util.Scanner;
public class Ejercicio22UD2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        int N = sc.nextInt();


        for (int i = N; i >= 0; i-- ){
            System.out.println(i);
        }
        System.out.println("despegue");

    }

}
