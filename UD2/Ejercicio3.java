import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("nombre de producto: ");
        String Producto = sc.next();
        System.out.println("Producto: " + Producto);

        sc.nextLine();
        System.out.print("Numero de unidades: ");
        int Unidades = sc.nextInt();
        System.out.println("Unidades: " + Unidades );

        sc.nextLine();
        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();
        System.out.println("Precio unitario: " + precio );



        System.out.println("---RESUMEN DEL PEDIDO---");

        System.out.println("teclado mecanico x"+ Unidades);

        System.out.println("Total:    "+ Unidades * precio);

    }
}
