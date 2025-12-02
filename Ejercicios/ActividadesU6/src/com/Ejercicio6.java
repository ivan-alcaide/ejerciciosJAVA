package com;
/**
 * Diseñar una función a la que se le pase una cadena de caracteres 
 * y la devuelva invertida. 
 * Un ejemplo, la cadena “Hola mundo” 
 * quedaría “odnum aloH”
 */
public class Ejercicio6 {
	public static void main(String [] args) {
		String cadena = "Hola mundo";
		System.out.println(invertida(cadena));
	}
	public static String invertida(String cadena) {
		StringBuilder cadena_invertida = new StringBuilder("");
		for(int i=cadena.length()-1; i>=0; i--) {
			char caracter = cadena.charAt(i);
			//System.out.println(caracter);
			cadena_invertida.append(caracter);
		}
		return cadena_invertida.toString();
	}
}

