package com.fran.ejercicioclases;

import java.time.LocalDate;

public final class CuentaSabadell extends Cuenta {

	private final String codigoBanco = "0081";
	private NivelCatalan nivelCatalan;
	
	public CuentaSabadell(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo,NivelCatalan nivelCatalan) {
		super(dni,nombre,fecha,codigoPais,saldo);
		this.nivelCatalan = nivelCatalan;
	}
	
	public CuentaSabadell(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo) {
		super(dni,nombre,fecha,codigoPais,saldo);
		this.nivelCatalan = NivelCatalan.MEDIO;
	}
	
	public CuentaSabadell(String linea) {
		super(linea);
		this.nivelCatalan = NivelCatalan.MEDIO;
	}

	public NivelCatalan getNivelCatalan() {
		return nivelCatalan;
	}

	public void setNivelCatalan(NivelCatalan nivelCatalan) {
		this.nivelCatalan = nivelCatalan;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	@Override
	public String toString() {
		return "CuentaSabadell [codigoBanco=" + codigoBanco + ", nivelCatalan=" + nivelCatalan + "]";
	}
	
}
