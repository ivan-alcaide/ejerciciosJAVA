package Actividades_ud4;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Diga dos números y te diré si son amigos");
		boolean a = num_amigos(sc.nextInt(),sc.nextInt());
		System.out.println("¿Son amigos? " + a );

	}
	
	
	public static boolean num_amigos(int num1,int num2) {
		
		int sum1, sum2;
		sum1=0;
		sum2=0;
		for (int contador = 1;contador<num1;contador++) {
			if(num1%contador==0) {
				sum1=sum1+contador;
			}
		}
		for (int contador2 = 1;contador2<num2;contador2++) {
			if(num2%contador2==0) {
				sum2=sum2+contador2;
				
			}
		}
		
		if(sum1!=num2 || sum2!=num1) {
			return false;
		}else {
			return true;
		}
	}
}
