package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir variables y tabla
		int temp, contador, posicion_ex;
		contador=0;
		int [] puntuaciones = new int[5];
		
		System.out.println("A continuacion introduzca las 5 puntuaciones de los programadores");
		
		//bucle para rellenar las primeras 5 puntuaciones
		for(int i=0;i<puntuaciones.length;i++) {
			System.out.println("Introduzca una puntuación: " );
			puntuaciones[i]=sc.nextInt();
		}
		Arrays.sort(puntuaciones);
		System.out.println("Las puntuaciones ordenadas son: " + Arrays.toString(puntuaciones));
		
		System.out.println("Ahora añade hasta 3 puntuaciones más, si desea parar de introducir puntuaciones introduzca -1");
		//bucle para añadir las 3 puntuaciones extras
		do {
			
			
			System.out.println("Introduzca una puntuación: ");
			temp=sc.nextInt();
			if(temp==-1) {
				break;
			}else {
				puntuaciones=Arrays.copyOf(puntuaciones,puntuaciones.length+1);
				posicion_ex=puntuaciones.length-1;
				puntuaciones[posicion_ex]=temp;
			}
			contador++;
		}while(contador<3);
		
		//imprimir la tabla final ordenada
		Arrays.sort(puntuaciones);
		System.out.println("Las puntuaciones ordenadas son: " + Arrays.toString(puntuaciones));

	}

}
