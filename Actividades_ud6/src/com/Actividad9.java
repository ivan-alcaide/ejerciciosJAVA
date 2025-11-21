package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		//definir variables, escaner, y string builders
		Scanner sc=new Scanner(System.in);
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String javalin1,javalin2,frase,frasejavalin1,frasejavalin2,frase_T;
		//inicializar variables con los distinos dialectos de javalin
		javalin1="Javalín, javalón			";
		javalin2="			javalén, len, len";
		
		//pedir al usuario su frase e indicar los tabuladores de ls muletillas
		System.out.println("Las muletillas del javalín en mi programa contienen 3 tabuladores, en el dialecto uno después de la muletilla\ny en el dialecto 2 antes de la muletilla");
		System.out.println("Escriba una frase");
		frase=sc.nextLine();
		
		//terminar programa si la frase es más corta que el número de carácteres de la muletilla más corta ya que ya se podría saber que no está en javalin
		if(frase.length()<javalin1.length()) {
			System.out.println("Como su frase es tan corta es imposible que esté en javalín");
			System.exit(0);
		}
		
		//añadir al string builder la frase para añadir las muletillas y asi poder comparar con la frase original
		sb1.append(frase);
		sb1.replace(0, javalin1.length(),javalin1);
		
		sb2.append(frase);
		sb2.replace(frase.length()-javalin2.length(), frase.length(), javalin2);
		
		//trasladar los string builders a variables
		frasejavalin1=sb1.toString();
		frasejavalin2=sb2.toString();
		
		//comprobar si la frase original es igual a la del idioma javalín
		if(frase.equalsIgnoreCase(frasejavalin1)||frase.equalsIgnoreCase(frasejavalin2)) {
			System.out.println("La frase está en javalín");
			//llamar a la funcion y que el valor que devuelve sea objeto de una variable
			frase_T=traductorJava(frase,frasejavalin1,frasejavalin2,javalin1,javalin2);
			
			//imprimir resultado si está en javalin
			System.out.println("La frase traducida es:\n" + frase_T);
			
		}else {
			//imprimir resultado si no está en javalín
			System.out.println("La frase no está en javalín");
		}
		
		

	}
	
	//crear función para traducir la frase de javalín a castellano
	public static String traductorJava(String frase,String frasejavalin1,String frasejavalin2,String javalin1,String javalin2) {
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String frase_T;
		sb1.append(frase);
		sb2.append(frase);
		//comprobar si la frase está en el dialecto1 o en el dialecto2 y usar la función replace para remplazar las muletillas y espacios por nada
		if(frase.equalsIgnoreCase(frasejavalin1)) {
			sb1.replace(0, javalin1.length(), "");
			frase_T=sb1.toString();
			
		}else {
			sb2.replace(frase.length()-javalin2.length(), frase.length(), "");
			frase_T=sb2.toString();
		}
		frase_T=frase_T.trim();
		//devolver la frase traducida
		return frase_T;
		
	}

}
