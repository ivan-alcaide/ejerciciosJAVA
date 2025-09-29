package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc= new Scanner(System.in);
		
		//defino las variables
		int num1, num2, num3;
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca un número: ");
		num1 = sc.nextInt();
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca otro número: ");
		num2 = sc.nextInt();
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca un número: ");
		num3 = sc.nextInt();
		
		//hago la estructura condicional para que el programa responda en funcion deba responder
		if (num1 > num2 && num2 > num3  ) {
			System.out.println("Ordenados de mayor a menor serían: " + num1 + " , " + num2 + " , " + num3);
			
		}else if (num1 > num3 && num3 > num2) {
			System.out.println("Ordenados de mayor a menor serían: " + num1 + " , " + num3 + " , " + num2);
			
		}else if (num3 > num2 && num2 > num1) {
			System.out.println("Ordenados de mayor a menor serían: " + num3 + " , " + num2 + " , " + num1);
			
		}else if (num3 > num1 && num1 > num2) {
			System.out.println("Ordenados de mayor a menor serían: " + num3 + " , " + num1 + " , " + num2);
			
		}else if (num2 > num1 && num1 > num3){
			System.out.println("Ordenados de mayor a menor serían: " + num2 + " , " + num1 + " , " + num3);
			
		}else{
			System.out.println("Ordenados de mayor a menor serían: " + num2 + " , " + num3 + " , " + num1);
		}
	}

}