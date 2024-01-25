package com.nestor.ejerciciosPropuestosJDBC.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Empleado {

	private int num;
	private String nombre;
	private int edad;
	private int departamento;
	private int categoria;
	private LocalDate contrato;
	
	public Empleado() {
		
	}

	public Empleado(int num, String nombre, int edad, int departamento, int categoria, LocalDate contrato) {
		super();
		this.num = num;
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
		this.categoria = categoria;
		this.contrato = contrato;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public LocalDate getContrato() {
		return contrato;
	}

	public void setContrato(LocalDate contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Empleado [num=" + num + ", nombre=" + nombre + ", edad=" + edad + ", departamento=" + departamento
				+ ", categoria=" + categoria + ", contrato=" + contrato + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return num == other.num;
	}

}