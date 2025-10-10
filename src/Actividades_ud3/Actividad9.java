package Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int asignacion, asignacion_mas;
		double altura, arbol, altura_mas;
		
		//inicianalizo 3 variables
		asignacion=-1;
		altura_mas=0;
		asignacion_mas=0;
		
		//creo el bucle que se repita hasta que no se cumpla la condicion
		do {
			System.out.println("Diga la altura de su arbol o escriba -1 para salir");
			altura=sc.nextDouble();
			asignacion++;
			if(altura>altura_mas) {
				altura_mas=altura;
				asignacion_mas=asignacion;
			}
			//aqui la condicion
		}while(altura!=-1);
		
		//imprimo el resultado
		System.out.println("El árbol con mas altura tiene " + altura_mas + " cm" + " y es el árbol "+ asignacion_mas);
		
		

		
		
		
	}

}
