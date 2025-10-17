package Actividades_ud4;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int may;
		System.out.println("Di dos numero y te dire cual es mayor");
		may = mayor(sc.nextInt(),sc.nextInt(),sc.nextInt());
		System.out.println("El mayor es " + may);

	}
	public static int mayor(int n1,int n2, int n3) {
		if(n1>n2 && n1>n3) {
			return n1;
			
		}else if(n2>n1 && n2>n3) {
			return n2;
		}else {
			return n3;
		}
		
	}
}
