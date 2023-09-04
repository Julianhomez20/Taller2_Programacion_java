import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();
        // Se convierte la variable int a string
        String num = Integer.toString(numero);
        /*Haciendo uso de la función StringBuilder
         * que permite modificar cadenas, invertimos 
         * la variable num */
        StringBuilder cadena =  new StringBuilder(num);
        cadena.reverse();
        /*Convertimos el valor obtenido de la funcion reverse
        en String */ 
        String invertida = cadena.toString();

        // Comparamos la cadena original con la invertida
        if(num.equals(invertida)){
            System.out.println("El numero es palindromo");
        } else {
            System.out.println("El numero no es palindromo");
        } // Cierra else

    

    } // Cierra main
} // Cierra class