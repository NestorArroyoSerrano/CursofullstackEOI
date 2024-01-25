package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import entidades.Circulo2;
import entidades.Cuadrado2;
import entidades.Empleado;
import entidades.Empresa;
import entidades.IFigura;
import entidades.Persona;


public class Main {

	
	public static double devuelveMayores(List<Integer> numeros) {
		return numeros.stream()
				.filter(n->n>10)
				.mapToDouble(Integer::doubleValue)
				.average()
				.orElse(0.0);
	}
	
	public static void ejercicio2() {
		List <Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pedro", 12));
		personas.add(new Persona("Juan", 23));
		personas.add(new Persona("Pepe", 35));
		personas.add(new Persona("Pablo", 15));
		
		personas.stream()
		.filter(persona-> persona.getEdad()>18)
		.limit(2)
		.forEach(persona->System.out.println(persona.getNombre()));
	}
	public static void ejercicio3() {
		// Utilizamos la lista personas del ejercicio2
        List<Persona> personas = new ArrayList<>(List.of(
                new Persona("Pedro", 12),
                new Persona("Juan", 23),
                new Persona("Pepe", 35),
                new Persona("Pablo", 15)
        ));	
        
        personas.stream().map(Persona::getNombre)
        .sorted()
        .toList()
        .forEach(persona->System.out.println(persona));
	}
	
	public static void ejercicio4() {
		List <Persona> personas = new ArrayList<>(List.of(
				new Persona("Pedro", 12),
                new Persona("Juan", 23),
                new Persona("Pepe", 35),
                new Persona("Pablo", 15)));
		
		personas.stream()
		.map(Persona::getNombre)
		.sorted((nombre1, nombre2) -> Integer.compare(nombre2.length(), nombre1.length()))
		.limit(3)
		.reduce("", (nombre1, nombre2) -> nombre1.isEmpty() ? nombre2 : nombre1 + "-" + nombre2);
		
	}
	
	public static void ejercicio5() {
		List <Persona> personas = new ArrayList<>(List.of(
				new Persona("Pedro", 12),
                new Persona("Juan", 23),
                new Persona("Pepe", 35),
                new Persona("Pablo", 15)));
		
		 Optional<Persona> personaMasJoven = personas.stream()
	                .min(Comparator.comparingInt(Persona::getEdad));

	        personaMasJoven.ifPresentOrElse(
	                persona -> {
	                    System.out.println("La persona más joven es: " + persona.getNombre());
	                    System.out.println("Edad: " + persona.getEdad());
	                },
	                () -> System.out.println("No hay personas en la lista.")
	        );
	    }
		
	public static void ejercicio6() {
		List<IFigura> figuras = new ArrayList<>();
		figuras.add(new Circulo2(23.45));
		figuras.add(new Cuadrado2(31.23));
		figuras.add(new Circulo2(11.22));
		figuras.add(new Cuadrado2(12.11));
		figuras.add(new Circulo2(3.29));
		figuras.add(new Cuadrado2(1.21));
		
		 Optional<IFigura> figuraConMayorArea = figuras.stream()
		            .max(Comparator.comparingDouble(IFigura::getArea));

		    figuraConMayorArea.ifPresent(figura -> System.out.println("La figura con mayor área es: " + figura.toString() + " y el área es: " + figura.getArea()));
		}
	
	public static void ejercicio7() {
		List<IFigura> figuras = new ArrayList<>();
		figuras.add(new Circulo2(23.45));
		figuras.add(new Cuadrado2(31.23));
		figuras.add(new Circulo2(11.22));
		figuras.add(new Cuadrado2(12.11));
		figuras.add(new Circulo2(3.29));
		figuras.add(new Cuadrado2(1.21));
		
		 Optional<IFigura> figuraConMayorArea = figuras.stream()
				 	.filter(figura-> figura instanceof Cuadrado2)
		            .max(Comparator.comparingDouble(IFigura::getArea));

		    figuraConMayorArea.ifPresent(figura -> System.out.println("El cuadrado con mayor área es: " + figura.toString() + " y el área es: " + figura.getArea()));
		}
	
	public static void ejercicio8() {
		Empresa empresa = new Empresa();
		
		empresa.contratarEmpleado(new Empleado("Pedro", 34));
		empresa.contratarEmpleado(new Empleado("Juan", 23));
		empresa.contratarEmpleado(new Empleado("Alicia", 28));
		empresa.contratarEmpleado(new Empleado("Néstor", 27));
		empresa.contratarEmpleado(new Empleado("Cristina", 45));
		empresa.contratarEmpleado(new Empleado("Sergio", 32));
		
		// Borrado por posición
		empresa.eliminarEmpleadoPorPosicion(0);
		
		// Borrado por nombre
		
		empresa.eliminarEmpleadoPorNombre("Sergio");
		
		 // Muestra la lista de empleados actualizada
        System.out.println("Empleados actualizados:");
        empresa.obtenerEmpleados().forEach(System.out::println);
	
	}
	

public static void main(String[] args) {
	
	/*
	List <Integer> numeros = new ArrayList(Arrays.asList(1, 5, 9, 12, 20, 25, 30));
	double media = devuelveMayores(numeros);
	System.out.println("La media de los números mayores que 10 es " + media);
	*/
	//ejercicio2();
	//ejercicio3();
	//ejercicio4();
	//ejercicio5();
	//ejercicio6();
	//ejercicio7();
	ejercicio8();
	}
}
 