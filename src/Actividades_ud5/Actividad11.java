package Actividades_ud5;
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
	        int[][] m = new int[4][4];
	        leerMatriz(m);

	        if (esMagica(m)) {
	            System.out.println("La matriz es mágica.");
	        } else {
	            System.out.println("La matriz NO es mágica.");
	        }
	    }

	    //función para leer los valores de la matriz
	    public static void leerMatriz(int[][] m) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce los elementos de la matriz 4x4:");

	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.println("Elemento [" + i + "][" + j + "]:");
	                m[i][j] = sc.nextInt();
	            }
	        }
	    }

	    //función para comprobar si la matriz es mágica
	    public static boolean esMagica(int[][] m) {
	        int suma = sumaFila(m, 0); 

	        //comprobar filas
	        for (int i = 1; i < 4; i++) {
	            if (sumaFila(m, i) != suma) {
	                return false;
	            }
	        }

	        //comprobar columnas
	        for (int j = 0; j < 4; j++) {
	            if (sumaColumna(m, j) != suma) {
	                return false;
	            }
	        }

	        //si todas las filas y columnas coinciden es mágica
	        return true;
	    }

	    //función para sumar una fila
	    public static int sumaFila(int[][] m, int fila) {
	        int suma = 0;
	        for (int j = 0; j < 4; j++) {
	            suma += m[fila][j];
	        }
	        return suma;
	    }

	    //función para sumar una columna
	    public static int sumaColumna(int[][] m, int col) {
	        int suma = 0;
	        for (int i = 0; i < 4; i++) {
	            suma += m[i][col];
	        }
	        return suma;
	    }
	}