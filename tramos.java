/* Se realiza la importacion de la clase LinkedList para
la funcionalidad de creacion y modificación de listas */ 
import java.util.LinkedList;
import java.util.Scanner;

public class tramos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        /* Creacion de dos listas de tipo Integer para almacenar
         * los datos de duracion en minutos y en horas*/
        LinkedList<Integer> tramosHoras = new LinkedList<>();
        LinkedList<Integer> tramosMinutos = new LinkedList<>();


        /* Con la estructura while True se realiza la solicitud de datos 
         * hasta que el usuario ingrese el valor 0 */
        while (true) {
            System.out.println("Ingrese la duración de sus tramos en minutos, si no desea ingresar más, digite el número 0:");
            int tramo = lector.nextInt();
            /* Cada valor ingresado que sea diferente de 0 se agrega a la lista
             tramos en minutos */
            if (tramo != 0) {
                tramosMinutos.add(tramo);
                /* Cuandoe el valor ingresado sea 0 se inicia un contador
                 * para almacenar la cantidad de minutos */
            } else {
                int sumaTotalMinutos = 0;
                /* Con un ciclo for se crea la variable minutos
                 que recorre cada elemento de la lista tramosMinutos*/
                for (int minutos : tramosMinutos) {
                    // Cada dato se suma al total 
                    sumaTotalMinutos += minutos;
                } // Cierra for

                /* En la variable horas se almacena
                 los minutos convetidos a horas */
                int horas = sumaTotalMinutos / 60;
                // La parte residual de la conversion a horas se toma como minutos
                int minutosRestantes = sumaTotalMinutos % 60;

                System.out.println("Tiempo total de viaje: " + horas + " : " + minutosRestantes + " horas" );
                break;
            } // Cierra else
        } // Cierra while
    } // Cierra main
} // Cierra class
