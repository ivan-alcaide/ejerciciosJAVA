package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int uno,n;
		uno=0;
		System.out.println("Hasta que numero quieres contar: ");
		n=sc.nextInt();
		
		while(uno!=n) {
			uno++;
			System.out.println(uno);
		}

	}

}
