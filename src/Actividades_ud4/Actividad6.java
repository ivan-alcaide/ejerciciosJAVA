package Actividades_ud4;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//aqui defino la variable
		boolean vol;
		
		//pido al usiuario la letra y hago que su respuesta sea la variable para la funcion, la cual llamo y la introduzco dentro de una variable
		System.out.println("di una letra");
		vol = vocal(sc.next().charAt(0));
		
		//imprimo el resultado
		System.out.println("¿la letra que has dado es una vocal? " + vol);
		
		
		
		
		
		//aqui creo la funcion en la que devuelve true o false dependiendo si es una vocal o no
	}
	public static boolean vocal(char letra) {
		if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
			return true;
		}else {
			return false;
		}
	}
}
