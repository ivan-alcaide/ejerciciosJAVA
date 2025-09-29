package ACTIVIDADES;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		//creamos el lector
		Scanner sc = new Scanner(System.in);
		
		//creamos variables
		double num_us, num_abs;
		
		//aqui pedimos el numero al usuario
		System.out.println("Introducza un número: ");
		num_us = sc.nextDouble();
		
		
		//aqui hacemos que el numero dado por el usuario se haga valor absoluto en otra variable
		num_abs = Math.abs(num_us);
		
		//aqui hacemos que el programa imprima las variables
		System.out.println("El valor absoluto de " + num_us + " es " + num_abs);
		
		
		}

}
