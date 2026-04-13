package actividad3y4y5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Actividad_4_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca la cantidad de numeros que desea introducir en la tabla de doubles");
		int len=sc.nextInt();
		
		double[] tabla=new double[len];
		
		for(int i=0;i<tabla.length;i++) {
			System.out.println("Introduzca un numero a la tabla, este indice es el " + i);
			tabla[i]=sc.nextDouble();
			
		}
		
		try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("tablaDoub.bin"))){
			
			for(int i=0;i<tabla.length;i++) {
				esc.writeDouble(tabla[i]);		
			}
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}
		
		try(DataInputStream lee=new DataInputStream(new FileInputStream("tablaDoub.bin"))){
			
			for(int i=0;i<tabla.length;i++) {
				System.out.println(lee.readDouble());
			}
			
			
		}catch(Exception err) {
			System.err.println(err.getMessage().toString());
		}

	}

}
