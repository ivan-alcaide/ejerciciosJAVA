package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		char [] tabla = "ñklasdjñfkl".toCharArray();
		String palabra="Teclado";
		palabra = palabra + "<<----";
		StringBuilder sb = new StringBuilder(palabra);
		sb.append("<<<---0");
		sb.append(tabla);
		
		System.out.println(sb.toString());
	
	}
	
	public static String mezcla(String palabra) 
	{
		StringBuilder mezcla = new StringBuilder();
		Random rand = new Random();
		
		int tam = palabra.length();
		char[] tabla_carac = palabra.toCharArray();
		// Genero números de indice aleatorios
		int indice_2;
		int indice_1 = rand.nextInt(tam);
		do{
			 indice_2 = rand.nextInt(tam);
		}while(indice_1 == indice_2);
		
		/** Intercambio los caracteres */
		char aux = tabla_carac[indice_1];
		tabla_carac[indice_1] = tabla_carac[indice_2];
		tabla_carac[indice_2] = aux;
		
		mezcla.append(tabla_carac);
		
		return mezcla.toString();
	}
	
	public static int cuentaLetra(String frase, char c) {
		int contador = 0;
		//
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i) == c ) {
				contador++;
			}
		}
		return contador;
	}
	public static void anagramaTest() {

		String anagrama1 = "roma";
		String anagrama2 = "amor";
		String anagrama3 = "mora";
		
		/** ANAGRAMA1 */
		System.out.println("#### Anagrama 1 ####");
		char[] tablaAnagrama1 = anagrama1.toCharArray();
		System.out.println(Arrays.toString(tablaAnagrama1));
		Arrays.sort(tablaAnagrama1);
		System.out.println(Arrays.toString(tablaAnagrama1));
		
		/** ANAGRAMA2 */
		System.out.println("#### Anagrama 2 ####");
		char[] tablaAnagrama2 = anagrama2.toCharArray();
		System.out.println(Arrays.toString(tablaAnagrama2));
		Arrays.sort(tablaAnagrama2);
		System.out.println(Arrays.toString(tablaAnagrama2));
		
		/** ANAGRAMA3 */
		System.out.println("#### Anagrama 3 ####");
		char[] tablaAnagrama3 = anagrama3.toCharArray();
		System.out.println(Arrays.toString(tablaAnagrama3));
		Arrays.sort(tablaAnagrama3);
		System.out.println(Arrays.toString(tablaAnagrama3));
	
	}
	public static void indexOF() {
		String frase = "En un lugar de la Mancha cuyo lugar";
		String palabra = "lugar";
		
		System.out.println(frase.replaceAll(palabra, "test"));
		System.out.println(frase.substring(11, 22));
		int index = frase.indexOf(palabra,0);
		int lastIndexOf = frase.lastIndexOf(palabra);
		System.out.println(index);
		System.out.println(lastIndexOf);
	}
	public static void pruebaProcessBuilder() {
		String palabra = "HOla mundo";
		
		StringBuilder sb = new StringBuilder(palabra);
		System.out.println(palabra);
		System.out.println(sb.reverse());
	}
public static void prueba1() {
	final String VOCALES = "aeiou";
	String frase = "Hola Mundo";
	
	for(int i=0; i<frase.length(); i++){
		if(VOCALES.contains(""+frase.charAt(i))) {
			frase= frase.replace(""+frase.charAt(i), "");
		}
	
	}
	System.out.println(frase);
}
	
	public static void replaceAll() {
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
