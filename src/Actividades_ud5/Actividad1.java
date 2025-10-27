package Actividades_ud5;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Di 5 numeros");
		double decimales[]= {sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()};
		for(int i =0;i<decimales.length;i++) {
			System.out.println(decimales[i]);
		}

	}

}
