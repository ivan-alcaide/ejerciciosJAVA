package com;

import java.util.Scanner;

/**
 * Diseñar un programa que solicite al usuario 
 * una frase y una palabra. 
 * 
 * A continuación 
 * buscará cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio7 {
	static Scanner SCAN = new Scanner(System.in);	
	static String frase = "En un lugar de la mancha cuyo lugar me lo invento ";
	static String palabra = "lugar";
	
	public static void main(String[] args) {
		
		//Puedes recorrer la frase buscando la posición en la que aparece la palabra. 
		int index = 0;
		int contador = 0;
		do {
			index = frase.indexOf(palabra, index);
			if(index >= 0) {
				//Cada vez que la encuentres, 
				// - incrementa un contador 
				// - y continúa la búsqueda desde la posición siguiente para no contar siempre la misma aparición.
				contador++;
				index++;
			}
		}while(index >= 0);
		
		System.out.println("Aparece " + contador +  " la palabra " + palabra);
		
	
	}
	
	
}
