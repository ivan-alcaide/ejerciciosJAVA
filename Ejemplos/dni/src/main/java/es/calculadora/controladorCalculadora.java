package es.calculadora;

public class controladorCalculadora {
	
	private int num1;
	private int num2;
	
	public int sumar() {
		int num=num1+num2;
		return num;
	}
	
	public int restar() {
		int num=num1-num2;
		return num;
	}
	
	public int multiplicar() {
		int num=num1*num2;
		return num;
	}
	
	public double dividir() {
		double num;
		try {
			num=num1/num2;
		}catch(Exception ex){
			throw new IllegalArgumentException("Imposible dividir entre 0");
		}
		return num;
	}
	
	public void calculadora(int numI,int numII) {
		num1=numI;
		num2=numII;
	}

}
