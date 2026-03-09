package conectividad;

public class Cable implements Conectable{
	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public void conectar() {
		if (!estado.equals(estado.Conectado)) {
			estado=estado.Conectado;
			System.out.println("cable conectado");
		}else {
			System.out.println("El cable ya estaba conectado");
		}
		
	}

	@Override
	public void desconectar() {
		if(!estado.equals(estado.NoConectado)) {
			estado=estado.NoConectado;
			System.out.println("cable desconectado");
		}else {
			System.out.println("el cable ya estaba desconectado");
		}
		
		
	}

	@Override
	public boolean estaConectado() {
		if (estado.equals(estado.Conectado)) {
			return true;
		}
		return false;
	}
	
	
}
