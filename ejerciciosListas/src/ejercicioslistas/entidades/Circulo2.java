package ejercicioslistas.entidades;

public class Circulo2 implements IFigura {

	private double radio;
	
	public Circulo2(double radio) {
		super();
		this.radio = radio;
	}
	

	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double getPerimetro() {
		return 2*Math.PI * radio;
	}

	@Override
	public double getArea() {
		return Math.PI * radio * radio;
	}

}
