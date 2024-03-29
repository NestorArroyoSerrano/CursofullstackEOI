package modelo;

public class Puerta extends Dispositivo {

	boolean bloqueada;

	public Puerta(boolean bloqueada) {
		super();
		this.bloqueada = bloqueada;
	}
	
	public void bloquear() {
		bloqueada=true;
	}
	public void desbloquear() {
		bloqueada = false;
	}

	@Override
	public String toString() {
		return super.toString() + (bloqueada?" Puerta bloqueada " : " Puerta desbloqueada ");
	}

}