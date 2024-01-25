package com.fran.clases;

public abstract class Humano {
	
	private String nombre;
	
	public Humano() {
		
	}

	public Humano(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String nombreInverso() {  // Fran -> narF
		/*StringBuilder sb = new StringBuilder(this.nombre);
		return sb.reverse().toString();*/
		return "Fran";
	}

}
