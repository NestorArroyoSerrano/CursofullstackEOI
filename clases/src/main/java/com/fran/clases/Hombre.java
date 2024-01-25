package com.fran.clases;

public final class Hombre extends Humano {
	
	private boolean barba;
	private String dni;
	
	public Hombre() {
		Contadores.numeroHombres++;
	}

	public Hombre(boolean barba, String dni) {
		super();
		this.barba = barba;
		this.dni = dni;
		Contadores.numeroHombres++;
	}
	
	public Hombre(String nombre) {
		super(nombre);
		Contadores.numeroHombres++;
	}

	public boolean isBarba() {
		return barba;
	}

	public void setBarba(boolean barba) {
		this.barba = barba;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	

}
