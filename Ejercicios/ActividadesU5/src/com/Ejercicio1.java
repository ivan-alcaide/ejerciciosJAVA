package com;

import java.util.Scanner;

/**
 * Diseñar un programa que solicite al usuario 
 * que introduzca 5 números decimales por teclado y, a continuación, 
 * muestre los números en el mismo orden en que se introdujeron.
 */
public class Ejercicio1 {
    public static void main(String [] argumentos) {
         Scanner sc = new Scanner(System.in);
         double [] numeros = new double[5];
        
        // <-- Obtiene los números
         for(int i = 0; i<numeros.length;i++) {
            System.out.println("Dime un número: ");
            numeros[i] = sc.nextDouble();
         }
         
         // --> Mostrado los números
        /* for(int i = 0; i< numeros.length; i++) {
             System.out.println(numeros[i]);                                                                                                                                                                                                                                                                                                                                          
         }*/
         for(double numero : numeros) {
             System.out.println(numero);                                                                                                                                                                                                                                                                                                                                          
         }
    }
}
