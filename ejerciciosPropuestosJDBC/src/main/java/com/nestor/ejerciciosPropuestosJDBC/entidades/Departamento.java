package com.nestor.ejerciciosPropuestosJDBC.entidades;

import java.util.Objects;

public class Departamento {

	private int deptno;
	private String nombre;
	
	public Departamento() {
		
	}

	public Departamento(int deptno, String nombre) {
		super();
		this.deptno = deptno;
		this.nombre = nombre;
	}

	public Departamento(Departamento d) {
		super();
		this.deptno = d.deptno;
		this.nombre = d.nombre;
	}


	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Departamento [deptno=" + deptno + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return deptno == other.deptno;
	}
	
}
