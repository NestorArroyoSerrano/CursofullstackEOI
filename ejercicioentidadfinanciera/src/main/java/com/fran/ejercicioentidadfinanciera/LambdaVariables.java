package com.fran.ejercicioentidadfinanciera;

import java.util.List;
import java.util.Scanner;

public class LambdaVariables {
	
	static List<String> ciudades = List.of("Alicante","málaga","Sevilla","Valencia");
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	}
	
	
	public static String variablesLambda() {		
		String ciudad;
		int opcion=0;
		do {
			System.out.println("Introduzca ciudad:");
			ciudad = sc.nextLine();
			String copiaciudad = ciudad;
			ciudades.stream().filter(e->e.contains(copiaciudad)).forEach(System.out::println);
		}while(opcion!=0);
		
		return ciudad;
	}

}
