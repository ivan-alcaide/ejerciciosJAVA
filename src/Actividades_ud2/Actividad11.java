package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad11 {

	public static void main(String[] args) {
		
		//creo el lector
		Scanner sc = new Scanner(System.in);
		
		//defino la variable
		double nota;
		
		//pido la nota al usuario y la hago objeto de la variable
		System.out.println("Diga su nota (0-10): ");
		nota = sc.nextDouble();
		
		//hago la estructura condicional con sus respectivas respuestas
		if (nota < 0 || nota > 10) {
			System.out.println("Pedí una nota del 0 al 10");	
		}else if (nota<5) {
			System.out.println("Insuficiente");
		}else if (nota<6) {
			System.out.println("Suficiente");
		}else if (nota<7) {
			System.out.println("Bien");
		}else if (nota<9) {
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}

	}

}
