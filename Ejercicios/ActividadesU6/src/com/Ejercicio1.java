package com;

import java.util.Scanner;

/**
 * Introducir por teclado dos palabras 
 * e indicar cuál de ellas es la más corta, 
 * es decir, la que contiene menos caracteres.

 */
public class Ejercicio1 {
	
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String [] args) {
		String palabra1, palabra2;
		System.out.println("Dime una palabra: ");
		palabra1 = sc.nextLine();
		System.out.println("Dime otra palabra: ");
		palabra2 = sc.nextLine();
		
		
		if(palabra1.length() > palabra2.length()) {
			System.out.println("La segunda palabra es más corta ");
		}else if(palabra2.length() == palabra1.length() ){
			System.out.println("Son igual de cortas");
		}else {
			System.out.println("La primera palabra es más corta ");
		}
		System.out.println("palabra1: " + palabra1 + ", palabra2: " + palabra2);		
	}
}
