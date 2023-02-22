package com.fran.ejercicioclases;

import java.time.LocalDate;

public class CuentaSantander extends Cuenta{
	
	private final String codigoBanco = "0030";
	private boolean esDeSantander;
	private static int numeroCuentasSantander;
	
	public CuentaSantander() {
		numeroCuentasSantander++;
	}
	
	public CuentaSantander(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo) {
		super(dni,nombre,fecha,codigoPais,saldo);
		numeroCuentasSantander++;
		esDeSantander=false;
	}
	
	public CuentaSantander(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo,boolean santander) {
		super(dni,nombre,fecha,codigoPais,saldo);
		numeroCuentasSantander++;
		esDeSantander=santander;
	}
	
	public CuentaSantander(String linea) {
		super(linea);
		numeroCuentasSantander++;
		esDeSantander=false;
	}

	public boolean isEsDeSantander() {
		return esDeSantander;
	}

	public void setEsDeSantander(boolean esDeSantander) {
		this.esDeSantander = esDeSantander;
	}

	public static int getNumeroCuentasSantander() {
		return numeroCuentasSantander;
	}

	public static void setNumeroCuentasSantander(int numeroCuentasSantander) {
		CuentaSantander.numeroCuentasSantander = numeroCuentasSantander;
	}

	public String getCodigoBanco() {
		return codigoBanco;
	}

	@Override
	public String toString() {
		return "CuentaSantander [codigoBanco=" + codigoBanco + ", esDeSantander=" + esDeSantander + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + ", getFecha()=" + getFecha() + ", getCodigoPais()="
				+ getCodigoPais() + ", getSaldo()=" + getSaldo() + "]";
	}

	
	
	

}
