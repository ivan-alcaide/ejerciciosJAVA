package Actividades_ud4;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//pido al usuario un minimo y un maximo y los hago objetos de las variables de la funcion
		System.out.println("Diga un minimo y un maximo y te dire los numeroque hay entre ellos");
		intervalo(sc.nextInt(),sc.nextInt());

	}
	//creo la funcion en la que hay un bucle que se repite hasta que llegue al numero maximo
	public static void intervalo(int n1,int n2) {
		for(int contador=n1;contador<=n2;contador++) {
			System.out.println(contador);
		}
	}

}
