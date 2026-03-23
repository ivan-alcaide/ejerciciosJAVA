package nombreEdad;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class NombreEdad {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escriba el nombre y acontinuacion la edad");
		String nombre=sc.nextLine();
		int edad=sc.nextInt();
		
		try(BufferedWriter bf=new BufferedWriter(new FileWriter("datos.txt"))){
			bf.write(nombre + " - " + edad);
		}catch(Exception ex) {
			System.out.println(ex.getMessage().toString());
		}finally {
			
		}

		
	}

}
