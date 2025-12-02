package com;

import java.util.Scanner;

/**
 * Realizar un programa que lea una frase del teclado 
 * y nos indique si es palíndroma, 
 * es decir, que la frase sea igual leyendo de izquierda a derecha, 
 * que de derecha a izquierda, sin tener en cuenta los espacios. 
 * 
 * Un ejemplo de frase palíndroma es: Dábale arroz a la zorra el abad.

Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo fuese. 
Por esto, supondremos que el usuario introduce la frase sin tildes.
 */
public class Ejercicio8 {
 
	static Scanner SCAN = new Scanner(System.in);
	static final String PALINDROMA = "Dábale arroz a la zorra el abad";
	
	public static void main(String [] args) {
		// Leer frase
		System.out.println("Dime una frase si es palíndroma: ");
		//String frase = SCAN.nextLine();
		String frase = PALINDROMA;
		// 1. Normalizar : mínusculas y espacios
		//String normalizada = limpiarAcentos(frase.trim().replaceAll(" ", ""));
		String normalizada = frase.trim().replaceAll(" ", "").toLowerCase();
		// 2. Invertir la cadena
		StringBuilder sb = new StringBuilder(normalizada);
		
		String invertida = sb.reverse().toString();
		
		
		// 3. Comparar si es palindroma
		if(invertida.equalsIgnoreCase(normalizada)) {
			System.out.println("La frase es palíndroma");
		}else {
			System.out.println("No lo es");
		}
	}
	
	public static String limpiarAcentos(String texto) {
		return texto.toLowerCase().replaceAll("á", "a").replaceAll("è", "e").replaceAll("í", "i").replaceAll("ù", "u").replaceAll("ó", "o");
	}
	
}
