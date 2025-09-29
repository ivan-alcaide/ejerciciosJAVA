package Actividades_ud2;
//importamos el lector
import java.util.Scanner;
public class Actividad1 {

	public static void main(String[] args) {
		//creamos el lector
		Scanner sc = new Scanner(System.in);
		
		//definimos la variable
		int num;
		
		//pedimos al usuario que diga el número y lo hacemos objeto de la variable
		System.out.println("Diga un número: ");
		num= sc.nextInt();
		
		//creamos la estructura condicional con sus respectivas respuestas con su resultado
		if (num%2==0) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}

	}

}
