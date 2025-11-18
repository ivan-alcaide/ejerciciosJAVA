package com;

import java.util.Scanner;

/**
 * Introducir por teclado una frase palabra a palabra, 
 * y mostrar la frase completa separando las palabras 
 * introducidas con espacios en blanco. 
 * 
 * Terminar de leer la frase cuando alguna de las palabras 
 * introducidas sea la cadena «fin» escrita con cualquier 
 * combinación de mayúsculas/minúsculas. 
 * La cadena «fin» no aparecerá en la frase final.
 */
public class Ejercicio3 {
	static Scanner SCAN = new Scanner(System.in);
	static String FINAL = "fin";
	
	public static void main(String [] args) {
		System.out.println("Introduce una frase palabra por palabra hasta que diga 'fin'");
		String palabra="", frase="";
		
		while(!(palabra.compareToIgnoreCase(FINAL)==0)) {
			System.out.println(">");
			palabra = SCAN.nextLine().trim();
			if(!(palabra.compareToIgnoreCase(FINAL)==0)){
				frase += " " +  palabra;
			}
			
		}
		System.out.println(frase);
		
		
	}
	
}
