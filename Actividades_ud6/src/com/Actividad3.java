package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir variables
		String cadena,palabra;
		//inicializar la cadena principal
		cadena=" ";
		System.out.println("Escribe palabras para rellenar la cadena y escribe fin para parar de añadir palabras");
		//crear bucle que lee plabras hasta que la palabra sea fin
		do {
			System.out.println("Introduzca una palabra");
			palabra=sc.nextLine();
			//comparar la palabra para que no sea fin sea mayuscula minuscula o tenga espacios antes y despues de la palabra
			if(!palabra.trim().equalsIgnoreCase("fin")) {
				cadena=cadena + " " + palabra.trim();
			}
		}while(!palabra.trim().equalsIgnoreCase("fin"));
		System.out.println("La cadena final es: \n"+ cadena.trim());
	}
	

}
