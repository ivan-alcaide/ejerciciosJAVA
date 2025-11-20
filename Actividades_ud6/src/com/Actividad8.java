package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		//definir variables y string builder
		StringBuilder sb=new StringBuilder();
		String frase,esarf,frasin;
		//inicializar una variable
		frasin=" ";
		frasin=frasin.trim();
		
		
		//pedir al usuario que escriba la frase
		System.out.println("Escriba una frase y te diré si es palíndroma");
		frase=sc.nextLine();
		
		//crear bocle que recorra los carácteres de la frase para introducirlos todos menos espacios y puntos  
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' '||frase.charAt(i)=='.') {
				
			}else {
				frasin=frasin+frase.charAt(i);
			}
		}
		//añadir al string builder la frase y utilizar la funcion reverse para darle la vuelta
		sb.append(frasin);
		sb.reverse();
		
		//convertir el string builder en una variable string
		esarf=sb.toString();
		
		//crear un condicional que imprima el resultado
		if(frasin.equalsIgnoreCase(esarf)) {
			System.out.println("Es una frase palíndroma");
		}else {
			System.out.println("No es una frase palíndroma");
		}
	}

}
