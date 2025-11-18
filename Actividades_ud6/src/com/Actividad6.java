package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		//defino el string builder con el que puedo modificar y crear cadenas
		StringBuilder sb=new StringBuilder();
		//definir variable
		String frase;
		//pedir al ususario la frase
		System.out.println("Escriba la frase y se la devolveré del revés");
		frase=sc.nextLine();
		//añadir la frase al string builder
		sb.append(frase);
		//utilizar la funcion reverse para que el contenido del string builder se ponga del revés
		sb.reverse();
		//imprimir los resultados
		System.out.println(sb.toString());
		
		
	}

}
