package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String frase,cod;
		final String con1="e i k m p q r s t u v";
		final String con2="p v i u m t e r k q s";
	
		char[] conj1=new char[con1.length()];
		char[] conj2=new char[con2.length()];
		
		
		for(int i=0;i<con1.length();i++) {
				if(con1.charAt(i)!=' ') {
					conj1[i]=con1.charAt(i);
				}	
		}
		
		for(int i=0;i<con2.length();i++) {
			if(con2.charAt(i)!=' ') {
				conj2[i]=con2.charAt(i);
			}	
	}
		
		System.out.println("Escriba una frase para codificar");
		frase=sc.nextLine();
		
		char[] fra=new char[frase.length()];
		
		for(int j=0;j<fra.length;j++) {
			for (int k=0;k<conj1.length;k++) {
				//codificador(conj1[k],conj[k],fra[j]);
			}
		}
		
		
		
	}
	
	
	//public static char codificador(char conj1[],char conj2[], char c) {
		
	//}

}
