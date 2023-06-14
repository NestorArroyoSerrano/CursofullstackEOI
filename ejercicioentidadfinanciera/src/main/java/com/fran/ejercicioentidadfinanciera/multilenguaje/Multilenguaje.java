package com.fran.ejercicioentidadfinanciera.multilenguaje;

public class Multilenguaje {
	
	public static String hello;
	public static String bye;
	public static String correct_opcion;
	public static String no_product;
	
	public Multilenguaje(String lenguaje) {
		construirLenguaje(lenguaje);
	}
	
	private void construirLenguaje(String lenguaje) {
		if(lenguaje.equals("ES")) {
			this.hello = "Hola";
			this.bye = "Adiós";
			this.correct_opcion = "Introduzca la opción correcta:";
			this.no_product = "No tenemos ningún producto para usted";
		} else if(lenguaje.equals("CA")) {
			this.hello = "Hola";
			this.bye = "Adeu";
			this.correct_opcion = "Introduzca la opción correcta:";
			this.no_product = "No tenemos ningún producto para usted";
		} else {
			this.hello = "Hello";
			this.bye = "Bye";
			this.correct_opcion = "Choose the correct answer:";
			this.no_product = "No credit card avalaible";
		}			
	}
}
