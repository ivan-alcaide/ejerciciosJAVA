package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad4 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc = new Scanner(System.in);
	
		//defino las variables
		int num1, num2;
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		//hago la estructura condicional para que el programa responda en funcion deba responder
		if (num1 > num2) {
			System.out.println("El número mayor es: " + num1);
		}
		else if (num1 == num2) {
			System.out.println("Es el mismo número: " + num1);
		}
		else {
			System.out.println("El número mayor es: " + num2);
		}
		
		
		
		
	}

}