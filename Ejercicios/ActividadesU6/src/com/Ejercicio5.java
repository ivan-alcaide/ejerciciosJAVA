package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Pedir el nombre completo (nombre y apellidos) al usuario. 
 * El programa debe eliminar cualquier vocal del nombre. 
 * 
 * Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”. 
 * 
 * Solo se eliminan las vocales (mayúsculas, minúsculas y acentuadas). 
 * El resto de caracteres no se modifican.

 */
public class Ejercicio5 {

	//Define el conjunto de todas las vocales que quieres eliminar, 
	//incluyendo versiones acentuadas.
	private static final String VOCALES="aeiouAEIOUÁÉÍÓÚáéíóú";
	
	public static Scanner SCANNER = new Scanner(System.in);

	
	public static void main(String [] args) {
		

		
		System.out.println("Dime nombre y apellidos: ");
		String nombre_apellido = SCANNER.nextLine();
		
		//Recorre el nombre carácter a carácter 
		/** for(int i=0; i<nombre_apellido.length(); i++) {
			char caracter = nombre_apellido.charAt(i);
		}*/
		StringBuilder sb = new StringBuilder();
		for(char caracter : nombre_apellido.toCharArray()) {
			//y construye una nueva cadena solo con aquellos caracteres 
			//que no pertenezcan a ese conjunto.
			if(VOCALES.contains(Character.toString(caracter))) {
				sb.append("");
			}else {
				sb.append(caracter);
			}
		}
		System.out.println(sb.toString());
	}
	
	
}
