package UsuRes;

import Ordenacion.Mostrable;

public class Usuario implements Validable, Mostrable{
	
		private String email;
		private String password;
		
		
		
		public Usuario(String email,String password) {
			this.email=email;
			this.password=password;
		}
		
		@Override
		public void validar() throws IllegalArgumentException {
			if(!this.email.contains("@")) {
				throw new IllegalArgumentException("El email debe contener @");
			}
			
			if(this.password.length()<8) {
				throw new IllegalArgumentException("La contraseña debe tener al menos 8 carácteres");
			}
		}
		@Override
		public String mostrar() {
			return "el email es " + this.email + " y la contraseña es " + this.password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		
}
