package Actividades_ud5;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int fallos, longitud, intento;

        //pedir la longitud de la combinación
        System.out.print("Introduce la longitud de la combinación secreta (entre 1 y 5): ");
        longitud = sc.nextInt();

        // asegurar que la longitud esté entre 1 y 5
        while (longitud < 1 || longitud > 5) {
            System.out.print("Longitud no válida. Introduce un número entre 1 y 5: ");
            longitud = sc.nextInt();
        }

        //crear y rellenar la combinación secreta 
        int[] combinacion = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            combinacion[i] = (int) (Math.random() * 10); // números del 0 al 9
        }

        System.out.println("Combinación secreta creada , Intenta descubrirla...");

        //bucle principal 
        do {
            fallos = 0;

            for (int i = 0; i < longitud; i++) {
                System.out.print("Introduce el número para la posición " + (i) + ": ");
                intento = sc.nextInt();

                //comparar con la combinación secreta
                if (intento == combinacion[i]) {
                    System.out.println("Posición " + i + ": ¡Correcto!");
                } else if (intento < combinacion[i]) {
                    System.out.println("Posición " + i + ": El número es MAYOR.");
                    fallos++;
                } else {
                    System.out.println("Posición " + i + ": El número es MENOR.");
                    fallos++;
                }
            }

            if (fallos > 0) {
                System.out.println("Has tenido " + fallos + " fallo(s). Inténtalo de nuevo");
            }

        } while (fallos != 0);

        //imprimir la respuesta final
        System.out.println("Felicidades, has abierto la cámara secreta");
        
    }
}
