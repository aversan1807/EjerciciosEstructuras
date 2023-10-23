import java.util.Scanner;

public class ContandoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numerosPositivos =0;

        int numerosNegativos=0;

        int numerosCero=0;

        System.out.println("Introduce diez dígitos: ");

        for (int i = 0; i < 10; i++) {

            int numeros = entrada.nextInt();

            if(numeros > 0){

                ++numerosPositivos;

            } else if (numeros < 0) {

                ++numerosNegativos;
            } else if (numeros==0) {

                ++numerosCero;


            }

        }
        System.out.println("hay " +numerosPositivos +" numeros positivos ");

        System.out.println("hay " +numerosNegativos +" numeros negativos ");

        System.out.println("hay " +numerosCero +" numeros ceros ");

    }
}
