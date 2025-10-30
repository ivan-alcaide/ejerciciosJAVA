package com;

import java.util.Scanner;

/**
 * Introducir por teclado un número n; 
 * a continuación solicitar al usuario que teclee n números. 
 * 
 * Calcular la media de los números positivos, 
 * la media de los negativos 
 * y contar el número de ceros introducidos.
 */
public class Ejercicio3 {
   public static void main(String [] args) {
       Scanner sc = new Scanner(System.in);
       //Introducir por teclado un número n;
       System.out.println("➤ Dime un número <n> para el tamaño de la tabla");
       int n = sc.nextInt();
       
       //Creamos la tabla de tamaño <n>
       int[] numeros = new int[n];
     
       //Rellenar la tabla con los números que me va dando el usuario
       for(int indice=0; indice<numeros.length;indice++) {
              System.out.println("☕ Dime un número: ");  
              int numero = sc.nextInt();
              numeros[indice] = numero;
       }
      //Calculamos el total de '0'
       int totalDeCeros = cuentaCero( numeros);
      // double mediaPositivos = mediaNegativos(numeros);
       System.out.println("El total de ceros es " + totalDeCeros);
       System.out.println("El total de media de positivos " + mediaPositivos(numeros));
       System.out.println("El total de media de negativos " + mediaNegativos(numeros));
       System.out.println("☠ Fin ");
   } 
 /**
  * 
  * @param t
  * @return
  */
   private static double mediaNegativos(int[] t) {
   int contador=0;
   double resultado =0.0;
   for(int i=0;i<t.length;i++) {
        if(t[i]<0) {   contador++;   resultado += t[i];    }                                                                                                                                                                                                                                                                                                                                    
   }
   return resultado;
}

   //double mediaPositivos(int[] t) 
   //double mediaNegativos(int[] t) 
   public static double mediaPositivos(int[] tabla) {
        int contador=0;
        double resultado=0.0;
        
        for(int i=0;i<tabla.length;i++) {
             if(tabla[i]>0) {
                  contador++;
                  resultado += tabla[i];
             }                                                                                                                                                                                                                                                                                                                                         
        }
        
        return resultado / contador;
   }
   
   public static int cuentaCero(int[] nums) {
        int contador = 0;
              //desde donde empieza ; condición hasta que sea falso; que hago en cada iteración
        for(int i = 0 ; i < nums.length  ;i++) {
             if(nums[i] == 0) {
                 contador++;                                                                                                                                                                                                                                                                                                                                          
             }                                                                                                                                                                                                                                                                                                                                         
        }
        return contador;
   }
   
}
