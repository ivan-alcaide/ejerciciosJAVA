package es.iescamas.estructura;

public class Conjunto extends ConjuntoArray{
	
	public Conjunto() {
		super();
	}
	
	public int numeroElementos() {
		
		return super.size();
	}
	
	public boolean insertar(Integer n) {
		
		return super.add(n);
		
	}
	
	public void añadirElementosDe(Conjunto otro) {
		for(int i=0;i<otro.size();i++) {
			insertar(otro.getTabla()[i]);
		}
	}
	
	public boolean eliminarElemento(Integer n) {
		return super.removeValue(n);
		
	}
	
	public void eliminarTodos(Conjunto otro) {
		for(int i =0;i<otro.size();i++) {
			eliminarElemento(otro.getTabla()[i]);
		}
	}
	
	public boolean pertenece(Integer n) {
		return super.contains(n);
	}
	
	public String toString() {
		return super.toString();
		
	}
	
	public int minimo() {
		int min=super.getTabla()[0];
		for(int i=0;i<super.size();i++) {
			if(super.getTabla()[i]<min) {
				min=super.getTabla()[i];
			}
		}
		return min;
	}
	
	public int maximo() {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<super.size();i++) {
			if(super.get(i)>max) {
				max=super.getTabla()[i];
			}
		}
		return max;
	}
	
	public double media() {
		int sum=0;
		
		for(int i=0;i<super.size();i++) {
			sum+=super.getTabla()[i];
		}
		
		double result=sum/super.size();
		return result;
	}
	
	public static boolean incluido(Conjunto c1, Conjunto c2) {
		if (c1==null || c2 == null) {
			throw new NullPointerException("Ningun conjunto puede ser null");
		}
		
		int contador=0;
		for(int i =0;i<c1.size();i++) {
			if(c2.contains(c1.get(i))) {
				contador++;
			}
		}
		if (contador==c1.size()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Conjunto union(Conjunto c1,Conjunto c2) {
		if(c1==null || c2==null) {
			throw new NullPointerException("Ningun conjunto puede ser null");
		}
		
		
	}
	
}
