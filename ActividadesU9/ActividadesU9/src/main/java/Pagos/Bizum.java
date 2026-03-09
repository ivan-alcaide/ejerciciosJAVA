package Pagos;

public class Bizum implements MetodoPago{
	private double saldo;
	private int telefono;
	
	public Bizum(double saldo,int telefono) {
		if (telefono>=1000000000 || telefono<=99999999) {
			throw new IllegalArgumentException("Numero introducido no válido");
		}
		
		this.saldo=saldo;
		this.telefono=telefono;
	}

	@Override
	public boolean pagar(double importe) {
		if(importe>saldo) {
			System.out.println("Envío rechazado, no hay saldo suficiente");
			return false;
		}
		saldo-=importe;
		System.out.println("Envío realizado");
		return true;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
