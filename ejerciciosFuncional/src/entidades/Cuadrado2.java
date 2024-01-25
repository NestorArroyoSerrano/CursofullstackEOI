package entidades;

 public class Cuadrado2 implements IFigura {

	 private double lado;
	 
	 
	 public Cuadrado2(double lado) {
	        this.lado = lado;
	    }
	 
	 
	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public double getPerimetro() {
		
		return 4*lado;
	}

	@Override
	public double getArea() {
		
		return lado * lado;
	}


	@Override
	public String toString() {
		return "Cuadrado2 [lado=" + lado + "]";
	}

}
