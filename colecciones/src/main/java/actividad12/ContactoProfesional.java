package actividad12;


public class ContactoProfesional extends Contacto implements Imprimible{
	
	private String empresa;
	
	
	
	public ContactoProfesional(String nombre, String telefono, String empresa) {
		super(nombre, telefono);
		this.empresa=empresa;
	}
	
	
	
	public String getTipo() {
		return "Contacto Profesional";
	}


	@Override
	public String imprimir() {
		
		return "Nombre: " + getNombre() + "\nTelefono: " + getTelefono() + "\nEmpresa: " + this.empresa;
	}
	

}
