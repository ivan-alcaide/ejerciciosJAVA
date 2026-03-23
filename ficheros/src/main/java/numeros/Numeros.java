package numeros;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numeros {

	public static void main(String[] args) {
		
		int menor=Integer.MAX_VALUE;
		int mayor=Integer.MIN_VALUE;
		try(BufferedReader bfr=new BufferedReader(new FileReader("numeros.txt"))){
			
			String linea;
			while((linea=bfr.readLine()) != null) {
				int numero=Integer.parseInt(linea);
				if(numero>mayor) {
					mayor=numero;
				}else if(numero<menor) {
					menor=numero;
				}
			}
			System.out.println("El numero menor es: " + menor);
			System.out.println("El numero mayor es: " + mayor);
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}finally {
			
		}

	}

}
