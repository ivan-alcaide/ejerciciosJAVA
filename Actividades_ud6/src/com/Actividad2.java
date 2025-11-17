package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Primera versión");
		primeraVersion(sc);
		
		System.out.println("Segunda versión");
		segundaVersion(sc);
	}
	
	//crear primera version
	public static void primeraVersion(Scanner sc) {
		//definir las variables
		String contraseña, palabra;
		int numero;
		char letraI, letraF;
		//pedir al usuario la contraseña
		System.out.println("Jugador 1, escriba la contraseña");
		contraseña=sc.nextLine();
		//inicializar variables con las respectivas pistas
		numero=contraseña.length();
		letraI=contraseña.charAt(0);
		letraF=contraseña.charAt(numero-1);
		//imprimir las pistas
		System.out.println("La contraseña tiene " + numero + " caracteres, empieza por el carácter " + letraI + " y acaba por el carácter " + letraF );
		//crear bucle para que se repita hasta que se acierte la contraseña
		do {
			System.out.println("Intente adivinarla");
			palabra=sc.nextLine();
		}while(!palabra.equals(contraseña));
		System.out.println("Enhorabuena la contraseña era "+ contraseña+" usted acertó");
		
	}
	
	//crear segunda version
	public static void segundaVersion(Scanner sc) {
		//definir variables
		String contraseña, palabra;
		int orden;
		//pedir al usuraio mla contraseña
		System.out.println("Jugador 1, escriba la contraseña");
		contraseña=sc.nextLine();
		
		//crear bucle para que se repita hasta que se acierte la contraseña
		do {
			System.out.println("Intente adivinarla");
			palabra=sc.nextLine();
			//comprobar si la palabra va alfabeticamente antes o despues que la contraseña e imprimirlo con un condicional
			orden=palabra.compareTo(contraseña);
			if(orden<0) {
				System.out.println("La contraseña va alfabéticamente después");
			}else if(orden>0) {
				System.out.println("La contraseña va alfabéticamente antes");
			}
		
		}while(!palabra.equals(contraseña));
		System.out.println("Enhorabuena la contraseña era "+ contraseña+" usted acertó");
		
	}
	

}
