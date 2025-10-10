package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int contador, suspensos;
		double notas;
		
		//inicianalizo dos variables
		contador=0;
		suspensos=0;
		
		//creo el bucle que pedira notas de alumnos hasta que recoja 5
		System.out.println("A continuación le pediré la calificación de cinco alumnos");
		do {
			System.out.println("Diga la nota");
			notas=sc.nextDouble();
			contador++;
			if (notas<5) {
				suspensos++;
			}
			
		}while(contador<5);
		
		//imprimo el resultado
		System.out.println("Hay " + suspensos + " suspensos");
		
	}

}
