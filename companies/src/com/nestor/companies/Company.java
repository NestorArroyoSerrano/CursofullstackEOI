package com.nestor.companies;

import java.util.Objects;

public class Company {

	String nombre;
	double dinero;
	
	
	public Company() {
		
	}
	public Company(String nombre, double dinero) {
		super();
		this.nombre = nombre;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	@Override
	public String toString() {
		return "Company [nombre=" + nombre + ", dinero=" + dinero + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dinero, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Double.doubleToLongBits(dinero) == Double.doubleToLongBits(other.dinero)
				&& Objects.equals(nombre, other.nombre);
	}
	
}
