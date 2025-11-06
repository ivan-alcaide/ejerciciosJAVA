package com;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Diseñar una aplicación que lea las puntuaciones (enteros) 
 * de 5 programadores y las muestre ordenadas. 
 * Después pueden añadirse hasta 3 programadores de exhibición; 
 * 
 * su puntuación se introduce igual, usando -1
 *  para indicar que no hay más. 
 *  
 *  
 *  Mostrar finalmente todos los puntos ordenados.

 */
public class Ejercicio6 {
	public static void main(String [] args) {
		// temp para dato temporal que permita leer número del usuario
		// contador para que termine controlar cuando salir del bucle
		int tempPuntuacion, contador = 0;
		// la posición nueva para la puntuación
		int posicionExtra;
		
		//Guardar en una tabla 5 números dados por el Usuario
		int[] puntos = new int[5];
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Introduce la puntuación: ");
		for(int i=0; i<puntos.length;i++) {
			//System.out.println(i);
			//System.out.println(puntos[i]);
			puntos[i]= sc.nextInt();		
		}
		System.out.println(Arrays.toString(puntos));
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	
		//int posicion = Arrays.binarySearch(numeros, 10);
		
		do {
			System.out.println("Introduce una puntuación: ");
			tempPuntuacion = sc.nextInt();
			
			if(tempPuntuacion == -1) {
				break;
			}
			
			puntos=Arrays.copyOf(puntos, puntos.length+1);
			posicionExtra = puntos.length -1 ;
			
			puntos[posicionExtra] = tempPuntuacion;
			contador++;
		}while(contador < 3);
		//Ordenamos
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}
}
