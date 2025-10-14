package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int contador, suspensos, condicionados, aprobados;
		double notas;
		
		//inicializo cuatro variables
		contador=0;
		suspensos=0;
		condicionados=0;
		aprobados=0;
		//creo el bucle que pedira notas de alumnos hasta que recoja 6
		System.out.println("A continuación le pediré la calificación de seis alumnos");
		do {
			System.out.println("Diga la nota");
			notas=sc.nextDouble();
			contador++;
			if (notas<5 && notas>=4) {
				condicionados++;
			}else if (notas<4) {
				suspensos++;
			}else {
				aprobados++;
			}
			
		}while(contador<6);
		
		//imprimo el resultado
		System.out.println("Hay " + suspensos + " suspenso(s), " + condicionados + " condicionado(s) y " + aprobados + " aprobado(s)");
		
	}

}
