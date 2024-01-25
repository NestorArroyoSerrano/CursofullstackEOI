package com.nestor.ejerciciosPropuestosJDBC.entidades;

import java.util.Objects;

public class Categoria {

	private int categoria;
	private String titulo;
	private int salario;
	private int trienio;
	
	public Categoria() {
		
	}

	public Categoria(int categoria, String titulo, int salario, int trienio) {
		super();
		this.categoria = categoria;
		this.titulo = titulo;
		this.salario = salario;
		this.trienio = trienio;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getTrienio() {
		return trienio;
	}

	public void setTrienio(int trienio) {
		this.trienio = trienio;
	}

	@Override
	public String toString() {
		return "Categoria [categoria=" + categoria + ", titulo=" + titulo + ", salario=" + salario + ", trienio="
				+ trienio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return categoria == other.categoria;
	}

}