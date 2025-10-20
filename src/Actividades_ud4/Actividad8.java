package Actividades_ud4;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Di un número y te dire cuantos divisores primos tiene: ");
		System.out.println("Su numero de divisores primos es " + divisores_primos(sc.nextInt()));

	}
	
	
	public static int divisores_primos(int num) {
		
		int primo = 0;
		boolean comp;
		for (int contador = 2;contador<num;contador++) {
		if(num%contador==0) {
			comp = Actividad7.prim(contador);
			if(comp==true) {
				primo++;
			}
		}
		
	}
		return primo;
	}
}
