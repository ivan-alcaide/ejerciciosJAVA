package Actividades_ud5;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//definir variable de la capacidad de la tabla
		int n;
		//pedir al usuario el tamaño de la tabla
		System.out.println("Diga el tamaño deseado de la tabla");
		n=sc.nextInt();
		//definir la tabla
		int[] tabla=new int[n];
		//rellenar la tabla
		for(int i = 0;i<tabla.length;i++) {
			System.out.println("Introduzca un valor para la tabla");
			tabla[i]=sc.nextInt();
		}
		//imprimir el maximo llamando a la función
		System.out.println("El valor máximo de la tabla es "+maximo(tabla));
		
	}
	//crear funcion para devolver el máximo de la tabla
	public static int maximo(int[] t) {
		int max=Integer.MIN_VALUE;
		for(int j=0;j<t.length;j++) {
			if(t[j]>max) {
				max=t[j];
			}
		}
		return max;
	}

}
