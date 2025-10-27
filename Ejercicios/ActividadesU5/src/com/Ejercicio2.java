package com;

import java.util.Scanner;

/*
 * Escribir una aplicación que solicite al usuario cuántos números 
 * desea introducir. 
 * A continuación, se leerá esa cantidad de números enteros 
 * y, por último, se mostrarán en el orden inverso al introducido.

 */
public class Ejercicio2 {
     
    public static void main(String [] args) {
         //Solicite al usuario cuántos números desea introducir
          Scanner sc = new Scanner(System.in);
          System.out.println("Dime cuantos números: ");
          int n = sc.nextInt();
         //Crear tabla con el total de números introducidos
           int [] tabla = new int[n];
           for(int i=0; i<tabla.length;i++) {
                System.out.println("Introduzca el número: ");
                tabla[i] = sc.nextInt();
           }
           
         //Mostrar los valores de la tabla en orden INVERSO                                                                                                                                                                                                                                                                                                                                         
          for(int i = tabla.length-1; i>=0; i--) {
               System.out.println(tabla[i]);                                                                                                                                                                                                                                                                                                                                         
          }
    }                                                                                                                                                                                                                                                                                                                                          
}
