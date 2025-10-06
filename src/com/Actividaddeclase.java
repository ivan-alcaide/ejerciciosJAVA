package 
com;

import java.util.Scanner;

public class Actividaddeclase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num, multiplos;
		
		System.out.println("Dime un numero: ");
		num=sc.nextInt();
		
		System.out.println("La tabla del " + num + " es: ");
		
		
		for(int i=0;i<=10;i++) {
			multiplos=i*num;
			System.out.println(multiplos);
		}
		
			
		

	}

}
