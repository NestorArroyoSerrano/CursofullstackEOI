package modelo;

public class Aspirador extends Dispositivo implements IEncenderApagar {

	int bateria;
	boolean estado;
	
	
	
	public Aspirador(int bateria, boolean estado) {
		super();
		this.bateria = bateria;
		this.estado = estado;
	}
	
	public int getBateria() {
		return bateria;
	}
	
	public boolean getEncendido() {
		return estado;
		
	}

	@Override
	public void encender() {
		estado=true;
		
	}

	@Override
	public void apagar() {
		estado=false;
		
	}

	@Override
	public String toString() {
		return super.toString()+": " + bateria + (estado?"Encendido":" Apagado");
	}
	

}
