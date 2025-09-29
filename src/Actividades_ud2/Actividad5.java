package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad5 {
	public static void main(String[] args) {
		//creo el lector
		Scanner sc = new Scanner(System.in);	
		
		//defino la variable
		double num ;
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca un número decimal: ");
		num= sc.nextDouble();
		
		//hago la estructura condicional para que el programa responda en funcion deba responder
		if (num == 0.0 || num >= 1.0 || num <= -1.0 ) {
			System.out.println("No es un número casi-cero");
		}else {
			System.out.println("Es un número casi-cero");
		}
		
		
		
	}
}
