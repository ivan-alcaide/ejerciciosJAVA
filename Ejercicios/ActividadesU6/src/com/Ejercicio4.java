package com;

import java.util.Scanner;

//Diseñar una aplicación que pida al usuario que introduzca 
//una frase por teclado e indique cuántos espacios en blanco tiene.
public class Ejercicio4 {
	static Scanner SCAN = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Introduzca una frase: ");
		String frase, frase2;
		
		frase = SCAN.nextLine().trim();
		frase2 = frase.replaceAll(" ","" );
		
		int resultado = frase.length() - frase2.length();
		
		System.out.println("En total hay " + resultado + " espacio/s");
		
	}
}
