package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//definir variables
		String frase,p;
		
		//pedir al usuario que escriba la frase y la palabra
		System.out.println("Escriba una frase");
		frase=sc.nextLine();
		System.out.println("Escriba la palabra que quieres saber las veces que se repite");
		p=sc.nextLine();
		//imprimir resultado llamando a la función
		System.out.println("Esa palabra se repite "+buscaPalabra(frase,p) + " veces");
		
		
	}
	//crear funcion donde divide la frase en sus palabras y comprueba si son iguales
	public static int buscaPalabra(String frase,String p) {
		String[] fraseL = frase.split(" ");
		int contador=0;
		for(int i=0;i<fraseL.length;i++) {
			String palabraF= fraseL[i];
			palabraF=palabraF.trim();
			if(palabraF.equalsIgnoreCase(p)||palabraF.equalsIgnoreCase(p+".")||palabraF.equalsIgnoreCase(p+",")||palabraF.equalsIgnoreCase(p+";")||palabraF.equalsIgnoreCase(p+":")||palabraF.equalsIgnoreCase(p+"?")) {
				contador++;
			}
			
		}
		return contador;
	}
	
}
