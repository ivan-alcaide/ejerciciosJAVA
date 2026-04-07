package comparacion;

import java.io.BufferedReader;
import java.io.FileReader;

public class Comparacion {
	
	public static void main(String[] args) {
		
		
		try(BufferedReader bfr1=new BufferedReader(new FileReader("texto1.txt"));
				BufferedReader bfr2=new BufferedReader(new FileReader("texto2.txt"))){
			
			String linea1, linea2;
			int contadorLin=0;
			int contadorCar=0;
			while((linea1=bfr1.readLine())!=null && (linea2=bfr2.readLine())!=null) {
				contadorLin++;
				contadorCar=0;
				for(int i=0;i<linea1.length();i++) {
					contadorCar++;
					char c1=linea1.charAt(i);
					char c2=linea2.charAt(i);
					
					if(c1!=c2) {
						System.out.println("Los textos no son iguales");
						System.out.println("La linea en la que se encuentra la primera diferencia es: " + contadorLin+"\nEl caracter donde esta la diferencia es el: "+contadorCar);
						System.exit(0);
					}
					
					
				}
				
			}
			
			
			
		}catch(Exception ex) {
			
		}
	}

}
