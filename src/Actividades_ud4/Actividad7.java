package Actividades_ud4;

import java.util.Scanner;


public class Actividad7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		boolean primo;
		
		System.out.println("Diga su  número y le diré si es primo: ");
		primo=prim(sc.nextInt());
		System.out.println("¿Es primo? " + primo);
		

	}
	//creo la funcion para saber si es primo y devuelve true o false
	public static boolean prim(int num) {
		
		boolean prim = true;
		//creo un bucle para comprobar si es primo
					for(int divi = 2;divi<=Math.sqrt(num);divi++) {
						if(num%divi==0) {
						prim = false;
						}
					}	
					
					return prim;
	}

}
