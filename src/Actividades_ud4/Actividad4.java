package Actividades_ud4;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int may;
		System.out.println("Di dos numero y te dire cual es mayor");
		may = mayor(sc.nextInt(),sc.nextInt());
		System.out.println("El mayor es " + may);

	}
	public static int mayor(int n1,int n2) {
		if(n1>n2) {
			return n1;
			
		}else {
			return n2;
		}
		
	}
}
