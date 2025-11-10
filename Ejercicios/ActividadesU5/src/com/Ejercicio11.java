package com;
/**
 * Solicitar los elementos de una matriz de tamaño 4×4.
 *  Determinar si es una matriz mágica 
 *  (la suma de cada fila y de cada columna es la misma).


 */
public class Ejercicio11 {
     static int[][] matrizMagica = {{1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
   // Crea int[][] m = new int[4][4] y leerMatriz(m).
    		
    //int suma = sumaFila(m, 0); boolean magica = true.
   //Comprueba todas las filas con sumaFila y todas las columnas con sumaColumna; si alguna difiere, magica=false.
    public static void main(String [] args) {
    	
    	try {
    		System.out.println(sumaFila(matrizMagica, 3));
    	}catch(Exception e) {
    		System.out.print(e.toString());
    	}
    	
    }
    public static int sumaColumna(int[][] matriz, int posicion) {
    	
    }
    
    public static int sumaFila(int[][] matriz , int posicion ) throws Exception {
    	
    	if(posicion >=matriz.length) {
    		throw new Exception("Fuera de rango");
    	}
    	
    	int [] fila = matriz[posicion];
    	int acumulador = 0;
    	for(int numero : fila) {
    		acumulador+=numero;
    	}
    	return acumulador;
    }
    
}
