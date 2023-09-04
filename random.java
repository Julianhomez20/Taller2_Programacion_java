import java.util.Scanner;
// Se importa la clase Random que permite generar números aleatorios
import java.util.Random;

public class random {
    public static void main (String[] args) {

        Scanner lector = new Scanner(System.in);
        // Asignación a la variable 'numero' de un valor aleatorio
        Random numero = new Random();
        // Se especifica que 'numeroRandom' debe estar dentro del rango de 1 a 100
        int numeroRandom = numero.nextInt(100) + 1;
        // Inicialización del contador de intentos
        int intentos = 0;

        /* Con una estructura 'while', se inicia el bucle para solicitar el número
           al usuario. El bucle termina cuando se encuentra un 'break' o cuando se adivina el número. */
        while (true) {
            System.out.println("Adivina un número entre el 1 y el 100: ");
            int numUsuario = lector.nextInt();

            // Validación del número ingresado por el usuario para dar pistas
            if (numUsuario < numeroRandom) {
                System.out.println("El número es mayor que " + numUsuario);
                // Cada intento fallido se suma al contador
                intentos += 1;
            } else if (numUsuario > numeroRandom) {
                System.out.println("El número es menor que " + numUsuario);
                intentos += 1;
                // Al encontrar el número, se rompe el bucle usando 'break'
            } else {
                System.out.println("Adivinaste el número.\nCantidad de intentos: " + intentos + "\nEl número es: " + numeroRandom);
                break;
            } // Cierra else
        } // Cierra while
    } // Cierra main
} // Cierra class
