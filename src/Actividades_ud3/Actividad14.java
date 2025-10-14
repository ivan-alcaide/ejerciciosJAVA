package Actividades_ud3;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String aster;
		int n, contador;
		contador=1;
		aster="";
		System.out.println("diga un numero");
		n=sc.nextInt();
		while(contador<n) {
			System.out.println(aster);
			aster=aster + "*";
			n=n-1;
			aster="";
			for(contador=n;(contador<=n) && (contador!=-1);contador=contador-1) {
				aster=aster+"*";
			}
		}
	
		
	}

}
