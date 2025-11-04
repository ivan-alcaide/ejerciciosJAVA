package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String [] args) {
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
	
		int [] numeros = {3, 1, 4, 5, 10, 15};
		
		int posicion = Arrays.binarySearch(numeros, 10);
		System.out.println("Posición: "+ posicion);
		
		
	}
}
