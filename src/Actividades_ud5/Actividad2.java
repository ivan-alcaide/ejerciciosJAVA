package Actividades_ud5;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cant;
		int tab[];
		System.out.println("Di la cantidad de numeros que desea introducir:");
		cant=sc.nextInt();
		tab=new int [cant];
		for (int j = 0;j<tab.length;j++) {
			System.out.println("Introduzca un numero a la tabla");
			tab[j]=sc.nextInt();
		}
		for(int i = tab.length-1;i!=-1;i--) {
			System.out.println(tab[i]);
		}

	}

}
