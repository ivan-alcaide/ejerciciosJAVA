package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String [] args) {
		int [] tabla =  {1,3,5,5, 7,9,9,9,5};
		
		
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
	
	}
	
	public static int[] sinRepetidos(int t[]) {
		
		int [] res = Arrays.copyOf(t, 1);
		for(int i=0; i<t.length; i++) {
			if(!contiene(res, t[i])){
				res = insertar( res, t[i]);
			}
		}
		return res;
	}
	
	public static int[] insertar(int [] tabla, int valor) {
		int[] nuevaTabla = Arrays.copyOf(tabla, tabla.length+1);
		nuevaTabla[nuevaTabla.length-1] = valor;
		return nuevaTabla;
	}
	
	public static boolean contiene(int [] tabla, int valor) {
		boolean ret = false;
		for(int i = 0; i< tabla.length; i++) {
			if(tabla[i]==valor) {
				return true;
			}
		}
		return ret;
	}
	
	
}