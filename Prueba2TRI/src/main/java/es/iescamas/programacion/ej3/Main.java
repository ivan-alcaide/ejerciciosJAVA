package es.iescamas.programacion.ej3;

public class Main {

	public static void main(String[] args) {
		OperableMatriz[] lista=new OperableMatriz[2];
		
		int[][] m1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] m2= {{1,1,1},{1,1,1},{1,1,1}};
		lista[0]=new MatrizDatos(m1);
		lista[1]=new MatrizCuadrada(m2);
		
		for(int i=0;i<lista.length;i++) {
			lista[i].mostrarResultado();
			System.out.println();
		}
		
		/**
		 * Muestra la matriz 
		 */
	}
}
