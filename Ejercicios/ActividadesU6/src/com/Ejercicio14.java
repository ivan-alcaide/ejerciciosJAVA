package com;

import java.util.Random;
import java.util.Scanner;

/**
 * Implementar el juego del anagrama, 
 * que consiste en que un jugador escribe una palabra o frase, 
 * y la aplicación muestra un anagrama (transposición de los caracteres) 
 * del texto introducido generado al azar.


A continuación otro jugador tiene que acertar cuál es el texto original. 
La aplicación no debe permitir que el texto introducido por el jugador 1 
sea la cadena vacía. Por ejemplo, si el jugador 1 escribe “teclado”, 
la aplicación muestra como pista un anagrama al azar: “etcloda”.
 */
public class Ejercicio14 {
	static Scanner SC = new Scanner(System.in);
	public static void main(String [] args) {
		//Comprueba que el texto introducido no esté vacío. 
		System.out.println("Jugador 1: Introduce una palabra que no este vacía");
		int intentos = 0;
		String palabra, palabra_jugador2 = "";
		
		
		do {
			palabra = SC.nextLine();
		}while(palabra.isEmpty());		
		
		//Después, crea una versión en la que el orden de los caracteres se mezcle 
		//de forma aleatoria. 
		String anagrama = anagrama(palabra);
		System.out.println("Pista: " + anagrama);
		
		//Muestra esa versión como pista y
		//permite que el segundo jugador vaya introduciendo sus intentos
		do {
			System.out.println("Jugador 2: Introduce la palabra adivinar");
			palabra_jugador2 = SC.nextLine();
			intentos++;
			
			int totalCoincidencia=cuentaTotalCaracterIguales(palabra, palabra_jugador2);
			if( totalCoincidencia!= -1) {
				System.out.println("En total ha coincido en "+ totalCoincidencia + " caracteres");
			}
			
			
		}while(!palabra_jugador2.equals(palabra));
		
		System.out.println("Lo conseguisten en " + intentos + " intentos");
		
		System.out.println("FIN");
	}
	
	private static String anagrama(String palabra) {
		
		for(int i=0; i<palabra.length(); i++) {
			palabra = mezcla(palabra);
		}
		return palabra;
	}
	private static int cuentaTotalCaracterIguales(String palabra1, String palabra2) {
		int contador = 0;
		if(palabra1.length() != palabra2.length()) {
			System.out.println("No coinciden el número de caracteres");
			return -1;
		}else {
			for(int i=0; i<palabra1.length(); i++) {
				if(palabra1.charAt(i) == palabra2.charAt(i)) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	private static String mezcla(String palabra) {
		Random rand = new Random();
		StringBuilder string_anagrama = new StringBuilder();
		
		int index_1 = rand.nextInt(palabra.length()); 
		int index_2;
		do{
			index_2 = rand.nextInt(palabra.length()); 
		}while(index_1 == index_2);
				
		char[] tabla_caracter = palabra.toCharArray();
		char index1_tabla = palabra.charAt(index_1);
		tabla_caracter[index_1] = tabla_caracter[index_2];
		tabla_caracter[index_2] = index1_tabla;
		
		string_anagrama.append(tabla_caracter);
		
		return string_anagrama.toString();
	}
	
	
}
