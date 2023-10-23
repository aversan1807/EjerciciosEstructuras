import java.util.Scanner;

public class CuantosAutobuses {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int grupoPersonas = 0;

        int capacidadAutobus = 55;

        int total = 0;

        int numeroAutobuses = total / 55;

        if (numeroAutobuses * 55 < total) {
            ++numeroAutobuses;
            System.out.printf("son necesarios %d autobuses", numeroAutobuses);
        }

        do {
            System.out.println("personas del grupo (0=FIN: >)");
            grupoPersonas = entrada.nextInt();

            if (grupoPersonas < 0) {

                System.out.println("no puede ser negativo.");
            } else if (grupoPersonas != 0) {
                total += grupoPersonas;
                System.out.printf("Apuntados. Van %d%n", total);
            }


        } while (grupoPersonas != 0);
            total += grupoPersonas;

            int capacidadTotal=total/55;
            System.out.println("Se necesitan: " +capacidadTotal+ " autobuses");
        }

    }

