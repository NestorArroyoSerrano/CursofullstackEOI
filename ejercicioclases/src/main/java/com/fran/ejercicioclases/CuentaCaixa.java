package com.fran.ejercicioclases;

import java.time.LocalDate;

enum NivelCatalan { ALTO, MEDIO, BAJO}

public final class CuentaCaixa extends Cuenta {
	
	private final String codigoBanco = "2100";
	private NivelCatalan nivelCatalan;
	
	public CuentaCaixa() {
		
	}

	public CuentaCaixa(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo,NivelCatalan nivelCatalan) {
		super(dni,nombre,fecha,codigoPais,saldo);
		this.nivelCatalan = nivelCatalan;
	}
	
	public CuentaCaixa(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo) {
		super(dni,nombre,fecha,codigoPais,saldo);
		this.nivelCatalan = NivelCatalan.MEDIO;
	}
	
	public CuentaCaixa(String linea) {
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
		return "CuentaCaixa [codigoBanco=" + codigoBanco + ", nivelCatalan=" + nivelCatalan + "]";
	}
	
	

}
