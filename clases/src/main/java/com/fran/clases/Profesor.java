package com.fran.clases;

import java.time.LocalDate;
import java.util.List;

public class Profesor extends Persona implements IProfesor {
	
	private String centroTrabajo;
	private double salario;
	
	public Profesor() {
		
	}

	public Profesor(String centroTrabajo, double salario) {
		super();
		this.centroTrabajo = centroTrabajo;
		this.salario = salario;
	}
	
	public Profesor(String nombre, String dni, String centroTrabajo, double salario) {
		super(nombre,dni);
		this.centroTrabajo = centroTrabajo;
		this.salario = salario;
	}
	
	public Profesor (Profesor p) {
		this.centroTrabajo = p.centroTrabajo;
		this.salario = p.salario;
	}

	public String getCentroTrabajo() {
		return centroTrabajo;
	}

	public void setCentroTrabajo(String centroTrabajo) {
		this.centroTrabajo = centroTrabajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Profesor [centroTrabajo=" + centroTrabajo + ", salario=" + salario + ", getNombre()=" + getNombre()
				+ ", getDni()=" + getDni() + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((centroTrabajo == null) ? 0 : centroTrabajo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (centroTrabajo == null) {
			if (other.centroTrabajo != null)
				return false;
		} else if (!centroTrabajo.equals(other.centroTrabajo))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}

	public boolean ganaMas30000() {
		if(this.salario>30000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean pasarFaltas(List<String> alumnos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean ficharAsistencia(LocalDate dia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean metodo3() {
		// TODO Auto-generated method stub
		return false;
	}

}
