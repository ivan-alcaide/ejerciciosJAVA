package com;
/**
 * Solicitar los elementos de una matriz de tamaño 4×4.
 *  Determinar si es una matriz mágica 
 *  (la suma de cada fila y de cada columna es la misma).


 */
public class Ejercicio11 {
     static int[][] matrizMagica = {{1,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
     static int[][] noEsmatrizMagica = {{2,15,14,4},{12,6,7,9},{8,10,11,5},{13,3,2,16}};
   // Crea int[][] m = new int[4][4] y leerMatriz(m).
    		
    //int suma = sumaFila(m, 0); boolean magica = true.
   //Comprueba todas las filas con sumaFila y todas las columnas con sumaColumna; si alguna difiere, magica=false.
    public static void main(String [] args) {
    	
    	System.out.println(esMagica(noEsmatrizMagica) ? "Es mágica" : "No lo es");
    	
    }
    
    public static boolean esMagica(int[][] matriz) {
    	if(matriz == null || matriz.length == 0) return false;
    	//Tiene que ser cuadrada
    	int n = matriz.length;
    	
    	for(int [] fila: matriz) {
    		if(fila == null || fila.length != n) return false;
    	}
    	try {
    		// Todas las filas y columnas tienen que valer 'objetivo'
			int sumaObjetivo = sumaFila(matriz, 0);
			
			for(int  i=0; i<n; i++) {
				if(sumaFila(matriz, i) != sumaObjetivo) return false;
				if(sumaColumna(matriz, i) != sumaObjetivo) return false;
			}
			return true;
			
		} catch (Exception e) {
		
			e.printStackTrace();
			return false;
		}
    }
    
    public static int sumaColumna(int[][] matriz, int posicion) {
    	int acumulador = 0;
    	for(int [] fila : matriz) {
    		acumulador += fila[posicion];
    	}
    	return acumulador;
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
