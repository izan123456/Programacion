public class Ejercicio27UD2 {
    public static void main(String[] args) {

        int divisiones = 0;

        for (int numero = 2; numero <= 100; numero++) {
            boolean Divisor2 = false;

            for (int divisor = 2; divisor < numero; divisor++) {
                divisiones++;

                if (numero % divisor == 0) {
                    Divisor2 = true;
                    break;
                }
            }

            if (!Divisor2) {
                System.out.println(numero);
            }
        }

        System.out.println("Número de divisiones: " + divisiones);
    }
}
