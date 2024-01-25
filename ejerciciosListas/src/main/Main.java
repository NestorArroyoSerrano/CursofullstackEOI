package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import ejercicioslistas.entidades.Cuadrado2;
import ejercicioslistas.entidades.Empleado;
import ejercicioslistas.entidades.Empresa;
import ejercicioslistas.entidades.IFigura;
import ejercicioslistas.entidades.Persona;
import ejercicioslistas.entidades.Circulo2;

public class Main {
	
	public static double devuelveMedia(List<Integer> numeros) {
		return numeros.stream().filter(n->n>10)
				.mapToDouble(Integer::doubleValue)
	            .average()
	            .orElse(0.0);
		
	}
	public static void ejercicio2() {
		List <Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pedro", 25));
		personas.add(new Persona("Juan", 15));
		personas.add(new Persona("Néstor", 13));
		personas.add(new Persona("Ali", 28));
		personas.add(new Persona("María", 55));
		personas.add(new Persona("Eustaquio", 6));
		
		personas.stream()
        .filter(persona -> persona.getEdad() > 18)
        .limit(2)
        .forEach(persona -> System.out.println(persona.getNombre()));
	}
	public static List <Persona> personas(){
		List <Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pedro", 25));
		personas.add(new Persona("Juan", 15));
		personas.add(new Persona("Néstor", 13));
		personas.add(new Persona("Ali", 28));
		personas.add(new Persona("María", 55));
		personas.add(new Persona("Eustaquio", 6));
		
		return personas;
	}
	public static List <Persona> personas2() {
		List <Persona> personas2 = new ArrayList<>();
		personas2.add(new Persona("Pedro", 25));
		personas2.add(new Persona("Juan", 15));
		personas2.add(new Persona("Néstor", 13));
		personas2.add(new Persona("Ali", 28));
		personas2.add(new Persona("María", 55));
		personas2.add(new Persona("Eustaquio", 6));
		
		return personas2;
	}
	
	public static  List <Persona> personas3() {
		List <Persona> personas3 = new ArrayList<>();
		personas3.add(new Persona("Pedro", 25));
		personas3.add(new Persona("Juan", 15));
		personas3.add(new Persona("Néstor", 13));
		personas3.add(new Persona("Ali", 28));
		personas3.add(new Persona("María", 55));
		personas3.add(new Persona("Eustaquio", 6));
		
		
		return personas3;
		
	}
	public static void ejercicio6() {
		List <IFigura> figuras = new ArrayList<>();
		IFigura cuadrado = new Cuadrado2(22.45);
		IFigura circulo = new Circulo2(31.32);
		figuras.add(new Cuadrado2(5.0));
        figuras.add(new Circulo2(3.0));
        figuras.add(new Cuadrado2(4.0));
        figuras.add(new Circulo2(2.0));
        
   	 // Utilizar programación funcional para encontrar la figura con el área máxima
        IFigura figuraConMayorArea = figuras.stream()
                .max((figura1, figura2) -> Double.compare(figura1.getArea(), figura2.getArea()))
                .orElse(null);

        // Verificar si se encontró una figura con área máxima y mostrarla
        if (figuraConMayorArea != null) {
            System.out.println("Figura con el área máxima: " );
            System.out.println("Área: " + figuraConMayorArea.getArea());
        } else {
            System.out.println("No se encontró ninguna figura en la lista.");
        }
	}
	
	public static void ejercicio7() {
		List<IFigura> figuras = new ArrayList<>();
        IFigura cuadrado1 = new Cuadrado2(22.45);
        IFigura cuadrado2 = new Cuadrado2(18.0);
        IFigura circulo = new Circulo2(31.32);
        figuras.add(cuadrado1);
        figuras.add(cuadrado2);
        figuras.add(circulo);

        // Inicializa un mapa que asocie las figuras con sus nombres
        Map<IFigura, String> nombresFiguras = new HashMap<>();
        nombresFiguras.put(cuadrado1, "Cuadrado");
        nombresFiguras.put(cuadrado2, "Cuadrado");
        nombresFiguras.put(circulo, "Círculo");

        // Filtra solo las figuras que son cuadrados
        List<IFigura> cuadrados = figuras.stream()
                .filter(figura -> figura instanceof Cuadrado2)
                .collect(Collectors.toList());

        // Utiliza programación funcional para encontrar el cuadrado con el área máxima
        IFigura figuraConMayorArea = cuadrados.stream()
                .max((figura1, figura2) -> Double.compare(figura1.getArea(), figura2.getArea()))
                .orElse(null);

        // Verificar si se encontró un cuadrado con área máxima y mostrarlo
        if (figuraConMayorArea != null) {
            String nombreFiguraConMayorArea = nombresFiguras.get(figuraConMayorArea);
            System.out.println("Cuadrado con el área máxima:");
            System.out.println("Nombre: " + nombreFiguraConMayorArea);
            System.out.println("Área: " + figuraConMayorArea.getArea());
        } else {
            System.out.println("No se encontró ningún cuadrado en la lista.");
        }
    }
	public static void ejercicio8() {
		Empresa empresa = new Empresa();

        // Contratar empleados
        empresa.contratarEmpleado(new Empleado("Empleado 1", 30));
        empresa.contratarEmpleado(new Empleado("Empleado 2", 25));
        empresa.contratarEmpleado(new Empleado("Empleado 3", 35));
        empresa.contratarEmpleado(new Empleado("Empleado 4", 40));

        // Muestra la lista de empleados actual
        System.out.println("Empleados actuales:");
        empresa.obtenerEmpleados().forEach(System.out::println);

        // Contratar más empleados
        empresa.contratarEmpleado(new Empleado("Empleado 5", 28));
        empresa.contratarEmpleado(new Empleado("Empleado 6", 32));

        // Eliminar un empleado por posición
        empresa.eliminarEmpleadoPorPosicion(2);

        // Eliminar un empleado por nombre
        empresa.eliminarEmpleadoPorNombre("Empleado 4");

        // Muestra la lista de empleados actualizada
        System.out.println("Empleados actualizados:");
        empresa.obtenerEmpleados().forEach(System.out::println);
	}


	

	public static void main(String[] args) {
	
		/*
		List <Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,7,9,11,13,15,20,22,34));
		double media = devuelveMedia(numeros);
		System.out.println("La media de los números mayores que 10 es " + media);
	 	*/
		//ejercicio2();
		
		/*
		  List<String> nombresOrdenados = personas().stream()
	                .map(Persona::getNombre)
	                .sorted()
	                .toList();

	        nombresOrdenados.forEach(System.out::println);
	        */
		/*
		List<Persona> personas = personas2();

        String nombresMasLargos = personas.stream()
                .map(Persona::getNombre)
                .sorted((nombre1, nombre2) -> Integer.compare(nombre2.length(), nombre1.length()))
                .limit(3)
                .reduce("", (nombre1, nombre2) -> nombre1.isEmpty() ? nombre2 : nombre1 + "-" + nombre2);

        System.out.println(nombresMasLargos);
        
		*/
		/*
		List <Persona> personas = personas3();
		
		// Encuentra a la persona más joven utilizando min y un comparador
        Persona personaMasJoven = personas.stream()
                .min(Comparator.comparingInt(Persona::getEdad))
                .orElse(null); // Maneja el caso en el que la lista esté vacía

        if (personaMasJoven != null) {
            System.out.println("Persona más joven:");
            System.out.println(personaMasJoven);
        } else {
            System.out.println("La lista de personas está vacía.");
        }
        */
		//ejercicio6();
		ejercicio7();
		//ejercicio8();
        }
    }


	


