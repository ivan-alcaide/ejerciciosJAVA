package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Desarrollar el juego de la cámara secreta. 
 * El jugador elige la longitud de la combinación (dígitos del 1 al 5). 
 * La aplicación genera aleatoriamente la combinación y, 
 * en cada intento del usuario,  muestra para cada dígito si es mayor, menor o igual 
 * que el correspondiente de la combinación secreta.
 * 
 * 
 */
public class Ejercicio5 {
      public static void main(String [] args) {
            Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                        
            int n = -1;
            int [] tablaUsuario;
           do {
              System.out.println("Dime un número entre 1 y 5");
              n = sc.nextInt();
           }  while( n < 0 || n > 5 );                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
         int[] tabla = crearTablaVacia(n);
        tabla=  rellenarTablaConNumeroAleatorio(tabla);
        System.out.println(Arrays.toString(tabla));
       // Utiles.mostrarTabla(tabla);
        
        tablaUsuario = tablaUsuario(tabla, sc);
        
        
        
      }                                                                                                                                                                                                                                                                                                                                        
 private static int[] tablaUsuario(int[] tabla, Scanner sc) {
		for(int i=0; i < tabla.length; i++) {
			tabla[i] = sc.nextInt();
		}
		return null;
	}
 /**
  *                                                                                                                                                                                                                                                                                                                                              
  * @param n
  * @return
  */
public static int[] crearTablaVacia(int n) {
     int [] tabla = new int[n];
     return tabla;
}
/**
 * 
 * @param tabla
 * @return
 */
public static int[] rellenarTablaConNumeroAleatorio(int [] tabla) {
      Random random = new Random();                                                                                                                                                                                                                                                                                                                                        
     for(int i=0; i<tabla.length; i++) {
         tabla[i] = random.nextInt(10);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
     }   
     return tabla;
}
                                                                                                                                                                                                                                                                                                                                              
}
