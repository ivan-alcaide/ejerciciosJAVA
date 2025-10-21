package Actividades_ud4;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//pido al usuario que diga un numero y su respuesta la utilizo como la variable de la funcion a la que llamo e imprimo el resultado
		System.out.println("Di un número y te dire cuantos divisores primos tiene: ");
		System.out.println("Su numero de divisores primos es " + divisores_primos(sc.nextInt()));

	}
	
	//creo la funcion para saber los divisores y luego dentro de esta funcion aplico la otra funcion para saber si son primos
	public static int divisores_primos(int num) {
		
		//defino variaables
		int primo = 0;
		boolean comp;
		
		//creo un bucle
		for (int contador = 2;contador<num;contador++) {
		if(num%contador==0) {
			comp = Actividad7.prim(contador);//aqui utilizo la funcion de la actividad anterior
			if(comp==true) {
				primo++;
				System.out.println("divisor primo ->" + contador);
			}
		}
		
	}
		return primo;
	}
}
