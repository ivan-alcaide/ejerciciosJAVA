package Actividades_ud2;
//importo el lector
import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino la variable
		int dia;
		
		//pido al usuario un numero y lo hago objeto de una variable
		System.out.println("Diga un numero del 1 al 7 y te dire que dia de la semana es: ");
		dia=sc.nextInt();
		
		//hago la estructura condicional con switch case y en cada caso da su respectiva respuesta
		switch (dia) {
		case 1:
			System.out.println("Es lunes");
			break;
		case 2:
			System.out.println("Es martes");
			break;
		case 3:
			System.out.println("Es miércoles");
			break;
		case 4:
			System.out.println("Es jueves");
			break;
		case 5:
			System.out.println("Es viernes");
			break;
		case 6:
			System.out.println("Es sábado");
			break;
		case 7:
			System.out.println("Es domingo");
			break;
		default:
			System.out.println("Te dije entre el 1 y el 7");
		}
	
	}

}
