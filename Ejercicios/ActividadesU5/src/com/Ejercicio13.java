package com;
/***
 * Sobrecargar la función maximo() para que calcule el máximo de una tabla de enteros.


 */
public class Ejercicio13 {
	public static void main(String [] args) {
		int[] tabla = {3, 5, 71, 4,9,  1, 0};
		System.out.println( maximo(tabla));
	}
	/**
	 * Función que devuelve el máximo de una lista de números
	 * @param tabla_numeros
	 * @return
	 */
	public static int maximo(int[] tabla_numeros) {
		int max = Integer.MIN_VALUE;
		for(int numero :tabla_numeros) {
			if(numero > max) {
				max = numero;
			}
		}
		return max;
	}
 }
