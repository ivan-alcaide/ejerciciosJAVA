package Ordenacion;

public class Producto implements Valorable{

	private int codigo;
	private String nombre;
	private double precio;
	
	
	public Producto(int codigo,String nombre,double precio) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
	}
	
	
	@Override
	public double getPrecio() {
		
		return this.precio;
	}
	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	
	public static void ordenarPorPrecioAscYNombre(Valorable[] arr) {
		double max;
		for (int i = 0; i < arr.length - 1; i++) {
		  for (int j = 0; j < arr.length - 1 - i; j++) {
			 if(arr[j].getPrecio()>arr[j+1].getPrecio()) {
				 Valorable a=arr[j];
				 
				 
			 }
		  }
		}
	}
	
	
	
	
}
