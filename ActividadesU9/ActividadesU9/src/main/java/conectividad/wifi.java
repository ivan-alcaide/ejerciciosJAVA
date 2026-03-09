package conectividad;

public class wifi implements Conectable {
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
			System.out.println("wifi conectado");
		}else {
			System.out.println("El wifi ya estaba conectado");
		}
		
	}

	@Override
	public void desconectar() {
		if(!estado.equals(estado.NoConectado)) {
			estado=estado.NoConectado;
			System.out.println("wifi desconectado");
		}else {
			System.out.println("el wifi ya estaba desconectado");
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
