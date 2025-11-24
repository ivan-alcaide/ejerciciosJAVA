package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir variables
		String frase,repe="";
		
		//pedir al usuario la frase y hacerla minúsculas
		System.out.println("escriba una frase y le diré cuantas veces se repite cada letra");
		frase=sc.nextLine();
		frase=frase.toLowerCase();
		
		//crear bucle para contar las veces que se repite cada letra comprobando que no se haya contado antes
		for(int i=0;i<frase.length();i++) {
			 char letra=frase.charAt(i);
			if(repe.indexOf(letra)==-1 && letra!=' ' && letra!='.') {
				int contador=0;
				for(int j=0;j<frase.length();j++) {
				if(letra==frase.charAt(j)) {
						contador++;
						
					}
			}
				System.out.println(letra + ": " + contador);
			repe=repe+letra;
			
				
			}
			
			
		}
	}

}
