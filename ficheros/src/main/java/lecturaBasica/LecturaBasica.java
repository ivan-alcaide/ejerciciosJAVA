package lecturaBasica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaBasica {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String nombreF;
		System.out.println("Dime el nombre del fichero: ");
		nombreF=sc.nextLine();
		
		if (nombreF==null || nombreF.equalsIgnoreCase("")) {
			nombreF="prueba.txt";
		}
		
		System.out.println(nombreF);
		
		
		try(BufferedReader bf= new BufferedReader(new FileReader(nombreF))){
			
			String linea;
			while((linea = bf.readLine()) != null) {
				System.out.println(linea);
			}
			
		}catch(Exception ex){
			System.out.println(ex.getMessage().toString());
			System.err.println(ex.getMessage().toString());
		}finally {
			
		}
	}

}
