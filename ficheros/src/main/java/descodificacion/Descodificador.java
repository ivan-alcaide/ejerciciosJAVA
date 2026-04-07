package descodificacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Descodificador {

	public static void main(String[] args) {
		
		char[] abc=new char[0];
		char[] cod=new char[0];
		
		try(BufferedReader bfrCod=new BufferedReader(new FileReader("codec.txt"))) {
			
			String linea;
			int contador=0;
			while((linea=bfrCod.readLine())!=null) {
				contador++;
				
				if(contador==1) {
					for(int i=0;i<linea.length();i++) {
						if(linea.charAt(i)==' ') {
							
						}else {
							abc=Arrays.copyOf(abc, abc.length+1);
							abc[abc.length-1]=linea.charAt(i);
						}
					}
				}else {
					for(int i=0;i<linea.length();i++) {
						if(linea.charAt(i)==' ') {
							
						}else {
							cod=Arrays.copyOf(cod, cod.length+1);
							cod[cod.length-1]=linea.charAt(i);
						}
					}
				}

			}
			
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}
		
		
		try(BufferedReader bfrMen=new BufferedReader(new FileReader("codi.txt"));
				BufferedWriter bfwCod=new BufferedWriter(new FileWriter("sinCodiProgram.txt",false))){
			String linea2;
			
			while((linea2=bfrMen.readLine())!=null) {
				
				linea2=linea2.toLowerCase();
				
				for (int i = 0; i < linea2.length(); i++) {
					
				    char c = linea2.charAt(i);
				    
				    if (c == ' ') {
				    	
				        bfwCod.append(' ');
				        
				    } else {
				    	
				        for (int j = 0; j < cod.length; j++) {
				        	
				            if (c == cod[j]) {
				            	
				                bfwCod.append(abc[j]);
				                break;
				            }
				        }
				        
				    }
				}
				bfwCod.newLine();
			}
			
			System.out.println("Mensaje codificado");
			
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}
		

	}

}
