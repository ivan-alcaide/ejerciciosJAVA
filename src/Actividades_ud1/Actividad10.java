package Actividades_ud1;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean lluvia, tareas, salir, biblio;
		
		System.out.println("¿Está lloviendo? Responde con true o false");
		lluvia = sc.nextBoolean();
		System.out.println("¿Has hecho tus tareas? Responde true o false");
		tareas = sc.nextBoolean();
		System.out.println("¿Necesitas ir a la biblioteca? Responde true o false");
		biblio = sc.nextBoolean();
		
		salir = (!lluvia && tareas) || biblio;
		
		System.out.println("¿Puedes salir? " + salir);
		
	}

}
