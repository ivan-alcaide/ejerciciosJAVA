package Pagos;

public class Caja {

	
	public double cobrar (MetodoPago mp, double importe) {
		if(mp.pagar(importe)) {
			System.out.println("Pago de " +importe+ " realizado correctamente");
		}else {
			System.out.println("Pago rechazado");
		}
		return importe;
	}
}
