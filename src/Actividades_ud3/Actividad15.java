package Actividades_ud3;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int n;
		boolean primo;
		
		
		//pido al usiuario un numero y lo hagpo objeto de su respectiva variable
		System.out.println("DIga un numero: ");
		n=sc.nextInt();
		
		
		//creo un bucle en el que se cuenta hasta n diciendo si es primo o no cada numero
		for(int prim=2;prim<=n;prim++) {
			primo=true;
			for(int divi = 2;divi<=Math.sqrt(prim);divi++) {
				if(prim%divi==0) {
					primo=false;
				}
			}
			
			//imprimo los resultados
			if(primo==true) {
				System.out.println(prim + " es primo");
			}else {
				System.out.println(prim + " no es primo");
			}
		}
	}
	
}
