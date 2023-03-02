package com.nestor.proyectoclases.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class CuentaSantander extends Cuenta {
	
	private boolean residente;
	private static int contador;
	
	public CuentaSantander() {
		super();
		residente = false;
		contador++;
	}

	public CuentaSantander(String cif, String nombre, LocalDate fechaNac, String pais, double saldo,
			boolean residente) {
		super(cif, nombre, fechaNac, pais, saldo);
		this.residente = residente;
		contador++;
	}
	
	public CuentaSantander(CuentaSantander c) {
		super(c);
		this.residente = c.residente;
		contador++;
	}

	public boolean isResidente() {
		return residente;
	}

	public void setResidente(boolean residente) {
		this.residente = residente;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		CuentaSantander.contador = Math.abs(contador);
	}

	@Override
	public String toString() {
		return "CuentaSantander [residente=" + residente + ", getCif()=" + getCif() + ", getNombre()=" + getNombre()
				+ ", getFechaNac()=" + getFechaNac() + ", getPais()=" + getPais() + ", getSaldo()=" + getSaldo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(residente);
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
		CuentaSantander other = (CuentaSantander) obj;
		return residente == other.residente;
	}
	
	

}