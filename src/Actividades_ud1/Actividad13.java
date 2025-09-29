package ACTIVIDADES;
import java.util.Scanner;
public class Actividad13 {

	public static void main(String[] args) {
		//creamos el lector
		Scanner sc = new Scanner(System.in);
		
		//definimos las variables
		int not1, not2, not3, med1;
		double med2;
		
		//pedimos al usuario la nota del primer trimestre y hacemos que su respuesta sea el objeto de una de las variables
		System.out.println("Introduzca la nota del primer trimestre: ");
		not1 = sc.nextInt();
		
		//pedimos al usuario la nota del primer trimestre y hacemos que su respuesta sea el objeto de una de las variables
		System.out.println("Introduzca la nota del segundo trimestre: ");
		not2 = sc.nextInt();
		
		//pedimos al usuario la nota del primer trimestre y hacemos que su respuesta sea el objeto de una de las variables
		System.out.println("Introduzca la nota del tercer trimestre: ");
		not3 = sc.nextInt();
		
		//aqui calculamos las 2 medias y las ponemos como objeto de sus respectivas variables
		med1 = (not1 + not2 + not3) / 3;
		med2 = (not1 + not2 + not3) / 3.0;
		
		//aqui hacemos que el programa imprima las 2 variables de las 2 medias
		System.out.println("La nota media entera es " + med1 + " y la nota media junto son sus decimales es " + med2);

	}

}
