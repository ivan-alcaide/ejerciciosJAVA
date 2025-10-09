package Actividades_ud3;

public class Actividad7 {

	public static void main(String[] args) {
		
		//defino variables y las inicianalizos
		int veces, coef, prod;
		veces=0;
		prod=1;
		coef=0;
		
		//creo un bucle que se repite hasta que no se cumpla la conidcion
		do {
		coef++;
		if (coef%2==1) {
			veces++;
			System.out.print(prod + " x " + coef);
			prod=prod*coef;
			System.out.println(" = " + prod);
		}
		}while (veces<10);//aqui la condicion
		
		//imprimo el resultado
		System.out.println("El producto de los diez primeros numeros impares es: "+ prod);
	
	
	}

}
