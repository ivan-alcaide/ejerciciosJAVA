package actividad_7_8_9;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Actividad9 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] tabla=new int[10];
		
        for (int i = 0;i<tabla.length;i++) {
            tabla[i] = random.nextInt(100);
        }
        
        Arrays.sort(tabla);
      
        
        try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("enteros100.dat"))){
        	
        	 for (int i = 0;i<tabla.length;i++) {
                 esc.writeInt(tabla[i]);
             }
        	
        	
        }catch(EOFException e) {
        	e.printStackTrace();
        	
        } catch (FileNotFoundException e1) {
			e1.printStackTrace();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
