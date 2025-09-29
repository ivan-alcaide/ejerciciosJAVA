package Actividades_ud1;
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad ;
		boolean mayor;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga su edad: ");
		edad = sc.nextInt();
		mayor = edad >= 18;
		System.out.println(mayor);
		
	}

}
