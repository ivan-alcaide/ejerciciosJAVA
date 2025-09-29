package ACTIVIDADES;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga el año actual: ");
		int anno_actual = sc.nextInt();
		System.out.println("Diga su año de nacimiento" );
		int anno_nacimiento = sc.nextInt();
		int edad = anno_actual - anno_nacimiento;
		System.out.println("Su edad es: " + edad + " años.");
		

	}

}
