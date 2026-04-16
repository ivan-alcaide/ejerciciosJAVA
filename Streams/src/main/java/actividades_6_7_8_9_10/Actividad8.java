package actividades_6_7_8_9_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		List<Integer> numeros=new ArrayList<>(List.of(4,5,6,7,8,9,10,11,12,13,14));
		
		System.out.println("Introduzca un numero");
		int num=sc.nextInt();
		
		long cont=numeros.stream().filter(n->n >num).count();
		
		System.out.println("Hay " + cont + " numeros mayores que " + num);
		


	}

}
