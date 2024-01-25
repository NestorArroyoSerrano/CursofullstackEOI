package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import entidades.Persona;

public class Main {

	public static void ejercicio1() {
		List<Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		numeros.add(50);
		numeros.add(60);
		numeros.removeIf(e->e==20);
		numeros.add(1,25);
		numeros.add(2,26);
		Collections.reverse(numeros);
		numeros.forEach(e->System.out.println(e));
		
	}
	
	public static void ejercicio3() {
	 Map <Integer, Persona> personas = new HashMap<>();
	 personas.put(48718930, new Persona("Pedro", 27));
	 personas.put(01234567, new Persona("Juan", 33));
	 personas.put(12345601, new Persona("Carlitos", 23));
	 
	 personas.forEach((Integer, Persona)-> System.out.println("El DNI de esta persona es " +Integer + " y esta persona es " + Persona));
	
	}
	public static void ejercicio4() {
		
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(10,20,45,60,13,8));
		List <Integer> numeros2 = new ArrayList<Integer>(numeros);
		
		numeros2.replaceAll(numero-> numero/2);
		numeros2.removeIf(numero-> numero % 2 != 0);
		
		numeros2.forEach(System.out::println);
		
	}
	
	public static void ejercicio5() {
		Set<String> cadenas = new HashSet<>();
		Scanner sc = new Scanner (System.in);
		boolean salir = false;
		
		while(!salir) {
			System.out.println("Dime una palabra. Escribe 'salir' para terminar el proceso ");
			String palabra = sc.nextLine();
			if(palabra.toLowerCase().equals(salir)) {
				salir = true;
			}else{
				if(cadenas.contains(palabra)) {
					System.out.printf("La palabra %s está ya repetida", palabra);
				}else {
					cadenas.add(palabra);
				}
			}
		}
	}
	
	
public static void main(String[] args) {
//	ejercicio1();
//	ejercicio3();
	ejercicio4();
	}
}
