package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir variables
		String nombre,nuevaCadena;
		//pedir al usuario su nombre
		System.out.println("Escriba su nombre y primer apellido y se lo devolveré sin vocales");
		nombre=sc.nextLine();
		//fallamr a la funcion y hacer lo que devuelve objeto de una variable
		nuevaCadena=nuevaCadena(nombre);
		//imprimir el resultado
		System.out.println("Tu nombre sin vocales es " + nuevaCadena);
	}
	
	//crear función que indique si cada carácter del nombre coincide con una vocal 
	public static String nuevaCadena(String nombre) {
		//definir e inicializar la cadena de todas las vocales en sus posibles estados
		String vocales="AEIOUaeiouÁÉÍÓÚáéíóúÀÈÌÒÙàèìòùÜü";
		//definir e inicializar nueva cadena
		String nuevaCadena=" ";
		for(int i=0;i<nombre.length();i++) {
			//meter el carácter en una variable
			char letra=nombre.charAt(i);
			//condicional en el que si no contiene el carácter indicado la variable vocales añada el carácter a la nueva cadena
			if(vocales.indexOf(letra)==-1) {
				nuevaCadena=nuevaCadena+letra;
			}
			
		}
		//quitar espacios finales e iniciales y devolver la nueva cadena
		nuevaCadena=nuevaCadena.trim();
		return nuevaCadena;
	}
}
