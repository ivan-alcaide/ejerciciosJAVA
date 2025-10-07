package Actividades_ud3;
//importo el lector
import java.util.Scanner;
public class Actividad2 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int edad,alum,sum,mayor;
		double media;
		alum=0;
		sum=0;
		mayor=0;
		
		//creo el bucle 
		do {
			System.out.println("Diga la edad del alumno: ");
			edad=sc.nextInt();
			
			if(edad>0) {
			alum++;
			sum=sum+edad;
			if(edad>17) {
			mayor++;
			}}
			media=sum/alum;
			
			
		}while(edad>=0) ; //esta es la condicion en la que para el bucle
		
		//imprimo los resultados
		System.out.println("Los alumnos registrados son: " + alum);
		System.out.println("La suma de sus edades es: " + sum);
		System.out.println("La media de edad es: " + media);
		System.out.println("El número de mayores de edad es: " + mayor);
		
	}

}
