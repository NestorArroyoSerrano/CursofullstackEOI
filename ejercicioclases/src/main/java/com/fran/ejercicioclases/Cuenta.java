package com.fran.ejercicioclases;

import java.time.LocalDate;
import java.util.List;

import com.fran.ejercicioclases.utilidades.FechasUtils;
import com.fran.ejercicioclases.utilidades.StringUtils;



public abstract class Cuenta implements Comparable<Cuenta> {

	private String dni;
	private String nombre;
	private LocalDate fecha;
	private String codigoPais;
	private double saldo;
	
	public Cuenta() {
		
	}

	public Cuenta(String dni, String nombre, LocalDate fecha, String codigoPais, double saldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fecha = fecha;
		this.codigoPais = codigoPais;
		this.saldo = saldo;
	}
	
	public Cuenta(Cuenta c) {
		this.dni = c.dni;
		this.nombre = c.nombre;
		this.fecha = c.fecha;
		this.codigoPais = c.codigoPais;
		this.saldo = c.saldo;
	}
	
	public Cuenta(String linea) {
		this.dni = StringUtils.obtenerParte(linea,";",0);
		this.nombre = StringUtils.obtenerParte(linea,";",1);
		this.fecha = FechasUtils.devolverFechaParseada(StringUtils.obtenerParte(linea,";",2));
		this.codigoPais = StringUtils.obtenerParte(linea,";",3);
		this.saldo = Double.parseDouble(StringUtils.obtenerParte(linea,";",4));
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
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
		return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", fecha=" + fecha + ", codigoPais=" + codigoPais
				+ ", saldo=" + saldo + "]";
	}

	@Override
	public int compareTo(Cuenta o) {
		if(this.getDni().compareTo(o.getDni())<0) {
			return -1;
		} else if(this.getDni().compareTo(o.getDni())>0) {
			return 1;
		} else {
			if(this.saldo<o.saldo) {
				return -1;
			} else if(this.saldo>o.saldo) {
				return 1;
			} else
				return 0;
		}
	}
	
	/**
	 * Imprime una lista de cuentas que le pasamos como parámetro
	 * @param <T> Tipo de Cuenta específica (CuentaSantander, CuentaSabadell...)
	 * @param lista Lista con las cuentas
	 */
	public static <T extends Cuenta> void imprimirLista(List<T> lista) {
		lista.forEach(l->System.out.println(l));
	}
	
	public static <T extends Cuenta> void imprimirLista(List<T> lista, Class<T> clase) {
		System.out.println("**** " + clase.getName() + " ****");
		lista.forEach(l->System.out.println(l));
	}
	
	public static <T extends Cuenta> void imprimirListaHijos(List<T> lista) { 
		for(T l : lista) {
			if(l instanceof CuentaCaixa) {
				System.out.println("Cuenta caixa: " + ((CuentaCaixa)l).getNivelCatalan());
			}
			if(l instanceof CuentaSabadell) {
				System.out.println("Cuenta sabadell: " + l);
			}
			if(l instanceof CuentaSantander) {
				System.out.println("Cuenta santander: " + l);
			}
		}
	}
	
	
}
