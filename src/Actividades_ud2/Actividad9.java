package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc = new Scanner(System.in);
		
		//defino la variable
		int num;
		
		//pido al usuario el numero y lo hago objeto de la variable
		System.out.println("Diga un número que esté entre el 0 y el 99.999: ");
		num = sc.nextInt();
		
		//creo la estructura condicional con sus respectivas respuestas
		if (num<0 || num>=100000) {
			System.out.println("Te dije un número entre el 0 y el 99.999");
		}else if (num<10) {
			System.out.println("Tu número tiene una cifra");
		}else if(num<100) {
			System.out.println("Tu número tiene dos cifras");
		}else if(num<1000) {
			System.out.println("Tu número tiene tres cifras");
		}else if(num<10000) {
			System.out.println("Tu número tiene cuatro cifras");
		}else {
			System.out.println("tu número tiene cinco cifras");
		}
	}

}
