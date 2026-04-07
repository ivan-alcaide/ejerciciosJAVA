package matrices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class MatrizTranspuesta {

	public static void main(String[] args) {
		
		
		try(BufferedReader bfr=new BufferedReader(new FileReader("matriz.txt"))){
			
			String linea;
			int contador=0;
			String[][] mat=new String[0][0];
			
			while((linea=bfr.readLine())!=null) {
				
				
				mat=Arrays.copyOf(mat, mat.length+1);
				mat[contador] = linea.split(" ");
				
			contador++;
				
			}
			


			
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[i].length;j++) {
					System.out.print(mat[j][i]);
					System.out.print(" ");
				}
				System.out.println();
			}
			
			
			
			
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}
		

	}

}
