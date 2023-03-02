package com.nestor.ejercicioFFC.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {

	private String dniCif;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String codigoPais;
	private double saldo;
	static final String ruta = "C:\\Users\\Néstor\\Documents\\FullstackEOI\\CursofullstackEOI\\ejercicioFFC\\src\\main\\java\\ficheros";
	
	public Cliente () {
		
	}

	public Cliente(String dniCif, String nombre, LocalDate fechaNacimiento, String codigoPais, double saldo) {
		super();
		this.dniCif = dniCif;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoPais = codigoPais;
		this.saldo = saldo;
	}
	public Cliente(Cliente c) {
		super();
		this.dniCif = c.dniCif;
		this.nombre = c.nombre;
		this.fechaNacimiento = c.fechaNacimiento;
		this.codigoPais = c.codigoPais;
		this.saldo = c.saldo;
	}

	public String getDniCif() {
		return dniCif;
	}

	public void setDniCif(String dniCif) {
		this.dniCif = dniCif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [dniCif=" + dniCif + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", codigoPais=" + codigoPais + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniCif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dniCif, other.dniCif);
	}	
}
	




