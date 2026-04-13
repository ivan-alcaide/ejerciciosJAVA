package actividad1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad1 {
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Integer> numeros=new ArrayList<>();
		
		Integer num_aux;
		
		for(int i=0;i<10;i++) {
			System.out.println("Introduzca numeros hasta introducir 10");
			num_aux=sc.nextInt();
			numeros.add(num_aux);
		}
		
		Integer suma=0;
		for(Integer num : numeros) {
			System.out.println(num);
			suma+=num;
		}
		
		System.out.println("La suma de todos los numeros es: " + suma);
		
		double media=suma/numeros.size();
		
		System.out.println("La media de todos los numeros es: "+ media);
		
		
		
		
		
	}
	
	
}
