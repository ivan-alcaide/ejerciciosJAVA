package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc = new Scanner(System.in);
		
		//defino las variables
		double num, fact, cont,num_posi;
		
		//inicianalizo alguna variable
		cont=0;
		fact=1;
		
		//pido al usuario que diga un numero y lo hago objeto de su respectiuva variable
		System.out.println("Diga un numero para ver su factorial:");
		num=sc.nextDouble();
		
		//creo el bucle que se repite hasta que no cumpla la condicion de abajo
		
		if (num<0) {
			num_posi=-num;
		}else {
			num_posi=num;
		}
		while(cont<num_posi) {
			cont++;
			System.out.print(cont + " x " + fact);
			fact=cont*fact;
			System.out.println(" = " + fact);
		}
		//imprimo el resultado final
		
		if (num<0) {
			System.out.println("El factorial de " + num + ", es decir " + num + "! es " + (-fact) + " porque es negativo");
		}else {
			System.out.println("El factorial de " + num + ", es decir " + num + "! es " + fact);
		}
		
	
		
	}

}
