package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] tabla=new int[1];
		
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
		
	}
	
	
	public static int[] sinRepetidos(int t[]) {
		Scanner sc=new Scanner(System.in);

		int[] tabla=new int[0];
		int temp, posicion;
		
		
		System.out.println("A continuacion podra añadir numeros a una tabla, cuando quiera parar escriba -1");
		do {
		System.out.println("Introduzca un numero para añadir a la tabla");
		temp=sc.nextInt();
		if(temp!=-1) {
			Arrays.copyOf(tabla, tabla.length+1);
			posicion=tabla.length-1;
			tabla[posicion]=temp;
		}
		
			
			
		}while(temp!=-1);
		
		return tabla;
			
		
		
		
	
		}
		}
