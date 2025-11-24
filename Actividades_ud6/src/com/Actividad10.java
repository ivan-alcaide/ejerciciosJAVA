package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		
		String frase,cod;
		cod="";
		final String con1="e i k m p q r s t u v";
		final String con2="p v i u m t e r k q s";
		
		System.out.println("escriba una fraser para codificar");
		frase=sc.nextLine();
		frase=frase.toLowerCase();
		
		for(int i=0;i<frase.length();i++) {
			cod=cod+codificador(con1,con2,frase.charAt(i));
		}
		
		System.out.println(cod);
	}
	
	public static char codificador(String c1,String c2, char f){
		
		char cod;
		
		for(int i=0;i<c1.length();i++) {
			if(f==c1.charAt(i)) {
				return c2.charAt(i);
			}
		}
		
		return f;
		
		
		
		
	
		
 	}

}
