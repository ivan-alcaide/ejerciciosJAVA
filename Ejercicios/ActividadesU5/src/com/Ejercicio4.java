package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Implementar un programa que inicialice una tabla con tus números favoritos. 
 * Pedir al usuario el índice de un elemento que será eliminado.
 *  Continuar eliminando elementos 
 *  hasta que el índice introducido sea negativo 
 *  o no existan más elementos que borrar. 
 *  
 *  Validar siempre que el índice es válido.


 */
public class Ejercicio4 {
      public static void main(String [] args) {
             Scanner sc = new Scanner(System.in);                                                                                                                                                                                                                                                                                                                                       
            int [] numeros = {2, 5, 13, 6, 9, 10};
            int aux;
           
            System.out.println("Inicio: ");
            mostrarTabla(numeros);
           
            do {
             //Pedir al usuario el índice de un elemento
              System.out.println("Dime el indice: ");
              int indice = sc.nextInt();
              
              if(indice>=numeros.length || indice < 0 ) {
                  continue;                                                                                                                                                                                                                                                                                                                                         
              }
              // Guardamos el último número de la tabla
              aux = numeros[numeros.length -1];
              numeros[indice] = aux;
              numeros = Arrays.copyOf(numeros, numeros.length -1);
             
              
              mostrarTabla(numeros);
                                                                                                                                                                                                                                                                                                                                                          
            }while(numeros.length>0);
     
            System.out.println("FIN");
      }
      
      public static void mostrarTabla(int [] tabla) {
         System.out.print( "[ ");                                                                                                                                                                                                                                                                                                                                      
           for(int elemento : tabla) {
               System.out.print(elemento +"\t");                                                                                                                                                                                                                                                                                                                                          
           }
           System.out.print( "]");          
      }
}
