package com.nestor.colecciones.entidades;

import java.util.Objects;

public class Persona2 {

	String nombre;
	int edad;
	public Persona2(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return nombre + " " + "y su edad es " + edad ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona2 other = (Persona2) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
}
