package actividad12;

abstract class  Contacto  implements Imprimible{
	
	private String nombre;
	private String telefono;
	
	
	
	public Contacto(String nombre,String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String imprimir() {
	    return "Nombre: " + getNombre() + ", Tel: " + getTelefono();
	}
	
	public abstract String getTipo();
	

}
