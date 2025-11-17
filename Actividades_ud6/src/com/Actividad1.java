package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String palabra1,palabra2;
		System.out.println("Diga una palabra");
		palabra1=sc.nextLine();
		System.out.println("Diga otra palabra");
		palabra2=sc.nextLine();
		if (palabra1.length()>palabra2.length()) {
			System.out.println("La palabra dos es la más corta ");
		}else if(palabra2.length()>palabra1.length()) {
			System.out.println("La palabra uno es la más corta ");
			
		}else {
			System.out.println("Las dos palabras son iguales");
		}
	
	}

}
