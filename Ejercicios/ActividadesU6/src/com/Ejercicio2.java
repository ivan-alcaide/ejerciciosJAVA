package com;

import java.util.Scanner;

/**
 * Diseñar el juego acierta la contraseña. 
 * 
 * La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; 
 * a continuación, 
 * el segundo jugador debe teclear palabras hasta que la acierte. 
 * 
 * 
 * Realizar dos versiones; en la primera las únicas pistas que se proporcionan 
 * son el número de caracteres y cuáles son el primer 
 * y el último carácter de la contraseña. 
 * 
 * 
 * En la segunda versión se facilita el juego indicando 
 * si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña.
 */
public class Ejercicio2 {
		public static Scanner SCAN = new Scanner(System.in);
	
	public static void main(String [] args) {
		String password;
		//PRIMER JUGADOR
		System.out.println("Jugador 1: Escribe una constraseña: ");
		password = SCAN.nextLine().trim();
		
		//SEGUNDO JUGADOR --> tiene que adivinar
		System.out.println("¿Qué versión quieres jugar (1 o 2)?");
		int version = SCAN.nextInt();
		SCAN.skip("\n");
		switch (version) {
		case 1:
			System.out.println("Version 1:");
			version_juego_1(password);
			break;
		case 2:
			System.out.println("Versión 2:");
			version_juego_2(password);
		default:
			System.out.println("No existe esa versión");
			break;
		}
		
		
		
	}
	
	/**
	 * En la segunda versión se facilita el juego indicando 
 * si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña.
	 * @param password
	 */
private static void version_juego_2(String password) {
	String intentoPassword;
	while(true) {
		System.out.println("Jugador 2: Adivina la contraseña: ");
		intentoPassword = SCAN.nextLine();
		
		//Comparamos
		if(intentoPassword.compareTo(password) > 0) {
			System.out.println("La palabra buscada es anterior a la ingresada");
		}else if(intentoPassword.compareTo(password) < 0){
			System.out.println("La palabra buscada es posterior a la ingresada");
		}else {
			break;
		}
		
	}
	System.out.println("¡Enhorabuena! Has acertado");
}
/**
 * en la primera las únicas pistas que se proporcionan 
 * son el número de caracteres y cuáles son el primer 
 * y el último carácter de la contraseña.
 * @param password
 */
	private static void version_juego_1(String password) {
		String intentoPassword;
		System.out.println("## PISTAS ##");
		System.out.println("El número de carácteres " + password.length());
		System.out.println("El primer carácter: " +  password.charAt(0));
		int ultimo = password.length() - 1;
		System.out.println("El último carácter: " +  password.charAt(ultimo));
	
		do {
			System.out.println("Jugador 2: Adivina la contraseña: ");
			intentoPassword = SCAN.nextLine();
		}while(!password.equals(intentoPassword));
		
		System.out.println("¡Enhorabuena! Has acertado");
	}
	
	
}
