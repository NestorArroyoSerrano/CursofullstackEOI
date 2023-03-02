package com.nestor.ejercicioFFC.utils;

public class BienvenidaUtils {

	public static String hello;
	
	public BienvenidaUtils(String lenguaje, String nombre) {
		construirLenguaje(lenguaje, nombre);
	}
	private void construirLenguaje(String lenguaje, String nombre) {
		if(lenguaje.equals("ES")) {
			this.hello = "Hola " + nombre + ". Bienvenido";			
		} else {
			this.hello = "Hello " + nombre + ". Welcome";	
		
		}			

	}
}
