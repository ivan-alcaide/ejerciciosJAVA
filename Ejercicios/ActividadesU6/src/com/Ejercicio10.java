package com;

import java.util.Scanner;

/**
 * Disponemos de la siguiente relación de letras:

1
conjunto 1: e i k m p q r s t u v
conjunto 2: p v i u m t e r k q s

mediante la cual es posible codificar un texto, convirtiendo cada letra del conjunto 1, en su correspondiente del conjunto 2. El resto de las letras no se modifican. Los conjuntos se utilizan tanto para codificar mayúsculas como minúsculas, mostrando siempre la codificación en minúsculas.

Un ejemplo: la palabra «PaquiTo» se codifica como «matqvko».

Se pide realizar un programa codificador, en el que se implemente la función,
char codifica(char conjunto1[],char conjunto2[], char c)
que devuelve el carácter c codificado según los conjuntos 1 y 2 que se le pasan.
 */
public class Ejercicio10 {
	
	static Scanner SCAN = new Scanner(System.in);
	private static final String conjunto1 = "eikmpqrstuv";
	private static final String conjunto2 = "pviumterkqs";
	public static String mensaje_a_codificar = "PaquiTo"; //matqvko
	
	public static void main(String [] args) {

		System.out.println("Dime una palabra para codificar");
		mensaje_a_codificar =SCAN.nextLine();
		
		
		StringBuilder cadena_codificada = new StringBuilder();
		
		/* Recorrera las palabras caracter a caracter */
		for(int i=0; i<mensaje_a_codificar.length(); i++) {
			char c_actual = mensaje_a_codificar.charAt(i);
			char codificado = codifica(conjunto1.toCharArray(), conjunto2.toCharArray(), c_actual);
			cadena_codificada.append(codificado);
		}
		
		System.out.println(cadena_codificada.toString());
	}
	
	/**
	 * Un ejemplo: el carácter «P» se codifica como «m» porque se encuentra en el conjunto1
	 *             el carácter <a> al no encontrarse en el conjunto1 se devuelve 'a'
	 * @param conjunto1
	 * @param conjunto2
	 * @param c
	 * @return
	 */
	public static char codifica(char conjunto1[],char conjunto2[], char c) {
	
		c=Character.toLowerCase(c);
		
		for(int i=0; i<conjunto1.length; i++) {
			if(conjunto1[i] == c) {
				return conjunto2[i];
			}
		}

		return c;
	}
	public static char[] devolverConjunto1() {
		return conjunto1.toCharArray();
	}
	public static char[] devolverConjunto2() {
		return conjunto2.toCharArray();
	}
}
