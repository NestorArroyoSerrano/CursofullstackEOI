package ejerciciosColeccionesBorrarLuego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ejerciciosColeccionesBorrarLuego.entidades.Persona;

public class Main {
	
	public static void ejercicio1() {
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40));
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(e->e==20);
		numeros.add(1, 25);
		numeros.add(2, 26);
		numeros.sort(Collections.reverseOrder());
		//Collections.reverse(numeros);
		numeros.forEach(e->System.out.println(e));
	}
	public static void ejercicio3() {
		Map <Integer, Persona> personas = new HashMap<>();
		personas.put(48718930, new Persona("Néstor", 27));
		personas.put(00001111, new Persona("Pedro", 34));
		personas.put(00002222, new Persona("Pepe", 54));
		
		/*
		for(Map.Entry<Integer, Persona> entry : personas.entrySet()) {
			Integer dni = entry.getKey();
			Persona persona = entry.getValue();
			System.out.println(persona);
		*/	
			//personas.forEach((Integer, Persona)-> System.out.println("El DNI de esta persona es " +Integer + " y esta persona es " + Persona));
		}
	
	public static void ejercicio4() {
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 69, 70, 73, 85));
		List <Integer> numeros2 = new ArrayList<Integer>(numeros);
		
		numeros2.replaceAll(n->n/2);
		numeros2.removeIf(n->n%2 != 0);
		numeros2.forEach(System.out::println);
	}
	public static void ejercicio5() {
		Set<String> cadenas = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		boolean salir = false;
		
		while(!salir) {
			System.out.println("Dime una palabra:  (escribe 'salir' para acabar el programa)");
			String palabra = sc.nextLine();
			if(palabra.toLowerCase().equals("salir")) {
				salir = true;
			}else {
				if(cadenas.contains(palabra)) {
					System.out.println("La palabra "+ palabra + " ya está en el conjunto");
				}else {
					cadenas.add(palabra);
				}
				
			}
		}
	}
		
	
	
public static void main(String[] args) {
	//ejercicio1();
	//ejercicio3();
	//ejercicio4();
	ejercicio5();
	}
}
