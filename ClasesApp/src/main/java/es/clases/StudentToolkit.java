package es.clases;

import java.util.function.BooleanSupplier;

public class StudentToolkit {
	
	private int contador=0;
	
	public int getContador() {
		
		return contador;
	}

	public void incrementar() {
		
		contador++;
		
	}

	public void decrementar() {
		contador--;
	}

	public void reset() {
		contador=0;
	}

	public Boolean esCero() {
		if(contador==0) {
			return true;
		}
		return false;
	}

	public Boolean esPositivo() {
		if(contador>0) {
			return true;
		}
		return false;
	}

	public void addSiPositivo(int i) {
		if(i>0) {
			contador+=i;
		}
	}

	public void incrementarNVeces(int i) {
		if(i>0) {
			contador+=i;
		}
	}

	public Integer sumaHasta(int n) {
		int num=0;
		if(n<=0) {
			return num;
		}else{
			for(int i=0;i<=n;i++) {
				num+=i;
			}
		}
		return num;
	}

	public Boolean esPar(int i) {
		if(i%2==0) {
			return true;
		}
		return false;
	}

	public Double media(int[] is) {
		
		if(is==null) {
			throw new IllegalArgumentException("La tabla está vacía");
		}
		if(is.length<1) {
			throw new IllegalArgumentException("La tabla está vacía");
		}
		
		int suma=0;
		int nums=0;
		
		for(int i=0;i<is.length;i++) {
			nums++;
			suma+=is[i];
		}
		double media=suma/nums;
		return media;
	}

	public int maximo(int[] is) {
		int max=0;
		
		if(is==null) {
			throw new IllegalArgumentException("La tabla está vacía");
		}
		if(is.length<1) {
			throw new IllegalArgumentException("La tabla está vacía");
		}
		
		for(int i=0;i<is.length;i++) {
			if(is[i]>max) {
				max=is[i];
			}
		}
		
		return max;
	}

	public int[] invertirArray(int[] original) {
		
		int[] inv=new int[original.length];
		
		int numI=original.length-1;
		
		for(int i=0;i<original.length;i++) {
			inv[i]=original[numI];
			numI--;
		}
		
		return inv;
	}

	public int[] sinRepetidos(int[] is) {
		int[] sin=new int[1];
		
		for(int i=0;i<is.length;i++) {
			int rep=is[i];
			for(int j=0;j<sin.length;j++) {
				if(rep==sin[j]) {
					
				}
			}
		}
		
		return null;
	}

	
	
}


