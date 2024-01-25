package main;

import java.util.HashSet;
import java.util.Set;

import entidades.CuentoDeHadas;

public class Ejercicio {

	public static void ejercicioSetCuentoDeHadas() {
		
		Set<CuentoDeHadas> cuentos = new HashSet<>();
		cuentos.add(new CuentoDeHadas("Blancanieves", 50));
		cuentos.add(new CuentoDeHadas("Cenicienta", 60));
		cuentos.add(new CuentoDeHadas("Blancanieves", 80));
		cuentos.add(new CuentoDeHadas("Pulgarcito", 100));
		cuentos.add(new CuentoDeHadas("Pulgarcito", 100));
		cuentos.forEach(System.out::println);
		
		System.out.println(cuentos.contains(new CuentoDeHadas("Blancanieves",0)));
	}
	
	public static void main(String[] args) {
		ejercicioSetCuentoDeHadas();
	}
}
