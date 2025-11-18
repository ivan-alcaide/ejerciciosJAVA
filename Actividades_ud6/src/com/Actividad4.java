package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//defino variable
		String frase;
		//pedir al usuario que escriba la frase y hacer que sea objeto de su variabble
		System.out.println("Escriba una frase y le diré cuantos espacios tiene");
		frase=sc.nextLine();
		//defino e inicializo el contador de espacios
		int numero=0;
		//crear bucle para que recorra todos los carácteres de la frase y si es un espacio lo sume al contador
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				numero++;
			}
		}
		//imprimir los resultados
		System.out.println("El número de espacios en la frase es de "+numero);
		
	}

}
