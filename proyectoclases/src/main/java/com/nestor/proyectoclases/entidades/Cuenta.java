package com.nestor.proyectoclases.entidades;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Cuenta {

	
	private String cif;
	private String nombre;
	private LocalDate fechaNac;
	private String pais;
	private double saldo;
	
	public Cuenta() {
		
	}

	public Cuenta(String cif, String nombre, LocalDate fechaNac, String pais, double saldo) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.pais = pais;
		this.saldo = saldo;
	}
	public Cuenta(Cuenta c) {
		super();
		this.cif = c.cif;
		this.nombre = c.nombre;
		this.fechaNac = c.fechaNac;
		this.pais = c.pais;
		this.saldo = c.saldo;
}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [cif=" + cif + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", pais=" + pais + ", saldo="
				+ saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cif, fechaNac, nombre, pais, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(cif, other.cif) && Objects.equals(fechaNac, other.fechaNac)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
}
