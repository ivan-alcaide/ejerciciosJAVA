package com;

import java.util.Scanner;

/**
 * Los habitantes de Javalandia tienen un idioma algo extraño; 
 * cuando hablan siempre comienzan sus frases con “Javalín, javalón”, 
 * para después hacer una pausa más o menos larga (la pausa se representa 
 * mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje. 
 * 
 * Existe un dialecto que no comienza sus frases con la muletilla anterior, 
 * pero siempre las terminan con un silencio, más o menos prolongado y la coletilla 
 * “javalén, len, len”. Se pide diseñar un traductor que, en primer lugar, 
 * nos diga si la frase introducida está escrita en el idioma de Javalandia 
 * (en cualquiera de sus dialectos), y en caso afirmativo, 
 * nos muestre solo el mensaje sin muletillas.


 */
public class Ejercicio9 {
	static Scanner SCAN = new Scanner(System.in);
	
	private final static String MULETILLA_INICIAL = "Javalín, javalón";
	private final static String MULTELILLA_FINAL = "javalén, len, len";
	
	private static String textoPrueba1 = "Javalín, javalón \t esto es texto de prueba \t";
	private static String textoPrueba2 = "Esto no es de javalandia";
	private static String textoPrueba3 = "\nTexto para prueba 3 para probar \t javalén, len, len";
	private static String textoPrueba4 = "NO empieza por Javalín, javalón \t esto es texto de prueba";
	
	public static void main (String [] args) {
		System.out.println("Escribe texto en idioma de Javalin");
		//String entrada =  SCAN.nextLine().trim();
		String entrada = textoPrueba4;
		
		/**
		 * Comprueba si la frase comienza por la muletilla inicial o termina por la muletilla final. 
		 * Según el caso, recorta esa parte y elimina también los espacios 
		 * o tabuladores que actúan como pausa para quedarte solo con el mensaje central.
		 */
		//Comprueba si la frase comienza por la muletilla inicial
		if(entrada.startsWith(MULETILLA_INICIAL)) {
			System.out.println("El mensaje es de Javalandia:");
			// Limpiamos y extraemos el mensaje
			String mensaje = entrada.substring(MULETILLA_INICIAL.length()).trim();
			System.out.println(mensaje);
		}else if(entrada.endsWith(MULTELILLA_FINAL)) {
			System.out.println("El mensaje es de Javalandia:");
			String mensaje = entrada.substring(0, entrada.length() - MULTELILLA_FINAL.length()).trim();
			System.out.println(mensaje);
		}else {
			System.out.println("El mensaje no es de los habitantes de Javalandia");
		}
		
	}
	
}
