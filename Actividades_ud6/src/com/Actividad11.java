package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		String frase,dcod;
		dcod="";
		final String con1="p v i u m t e r k q s";
		final String con2="e i k m p q r s t u v";
		
		System.out.println("escriba una fraser para descodificar");
		frase=sc.nextLine();
		frase=frase.toLowerCase();
		
		for(int i=0;i<frase.length();i++) {
			dcod=dcod+Actividad10.codificador(con1,con2,frase.charAt(i));
		}
		
		System.out.println(dcod);
	}

}
