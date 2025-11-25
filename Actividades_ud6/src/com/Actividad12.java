package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//definir variables
		String p1,p2;
		
		//pedir al ususario las dos palabrasa
		System.out.println("A continuación diga dos palabras y le diré si son anagramas");
		p1=sc.nextLine();
		p2=sc.nextLine();
		
		//comprobar que tengan la misma cantidad de carácteres
		if(p1.length()!=p2.length()) {
			System.out.println("No son anagramas");
		}else {
			//hacer que sean todas las letras minúsculas
			p1=p1.toLowerCase();
			p2=p2.toLowerCase();
			
			//definir un contador y crear un bucle que compruebe si las letras coinciden en cualquier posición y sumar 1 al contador
		int contador=0;
			for(int i =0;i<p1.length();i++) {
				for(int j=0;j<p2.length();j++) {
					if(p1.charAt(i)==p2.charAt(j)) {
						contador++;
					}
					
				}
			}
			
		int contador2=0;
			for(int i =0;i<p1.length();i++) {
				for(int j=0;j<p2.length();j++) {
					if(p1.charAt(i)==p1.charAt(j)) {
						contador2++;
					}
					
				}
			}		
			
			//comprobar que el contador  sea igual a la cantidad de carácteres de las palabras e imprimir resultado en cada caso
			if(contador==contador2) {
				System.out.println("Son anagramas");
			}else {
				System.out.println("No son anagramas");
			}
		}
	}

}
