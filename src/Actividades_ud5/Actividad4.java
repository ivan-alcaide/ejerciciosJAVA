package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //inicializo la tabla y defino una variable
        int[] tabla = {18, 27, 20, 45, 69};

        int pos;

        //Bucle principal
        do {
            //Mostrar la tabla actual
            System.out.println("Tabla actual: " + Arrays.toString(tabla));

            //Si ya no quedan elementos, salir
            if (tabla.length == 0) {
                System.out.println("No hay más elementos que borrar");
                break;
            }

            //pedir al usuario el índice
            System.out.print("Introduce el indice del elemento a eliminar (negativo para salir): ");
            pos = sc.nextInt();

            // Mientras pos >= 0 y existan elementos
            if (pos >= 0) {
                if (pos >= tabla.length) {
                    System.out.println("Error: indice fuera de rango");
                } else {
                    // Eliminar el elemento llamando a la función
                    tabla = borrarElemento(tabla, pos);
                    System.out.println("Elemento eliminado");
                }
            }

        } while (pos >= 0 && tabla.length > 0);

        System.out.println("Tabla final: " + Arrays.toString(tabla));
        
    }
    
    
    //Método que intercambia el elemento en 'pos' con el último y devuelve una copia reducida
    public static int[] borrarElemento(int[] t, int pos) {
        int temp = t[pos];
        t[pos] = t[t.length - 1];
        t[t.length - 1] = temp;

        return Arrays.copyOf(t, t.length - 1);
    }
}
