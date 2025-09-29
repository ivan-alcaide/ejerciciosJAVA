package ACTIVIDADES;
import java.util.Scanner;
public class Actividad6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga la nota del primer examen: ");
		int nota1 = sc.nextInt();
		System.out.println("Diga la nota del segundo examen: ");
		int nota2 = sc.nextInt();
		double nota_media = (nota1 + nota2)/2.0 ;
		System.out.println("Su nota media de los dos exámenes es: " + nota_media);
	}

}
