package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
Ejercicio 7: Fusiona dos listas ya ordenadas (6 + 6 → 12 ordenados).
Leer una serie de 6 enteros, guardarlos y mostrarlos ordenados.
 Repetir con otra serie de 6. 
 A continuación, 
 fusionar ambas tablas 
 en una tercera de forma que los 12 números sigan ordenados,
  sin volver a ordenar.
 */
public class Ejercicio7 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);	
		final String MENSAJE_NUMEROS = "Dime 6 números";
		//Definir variables
		/** Indices*/
		int it1 = 0, it2=0, it3=0;
		
		int [] tabla1 = {5,7,8,3,1,2};//new int[6];
		int [] tabla2 = {9,8,5,2,3,4};//new int[6];
		//Tabla fusionada
		int [] tabla3 = new int[tabla1.length + tabla2.length];
		
		//Inicializar primera tabla con 6 elementos
	/*	System.out.println(MENSAJE_NUMEROS);
		for(int i=0; i<tabla1.length; i++) {
			tabla1[i] = sc.nextInt();
		}
		//Inicializar segunda tabla con 6 elementos
		System.out.println(MENSAJE_NUMEROS);
		for(int i=0; i<tabla2.length; i++) {
			tabla2[i] = sc.nextInt();
		}*/
		//Ordenar tablas
		System.out.println("antes: " + Arrays.toString(tabla1));
		Arrays.sort(tabla1);
		System.out.println("después: " + Arrays.toString(tabla1));
		
		System.out.println("antes: " + Arrays.toString(tabla2));
		Arrays.sort(tabla2);
		System.out.println("después: " + Arrays.toString(tabla2));
		
		//Fusinar ambas tablas en una sin usar Arrays.sort
		/** while(it3 < tabla3.length) {
			
			if(it1==tabla1.length) {
				tabla3[it3++] = tabla2[it2++];
			}else if(it2==tabla2.length) {
				tabla3[it3++] = tabla1[it1++];
			}else if(tabla1[it1] < tabla2[it2]) {
				tabla3[it3++] = tabla1[it1++];
			}else {
				tabla3[it3++] = tabla2[it2++];
			}
		}*/
			
	/**
	 * ####
	 * # 2 FORMA
	 * ###
	 */
		while(it1 < tabla1.length  && it2 < tabla2.length) {
			if(tabla1[it1]<= tabla2[it2]) {
				tabla3[it3] = tabla1[it1];
				it1++;
			}else {
				tabla3[it3] = tabla2[it2];
				it2++;
			}
			it3++;
		}
		//Completamos hasta finalizar
		while(it1 < tabla1.length ) {
			tabla3[it3] = tabla1[it1];
			it1++;
			it3++;
		}
		while(it2 < tabla2.length ) {
			tabla3[it3] = tabla2[it2];
			it2++;
			it3++;
		}
		    
		
		
		//Mostrar resultado
		/*for(int n : tabla3) {
			System.out.println(n);
		}*/
		System.out.println(Arrays.toString(tabla3));
		
	}

}
