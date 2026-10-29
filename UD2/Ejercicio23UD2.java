import java.util.Scanner;
public class Ejercicio23UD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0;
        int impar = 0;


        for (int i = 100; i <= 200; i++){
            if (i % 2 ==0){
                par += i;
            } else {
                impar += i;
            }
        }
         System.out.println(par);
         System.out.println(impar);
    }
}
