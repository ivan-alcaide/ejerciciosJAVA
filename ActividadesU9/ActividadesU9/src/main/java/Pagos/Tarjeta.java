package Pagos;

public class Tarjeta implements MetodoPago{
	private double saldo;
	private double limite;
	
	
	public Tarjeta(double saldo,double limite) {
		this.saldo=saldo;
		this.limite=limite;
	}


	@Override
	public boolean pagar(double importe) {
		if(importe>limite) {
			System.out.println("Pago rechazado, limite excedido");
			return false;
		}
		if(saldo<importe) {
			System.out.println("Pago rechazado, no hay suficiente saldo");
			return false;
		}
		saldo-=importe;
		System.out.println("Pago realizado");
		return true;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
