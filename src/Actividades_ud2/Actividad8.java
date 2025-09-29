package Actividades_ud2;
//importo el lector
import java.util.Scanner;
public class Actividad8 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc= new Scanner(System.in);

		double num1, num2, num3, x1, x2, raiz;
		

		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca el primer coeficiente de la ecuación: ");
		num1 = sc.nextDouble();
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca el segundo coeficiente de la ecuación: ");
		num2 = sc.nextDouble();
		
		//pido al usuario que diga un numero y que su respuesta sea objeto de una variable
		System.out.println("Introduzca el tercer coeficiente de la ecuación: ");
		num3 = sc.nextDouble();
		
		//hago la estructura condicional con sus respectivas respuestas
		raiz = (num2*num2) + (-4*num1*num3);
		if (num1 == 0 && num2==0) {
			System.out.println("No existen soluciones ya que no hay ecuación");
		}else if (num1 == 0 && num2 !=0) {
			x1 = (-num3)/num2;
			System.out.println("Eso no sería una ecuación de segundo grado, sería de primer grado, la solución de esa ecuación sería: " + x1);
		}else if (raiz < 0) {
			System.out.println("No existen soluciones reales");
		}else {
			x1 = (-num2 + Math.sqrt(raiz))/(2*num1);
			x2 = (-num2 - Math.sqrt(raiz))/(2*num1);
			
			System.out.println("Sus soluciones serían " + x1 + " y " + x2);
		}
	}

}
