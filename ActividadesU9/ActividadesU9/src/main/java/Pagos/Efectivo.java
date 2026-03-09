package Pagos;

public class Efectivo implements MetodoPago {
	private double dinero;
	
	
	public Efectivo(double dinero) {
		this.dinero=dinero;
	}

	@Override
	public boolean pagar(double importe) {
		
		if (importe>dinero) {
			System.out.println("No hay dinero suficiente");
			return false;
		}
		dinero-=importe;
		System.out.println("Pago realizado");
		return true;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
}
