package Actividades_ud2;
//importamos el lector
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc= new Scanner(System.in);
		
		//defino las variable
		int num1, num2;
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Diga un número: ");
		num1 = sc.nextInt();
		
		//pido al usuario que diga otro numero y que su respuesta sea el objeto de una variable
		System.out.println("Diga otro número: ");
		num2 = sc.nextInt();
		
		//hago la estructura condicional para que el programa responda en funcion deba responder
		if (num1==num2) {
			System.out.println("Son el mismo número");
		}else {
			System.out.println("Son números distinto");
		}

	}

}
