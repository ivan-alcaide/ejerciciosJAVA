package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] tabla=new int[0];
		
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
		
	}
	
	
	public static int[] sinRepetidos(int tabla[]) {
		Scanner sc=new Scanner(System.in);

		
		int temp, posicion, orig, sumj=1;
		
		
		System.out.println("A continuacion podra añadir numeros a una tabla, cuando quiera parar escriba -1");
		do {
		System.out.println("Introduzca un numero para añadir a la tabla");
		temp=sc.nextInt();
		if(temp==-1) {
			break;
		}
		tabla=Arrays.copyOf(tabla, tabla.length+1);
		posicion=tabla.length-1;
		tabla[posicion]=temp;
		
	
			
		}while(temp!=-1);
		
		for(int i=0;i<tabla.length;i++) {
			
			
			for(int j=sumj;j<tabla.length;j++){
				
				if(tabla[i]==tabla[j]) {
					orig=tabla[tabla.length-1];
					tabla[tabla.length-1]=tabla[j];
					tabla[j]=orig;
					tabla=Arrays.copyOf(tabla, tabla.length - 1);
					
				}
				
			}
			sumj++;
		}
		System.out.println("La tabla sin numeros repetidos es: \n");
		return tabla;
			
		
		
		
	
		}
		}
