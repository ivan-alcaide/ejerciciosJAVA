package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir string builder y variables
		StringBuilder sb=new StringBuilder();
		String palabra,secreta,intento;
		secreta="";
		
		//dar instrucciones al ususario
		System.out.println("El juego del anagrama, el jugador 1 introduce una palabra y se desordenan las letras\n el jugador 2 deverá descubrir cual es la palabra ");

		//pedir al jugador 1 la palabra
		System.out.println("Jugador 1: Escriba la palabra");
		palabra=sc.nextLine();
		
		if(palabra.equalsIgnoreCase("")) {
			System.out.println("Escriba una palabra");
			System.exit(0);
		}
		
		//añadir la palabra al string builder para ir quitando carácteres una vez sean seleccionados
		sb.append(palabra);
		
		//crear bucle que meta carácteres en un string aleatoriamente
		while(sb.length()>0) {
			int random=(int) (Math.random()*sb.length());
			
			secreta=secreta+sb.charAt(random);
			sb.deleteCharAt(random);
		}
		//imprimir palabra desordenada
		System.out.println("La palabra con los carácteres desordenados es "+secreta);
		
		//crear bucle para que el jugador 2 intente adivinarla o se rinda
		do {
			System.out.println("Jugador 2: Intenta adivinarla, si se rinde escriba <fin>");
			intento=sc.nextLine();
			
		}while(!intento.equalsIgnoreCase(palabra)&&!intento.equalsIgnoreCase("fin"));
		
		//imprimir un resultado en cada caso
		if(intento.equalsIgnoreCase(palabra)) {
			System.out.println("Acertaste esa era la palabra");
		}else {
			System.out.println("Gana el jugador 1, la palabra era "+ palabra);
		}
	}

}
