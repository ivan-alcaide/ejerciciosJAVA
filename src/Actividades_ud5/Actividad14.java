package Actividades_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//defniir variables y tablas
		int aciertos=0;
		int[] comb=new int[6];
		int[] gana=new int[6];
		//rellenar tabla ganadora
		for(int i = 0;i<gana.length;i++) {
			gana[i]=(int) (Math.random()*10);
		}
		//rellenar tabla del usuario
		System.out.println("A continuación diga su combinación para comprobar si ha ganado la primitiva");
		for(int i = 0;i<comb.length;i++) {
			int tempo;
			System.out.println("Introduzca el valor nº" + (i+1));
			tempo=sc.nextInt();
			comb[i]=tempo;
		}
		//comprobar cada valor de la tabla con el de la ganadora
		for(int i=0;i<comb.length;i++) {
			for(int j=0;j<gana.length;j++) {
				if(comb[i]==gana[j]) {
					aciertos++;
				}
			}
		}
		System.out.println("El numero de aciertos ha sido de "+aciertos+", la combinación ganadora ha sido:\n"+Arrays.toString(gana));
	}
	


}
