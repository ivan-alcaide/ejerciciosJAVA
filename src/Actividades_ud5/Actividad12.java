package Actividades_ud5;

import java.util.Arrays;

public class Actividad12 {

	public static void main(String[] args) {
		
		int[][] matriz=new int[5][5];
		
		//bucle para rellenar la matriz
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz[i][j]=i+j;
			}
		}
		//llamar a la funcion
		mostrarMatriz(matriz);
	}
	//crear funcion para mostrar la matriz
	public static void mostrarMatriz(int[][] m) {

		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
