package Actividades_ud2;
import java.util.Scanner;
public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia, mes, anno;
		
		System.out.println("A continuación le pido datos para una fecha, la fecha debe ser en años no bisiestos");
		System.out.println("Diga el día de una fecha en concreto");
		dia = sc.nextInt();
		
		System.out.println("Diga el mes de una fecha");
		mes = sc.nextInt();
		
		System.out.println("DIga el año de una fecha");
		anno = sc.nextInt();
		
		
		if ((dia>31 || mes>12 || dia<1 || mes<1) || (dia>28 && mes==2)) {
			System.out.println("La fecha no es posible");
			
		}else if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>30)) {
			System.out.println("La fecha no es posible");
		}else {
			System.out.println("La fecha es correcta, sería: " + dia + "/" + mes + "/" + anno);
		}
	}

}
