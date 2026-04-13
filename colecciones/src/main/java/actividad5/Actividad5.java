package actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Actividad5 {

	public static void main(String[] args) {
		
		Map<String, Integer> frec=new HashMap<String, Integer>();
		
		try(BufferedReader bfr=new BufferedReader(new FileReader("ej5.txt"))){
			String linea;
			String[] palabras;
			while((linea=bfr.readLine())!=null) {
				
				palabras=linea.split(" ");
				
				for(int i=0;i<palabras.length;i++) {
					
					if(frec.containsKey(palabras[i])) {
						Integer a =frec.get(palabras[i]);
						frec.replace(palabras[i], a++);
						
					}else {
						frec.put(palabras[i],1);	
					}
					
				}
				
			
			}
			
			
			
		}catch(Exception ex) {
			System.out.println();
		}
		
		
		
		
	}
	
}
