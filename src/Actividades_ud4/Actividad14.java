package Actividades_ud4;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//defino la variable
		int n;
		System.out.println("Di una posición de la serie de Fibonacci");
		n=sc.nextInt();
		System.out.println("Es " + F(n));

	}
	//funcion en la que se encuentra el numero de la serie de Fibonacci segun la posicion indicada
	public static int F(int n) {
		if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else{
			return F(n-1)+F(n-2);
		}
	}

}
