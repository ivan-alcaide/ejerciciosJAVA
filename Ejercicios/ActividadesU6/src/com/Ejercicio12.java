package com;

import java.util.Arrays;

/**
 * Un anagrama es un palabra, o frase, 
 * que resulta de la transposición de otra palabra o frase. 
 * Ejemplos de anagramas para la palabra roma son: 
 * amor, ramo o mora. 
 * 
 * Construir un programa que solicite al usuario dos palabras 
 * e indique si son anagramas una de otra.


 */
public class Ejercicio12 {
	public static void main(String [] args) {
		///roma --> amor
		///Amor --> Amor
		if(sonAnagrama("amor", "Mora")) {
			System.out.println("Son anagramas");
		}else {
			System.out.println("No son anagramas");
		}
	}
	
	public static boolean sonAnagrama(String palabra1, String palabra2) {
		//Asegúrate primero de que ambas palabras tienen la misma longitud. 
		if(palabra1.length() != palabra2.length()) 
			return false;
		
		//Normaliza el formato (por ejemplo, solo minúsculas) 
		//y trabaja con las letras ordenadas. 
		 char[] tablaPalabra1 = palabra1.toLowerCase().toCharArray();
		 char[] tablaPalabra2 = palabra2.toLowerCase().toCharArray();
		Arrays.sort(tablaPalabra1);
		//System.out.println(Arrays.toString(tablaPalabra1));
		Arrays.sort(tablaPalabra2);
		//System.out.println(Arrays.toString(tablaPalabra2));
		//Si las dos secuencias ordenadas coinciden, se trata de anagramas.
		for(int i=0; i<tablaPalabra1.length;i++) {
			if(tablaPalabra1[i] != tablaPalabra2[i]) {
				return false;
			}
		}
		
		return true;
	}
}
