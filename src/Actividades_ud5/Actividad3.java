package Actividades_ud5;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cant;
		double positivos,negativos,ceros, sum_pos, sum_neg,med_neg,med_pos;
		double tab[];
		negativos=0;
		positivos=0;
		ceros=0;
		sum_pos=0;
		sum_neg=0;
		
		System.out.println("Diga cuantos numeros desea introducir:");
		cant=sc.nextInt();
		tab=new double [cant];
		for (int i=0;i<tab.length;i++) {
			System.out.println("Introduzca un numero");
			tab[i]=sc.nextDouble();
			if(tab[i]<0) {
				negativos++;
				sum_neg=sum_neg+tab[i];
			}else if(tab[i]>0) {
				positivos++;
				sum_pos=sum_pos+tab[i];
			}else {
				ceros++;
			}
		}
		
		med_pos=sum_pos/positivos;
		med_neg=sum_neg/negativos;
		
		System.out.println("La media de los numeros positivos es " + med_pos + ", la media de los numeros negativos es  " + med_neg + " y el numero de 0 es " + ceros);

	}

}
