package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc = new Scanner(System.in);
		
		//defino las variables
		double max, min, num;
		
		//pido al usuario el minimo y el maximo del rango y los hago objeto de sus respectivas variables
		System.out.println("Diga el minimo del rango deseado");
		min=sc.nextDouble();
		
		System.out.println("Diga el máximo del rango deseado");
		max=sc.nextDouble();
		
		//creo una condicion en la que si el maximo es menor que el minimo se acabe el programa
		if (min>max) {
			System.out.println("Que sea coherente porfa");
		}else {
			//creo el bucle para que se repita hasta que no se cumpla la condicion
			do {
				System.out.println("Diga un numero que este comprendido en el rango que has generado");
				num=sc.nextDouble();
				if(num<min || num>max) {
					System.out.println("Mal, cumpla lo que le pido");
				}else {
					System.out.println("Muy bien");
				}
			}while(num>max || num<min);  //aqui la condicion
		}

	}

}
