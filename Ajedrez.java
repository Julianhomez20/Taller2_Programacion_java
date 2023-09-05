import java.util.Scanner;

public class Ajedrez {
    
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        String[][] tablero = {
            {" ", "1", "2", "3", "4", "5", "6", "7", "8"},
            {"1", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"2", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"3", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"4", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"5", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"6", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"7", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"8", "-", "-", "-", "-", "-", "-", "-", "-"},
        };

        // Imprimir el tablero de ajedrez sin llaves
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        } 
        System.out.println();
        System.out.println("El caballo sera representado con * y los posibles movimientos X");
        System.out.println("Ingrese la fila donde quiere posicionar el caballo: ");
        int filaUsuario = lector.nextInt();
        System.out.println("Ingrese la columna donde quiere posicionar el caballo: ");
        int columnaUsuario = lector.nextInt();
        
        // Definir los movimientos posibles del caballo
        int[][] movimientosCaballo = {
            {-2, -1},
            {-2, 1},
            {-1, -2},
            {-1, 2},
            {1, -2},
            {1, 2},
            {2, -1},
            {2, 1}
        };
        //Validar que las coordenadas ingresadas por el usuario esten dentro de el tablero
        if (1 <= filaUsuario && filaUsuario < tablero.length && 1 <= columnaUsuario && columnaUsuario < tablero[1].length) {
            // Posicionar el caballo en el tablero si las coordenadas son validas
            tablero[filaUsuario][columnaUsuario] = "*";

            // Mostrar el tablero actualizado
            for (int fila = 0; fila < tablero.length; fila++) {
                for (int columna = 0; columna < tablero[0].length; columna++) {
                    System.out.print(tablero[fila][columna] + " ");
                } // Cierra for columnas
                System.out.println(); // Salto de línea después de cada fila
            } // Cierra for filas
            System.out.println();
            /*Con un ciclo for se recorre el array de los movimientos del caballo
            y se suman a la posicion dada por el usuario */ 
            for (int i = 0; i < movimientosCaballo.length; i++){
                int nFila = filaUsuario + movimientosCaballo[i][0];
                int nColumna = columnaUsuario +movimientosCaballo[i][1];
                // Se valida que las nuevas posiciones sigan estando dentro de el tablero
                if(1 <= nFila && nFila < tablero.length && 1 <= nColumna && nColumna < tablero[1].length) {
                    // Si las posiciones estan dentro de el tablero se muestran con una X
                    tablero[nFila][nColumna] = "X";
                }
            } // Cierra for
            // Imprimir tablero con los movimientos 
             for (int fila = 0; fila < tablero.length; fila++) {
                for (int columna = 0; columna < tablero[0].length; columna++) {
                    System.out.print(tablero[fila][columna] + " ");
                } // Cierra for columnas
                System.out.println(); // Salto de línea después de cada fila
            } // Cierra for filas
            System.out.println();
        } else {
            System.out.println("Posición inválida");
        } // Cierra else
    } // Cierra main
} // Cierra class