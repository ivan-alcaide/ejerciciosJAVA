package com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String cadena1= "Hola Mundo";
		System.out.println(cadena1.replaceAll(" ", ""));
		System.out.println(cadena1.replaceAll(" ", "_"));
		System.out.println(cadena1);
	}
	public static void compareTo() {
		String cadena1="fin";
		String cadena2="FiN";
		
		
		int comparacion_ignore = cadena2.compareToIgnoreCase(cadena1);
		System.out.println("comparacion_ignore: "+comparacion_ignore);
		
		int comparacion = cadena2.compareTo(cadena1);
		System.out.println("comparacion: "+comparacion);
	}
	public static void pruebaTrime() {
		String cadena1 = "Yo soy Juan";
		String cadena2 = "Yo soy Juan ";
		
		System.out.println("TAM cadena 1: "+ cadena1.length());
		System.out.println("TAM cadena 2: "+ cadena2.trim().length());
		System.out.println(cadena2);
		System.out.println(cadena2.trim());
	}
	public static void testSkipLine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero = sc.nextInt();
		System.out.println("Dime una palabra:");
		//Código para que permita leer y borrar el buffer.
		sc.skip("\n");
		String palabra = sc.nextLine();
		
		System.out.println("FIN");
	}
}
