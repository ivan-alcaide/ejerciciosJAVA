package ACTIVIDADES;
//aqui importamos el lector
import java.util.Scanner;
public class Actividad14 {

	public static void main(String[] args) {
		//aqui creamos el lector
		Scanner sc = new Scanner(System.in);
		
		//aqui c¡definimos las variables
		double num_us, num_red;
		
		//aqui pedimos al usuario que proporcione un numero y hacemos que su respuesta sea el objeto de una de las variables
		System.out.println("Introduzca un número decimal: ");
		num_us = sc.nextDouble();
		
		//aqui hacemos objeto de una variable el numero redondeado de la anterior variable
		num_red = Math.round(num_us);
		
		//aqui hacemos que el programa imprima el resultado
		System.out.println("El número que ha proporcionado redondeado es " + num_red);
		

	}

}