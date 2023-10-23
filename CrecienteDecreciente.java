import java.util.Scanner;

public class CrecienteDecreciente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroAnterior = 0;

        int numeroActual = 0;

        boolean creciente = true;

        boolean decreciente = true;

      do{
            numeroAnterior = numeroActual;
            numeroActual = entrada.nextInt();

            if(numeroActual < 0){
                break;
            }
            if(numeroActual > numeroAnterior){
                decreciente=false;
            }else if (numeroActual < numeroAnterior){
                creciente = false;
            }

            if(creciente&& !decreciente){
                System.out.println("La secuencia es creciente");
            }else if(decreciente && !creciente){
                System.out.println("La secuencia es decreciente");
            }else{
                System.out.println("La secuencia no es ni creciente ni decreciente");
            }
        }while(true);
        }
    }

