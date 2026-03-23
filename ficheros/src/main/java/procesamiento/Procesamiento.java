package procesamiento;

import java.io.BufferedReader;
import java.io.FileReader;

public class Procesamiento {

	
	public static void main(String[] args) {
		long total=0;
		int palab=0;
		int lineas=0;
		try(BufferedReader bfr=new BufferedReader(new FileReader("carta.txt"))){
			String linea;
			while((linea=bfr.readLine()) != null) {
				total+=linea.length() + 1;
				String[] palabras=linea.trim().split("\\s+");
				if(!linea.trim().isEmpty()) {
					palab+=palabras.length;
				}
				lineas++;
			}
			
			System.out.println("Numero de caracteres: " + total);
			System.out.println("Numero de lineas: " + lineas);
			System.out.println("Numero de palabras: " + palab);
			
			
		}catch (Exception e) {
			System.err.println(e.getMessage().toString());
		}finally {
			
		}

		
	}

}
