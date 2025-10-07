package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		double secret;
		int num,usu;
		//transformo el num secreto a entero
		secret=Math.random()*100;		
		num=(int) secret;
		
		// creo el bucle
		do {
			System.out.println("Adivina el numero");
			usu=sc.nextInt();
			if(usu!=-1 && num!=usu ) {
			if(usu>num) {
				System.out.println("El número es menor");
			}
			if(usu<num) {
				System.out.println("El número es mayor");
			}
			}
		}while(usu!=-1 && usu!=num); //pongo las condiciones para que el bucle se repita
		
		//imprimop los resultados
		if(usu==num) {
			System.out.println("Enhorabuena has acertado");
		}else {
			System.out.println("Nunca te rindas");
		}
		
	}

}
