package modelo;

public class Luz extends Dispositivo implements IEncenderApagar {

	
	boolean estado;
	
	public Luz (boolean estado) {
		this.estado=estado;
	}
	public boolean getEncendida() {
		return estado;
	}
	@Override
	public void encender() {
		this.estado=true;		
	}

	@Override
	public void apagar() {
		this.estado=false;
	}
	@Override
	public String toString() {
		return super.toString()+ " : " +(estado? "Encendida" : "Apagada");
	}
	

}
