package actividad12;

public class ContactoPersonal extends Contacto implements Imprimible{

	private String apodo;
	
	
	
	public ContactoPersonal(String nombre,String telefono, String apodo) {
		super(nombre,telefono);
		this.apodo=apodo;
	}
	
	
	public String getTipo() {
		return "Contacto Personal";
	}


	@Override
	public String imprimir() {
		
		return "Nombre: " + getNombre() + "\nTelefono: " + getTelefono() + "\nApodo: " + this.apodo;
	}


	
}
