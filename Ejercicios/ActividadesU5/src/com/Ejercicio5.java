package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Desarrollar el juego de la cámara secreta. El jugador elige la longitud de la
 * combinación (dígitos del 1 al 5). La aplicación genera aleatoriamente la
 * combinación y, en cada intento del usuario, muestra para cada dígito si es
 * mayor, menor o igual que el correspondiente de la combinación secreta.
 * 
 * 
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		int[] tablaUsuario, tablaAleatoria;
		char[] tablaResultado;

		do {
			System.out.println("Dime un número entre 1 y 5");
			n = sc.nextInt();
		} while (n < 0 || n > 5);
		// Creamos una tabla de <n> elementos vacia
		int[] tabla = crearTablaVacia(n);
		// Rellenamos la tabla de <n> elementos con números aleatorios
		tablaAleatoria = rellenarTablaConNumeroAleatorio(tabla);
		System.out.println(Arrays.toString(tabla));

		// Utiles.mostrarTabla(tabla);
		do {
			tablaUsuario = tablaUsuario(tabla, sc);
			System.out.println(Arrays.toString(tablaUsuario));

			tablaResultado = comprobacionTablas(tablaUsuario, tablaAleatoria);
			System.out.println(Arrays.toString(tablaResultado));
		} while (!esFinal(tablaResultado));
	
		System.out.println("Fin");
		//testTablas();
	}

	public static boolean esFinal(char[] tablaResultado) {
		boolean resultado = true;
		for (int i = 0; i < tablaResultado.length; i++) {
			if (tablaResultado[i] != '=') {
				return false;
			}
		}
		return resultado;
	}

	public static char[] comprobacionTablas(int[] tablaUsuario, int[] tablaAleatoria) {
		char[] tablaResultado = new char[tablaUsuario.length];
		for (int i = 0; i < tablaUsuario.length; i++) {
			if (tablaUsuario[i] < tablaAleatoria[i]) {
				tablaResultado[i] = '-';
			} else if (tablaUsuario[i] > tablaAleatoria[i]) {
				tablaResultado[i] = '+';
			} else {
				tablaResultado[i] = '=';
			}
		}
		return tablaResultado;
	}

	private static int[] tablaUsuario(int[] tabla, Scanner sc) {
		int [] tablaDevuelta  = new int[tabla.length];
		for (int i = 0; i < tabla.length; i++) {
			System.out.println("Dime un numero " + (i + 1));
			tablaDevuelta[i] = sc.nextInt();
		}
		return tablaDevuelta;
	}

	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int[] crearTablaVacia(int n) {
		int[] tabla = new int[n];
		return tabla;
	}

	/**
	 * 
	 * @param tabla
	 * @return
	 */
	public static int[] rellenarTablaConNumeroAleatorio(int[] tabla) {
		Random random = new Random();
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = random.nextInt(10);
		}
		return tabla;
	}

	public static void testTablas() {
		int[] tablaUsuario = { 2, 3, 1 };
		int[] tablaAleatoria = { 1, 3, 3 };
		char[] test = comprobacionTablas(tablaUsuario, tablaAleatoria);
		System.out.println(Arrays.toString(test));

	}

	public static void testTablaResultado() {
		char[] tablaResultado1 = { '=', '=', '=' };
		char[] tablaResultado2 = { '=', '-', '=' };
		System.out.println("1 :: " + esFinal(tablaResultado1));
		System.out.println("2 :: " + esFinal(tablaResultado2));
	}

}
