package com;
/**
 * Crear una tabla bidimensional de tamaño 5×5 
 * y rellenarla de manera que la posición [n, m] contenga n + m. 
 * Mostrar su contenido.
 */
public class Ejercicio12 {
	
	/**
	 * Función que crea una matriz de filas x columnas
	 * @param filas
	 * @param columnas
	 * @return
	 */
	public static int[][] crearMatriz(int filas, int columnas){
		int[][] matriz = new int[filas][columnas];
		
		for(int f=0; f<filas; f++) {
			for(int c=0; c<columnas; c++) {
				matriz[f][c] = f + c;
			}
		}
		return matriz;
	}
	/**
	 * Muestra la matriz Fila X Columna
	 * @param matriz
	 */
	public static void mostrarMatriz(int[][] matriz) {
		
		for(int f=0; f<matriz.length; f++) {
			for(int c=0; c<matriz[f].length; c++) {
				System.out.print(matriz[f][c]  + " ");
			}
			System.out.print("\n");
		}
		
	}

	public static void main(String [] args) {
		final int FILAS = 5;
		final int COLUMNAS = 5;
		int[][] tabla = crearMatriz(FILAS, COLUMNAS);
		mostrarMatriz(tabla);
	}
}
