package actividad5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Actividad5 {

	public static void main(String[] args) {
		
		Map<String, Integer> frec=new HashMap<String, Integer>();
		
		try(BufferedReader bfr=new BufferedReader(new FileReader("ej5.txt"))){
			String linea;
			String[] palabras;
			while((linea=bfr.readLine())!=null) {
				
				linea=linea.toLowerCase();
				linea=linea.replace(".", "");
				linea=linea.replace(",", "");
				linea=linea.replace(";", "");
				linea=linea.replace(":", "");
				
				palabras=linea.split(" ");
				
				
				for(int i=0;i<palabras.length;i++) {
					
					if(frec.containsKey(palabras[i])) {
						Integer a =frec.get(palabras[i]);
						a++;
						frec.replace(palabras[i], a );
						
					}else {
						frec.put(palabras[i],1);	
					}
					
					
				}
				
				
				
			
			}
			
		
	
			List<Map.Entry<String, Integer>> orden= new ArrayList<>(frec.entrySet());
			
			orden.sort((a,b) -> b.getValue() - a.getValue());

			int contador=1;
			
			for(Entry<String, Integer> aa : orden) {

				
				System.out.println("Palabras repetidas, Top " + contador + " : " + aa);
				contador++;
				
				
			}
			
			
		}catch(Exception ex) {
			System.out.println();
		}
		
		
		
		
	}
	
}
