import java.util.Scanner;

public class RellenandoConPuntos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      String cadena;

      int numeroEntero;

      char caracter;

        System.out.println("Introduce una cadena de hasta 80 caracteres");
        cadena=entrada.nextLine();

        System.out.println("Introduce un numero entero positivo");
        numeroEntero=entrada.nextInt();

        System.out.println("Introduce un caracter (I o D)");
        char opcion=entrada.next().charAt(0);

        if (opcion == 'I' || opcion == 'D') {

            if (opcion == 'I') {
                while (cadena.length() < numeroEntero) {
                    cadena = "." + cadena;
                }
            } else {
                while (cadena.length() < numeroEntero) {
                    cadena = cadena + '.';
                }
            }

            System.out.println( cadena);
        } else {
            System.out.println("Opción no válida. Debes elegir 'I' o 'D'.");

        }

}
    }

