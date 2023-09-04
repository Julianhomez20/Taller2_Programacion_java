import java.util.Scanner;
//Se importa la clase LinkedList para introducir y extraer elementos de la lista
import java.util.LinkedList;

public class histograma {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        LinkedList<Integer> numeros = new LinkedList<>();

        /*Se inicia un contador en 0 para numeros positivos y negativos
         * en los que se almacena la cantidad de cada uno */
        int positivos = 0;
        int negativos = 0;

        // Se hace uso de While-True que dejara de ejecutarse hasta el break
        while (true) {
            System.out.println("Ingrese un numero, si no desea ingresar mas digite 0: ");
            int numero = lector.nextInt();
            // Si el numero ingresado es 0 se cierra el ciclo de solicitar numeros
            if (numero == 0) {
                break;
            // Si no es 0 el numero se agrega a la lista inicial
            } else {
                numeros.add(numero);
            }  // Cierra While  
        } // Cierra True

        // Se obtiene la longitud de la lista
        int longitud = numeros.size();

        // Con la longitud de la lista se parametriza el ciclo for
        for (int num = 0; num < longitud; num++) {
            // Con el metodo get se obtiene cada numero de la lista
            int numero = numeros.get(num);
            // Validación de si cada numero es negativo
            if (numero < 0) {
                // En caso de ser negativo se suma 1 al contador negativo
                negativos += 1;
            } else {
                // En caso de ser positivo se suma 1 al contador positivo
                positivos += 1;
            } // Cierra else

        } // Cierra for

        /* Con la funcion StringBuilder se crea una cadena de asteriscos
         * modificable */
        StringBuilder asteriscosPositivos = new StringBuilder();
        for (int pContador = 0; pContador < positivos; pContador ++) {
            /* A medida que el ciclo for valida la cantidad de numeros
             * positivos en el contador va sumando asteriscos en la cadena*/
            asteriscosPositivos.append("*");
        } // Cierra for 

        StringBuilder asteriscosNegativos = new StringBuilder();
        for (int nContador = 0; nContador <negativos; nContador ++) {
            /* De igual manera que en el for para el contador positivo, 
             * a medida que el ciclo valide la cantidad en el contador 
             * se suman asteriscos en la cadena */
            asteriscosNegativos.append("*");
        } // Cierra for 

        /* Se convierte el valor obtenido de la funcion
         * StringBuilder a String para poder imprimrla */
        String positivo = asteriscosPositivos.toString();
        String negativo = asteriscosNegativos.toString();

        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);

        

        

    
    } // Cierra main

} // Cierra class
