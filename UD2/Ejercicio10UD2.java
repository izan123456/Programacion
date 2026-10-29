import java.util.Scanner;

public class Ejercicio10UD2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un caracter");
        char c = sc.next().charAt(0);

        c = Character.toLowerCase(c); //*sirve para convertir caracteres en minuscula//

        if (c >='0' && c <= '9') {
            System.out.println("Es un numero");

        } else if (c == 'a' || c =='e' || c == 'i' || c =='o' || c== 'u') {
            System.out.println("Es una vocal");
        }

        else if (c == 'b' || c =='c' || c == 'd' || c =='f' || c== 'h'
                || c =='j' || c == 'k' || c =='l' || c== 'm' ||
                c == 'n' || c == 'p' || c =='q' || c== 'r' || c == 'y' ||
                c == 's' || c =='g' || c == 't' || c =='v' || c== 'w' || c == 'z'|| c == 'x') {
            System.out.println("Es una consonante");
        }
        else {
            System.out.println("otro simbolo");
        }

sc.close();

    }}