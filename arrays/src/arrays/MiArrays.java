package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MiArrays {

	public static void ejemploDeclaraciones() {
		// Java es un lenguaje base 0, siempre la primera posición es la 0
		// la última será el número-1
		int[] numeros; // Declarar la variable
		numeros = new int[5]; // Asignar memoria para poder trabajar con ella
		int[] nums = new int[5];// Declaración y asignación en la misma línea. Lo más habitual
		// Si a nums no le doy valores a los números, todos tienen 0.
		numeros[0] = 12; // Inicializar valores
		numeros[1] = 23;
		numeros[2] = 53;
		numeros[3] = 5;
		numeros[4] = 92;
		int[] numeros2 = { 12, 23, 53, 5, 92 };

	}

	public static void ejemploRecorrido() {
		int[] numeros = { 12, 23, 53, 5, 92 };
		// con un bucle for
		for (int i = 0; i < numeros.length; i++) { // Recorrer el array de uno en uno
			System.out.println("El array numeros en su posición " + i + " tiene el valor " + numeros[i]);
		}
		// con un bucle for-each
		for (int numero : numeros) { // Para cada número dentro de números, imprímelo.
			System.out.println(numero);

		}
		// bucle for-each con posición
		int i = 0;
		for (int numero : numeros) {
			System.out.println("El array numeros en su posición " + (i++) + " tiene el valor " + numero);
		}
	}

	public static void ejemploBusquedas1() {
		String[] nombres = { " Juan", " Ana", " Pedro", " Eva", "Paco" };
		boolean encontrado = false; // Nos indicará si hemos encontrado el valor
		String buscar = " Pedro"; // Valor a buscar en el array
		// La condición también incluye que no hayamos encontrado lo que buscamos
		for (int i = 0; i < nombres.length && !encontrado; i++)
			if (nombres[i].equals(buscar))
				encontrado = true;
		if (encontrado) {
			System.out.println("El nombre" + buscar + "está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}
	}
	public static void ejemploBusquedaFuncional() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco" };
		String buscar = "Pedro";
		if (Arrays.stream(nombres).anyMatch(n -> n.equals(buscar))) {  // con lambdas
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}
	}

	public static void ejemploRedimension() {
		String[] nombres = { "Juan", "Ana", "Pedro", "Eva", "Paco", "" };
		nombres = Arrays.copyOf(nombres, 10);
		for(int i = 0; i < nombres.length ; i++) {
			if(nombres[i]!=null) 
				System.out.println(nombres[i]  + " tiene " + nombres[i].length() + " letras");
		}
		// for-each
		System.out.println("Comienzo del for-each");
		for(String nombre : nombres) {
			if(nombre!=null) 
				System.out.println(nombre + " tiene " + nombre.length() + " letras");
		}
	}
	
	public static void ejemploAumentarUnoArray() {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		System.out.println("Introduzca el nuevo alumno:");
		String nombreAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length+1);  // Le da un tamaño de una unidad más al array
		alumnos[alumnos.length-1] = nombreAlumno;  // Mete el nuevo dato en la última posición
		for(String alumno : alumnos) {  // forEach
			System.out.println(alumno);
		}
		Arrays.stream(alumnos).forEach(e->System.out.println(e));  // Programación funcional
		sc.close();
	}
	
	public static void ejemploStringJoin() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		String cadenaAlumnos = String.join(",", alumnos);
		System.out.println(cadenaAlumnos);
	}
	
	public static void eliminarUnElementoArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		alumnos = Arrays.copyOf(alumnos, alumnos.length-1);
		for(String alumno : alumnos) {  // forEach
			System.out.println(alumno);
		}
	}
	
	public static void ordenarArray() {
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		Arrays.sort(alumnos);
		System.out.println("Imprimir con for-each");
		for(String alumno : alumnos) {  // forEach
			System.out.println(alumno);
		}
		System.out.println("Imprimir con toString");
		System.out.println(Arrays.toString(alumnos));  // Para ver el contenido de un array
		
		int[] numeros = {11,2,4,5,3,21,80};
		Arrays.sort(numeros);
		for(int numero : numeros) {  // forEach
			System.out.println(numero);
		}
				
	}
	
	public static void ordenarInverso() {
		// Cadenas
		String[] alumnos = { "Juan", "Ana", "Pedro", "Eva", "Paco"};
		Arrays.sort(alumnos);  // De menor a mayor
		for(String alumno : alumnos) {  // forEach
			System.out.println(alumno);
		}
		// Orden mayor a menor
		Collections.reverse(Arrays.asList(alumnos));
		for(String alumno : alumnos) {  // forEach
			System.out.println(alumno);
		}
		// Ahora con números
		Integer[] numeros = {11,2,4,5,3,21,80};  // Integer es la clase Wrapper de int, Boxing
		Arrays.sort(numeros);  // De menor a mayor
		for(int numero : numeros) {  // forEach
			System.out.println(numero);
		}
		Collections.reverse(Arrays.asList(numeros));
		for(int numero : numeros) {  // forEach
			System.out.println(numero);
		}
	}
	public static void main(String[] args) {
		// ejemploDeclaraciones();
		// ejemploRecorrido();
		// long inicio = System.currentTimeMillis();
		// ejemploBusquedas1();
		// long fin = System.currentTimeMillis();
		// System.out.println("El proceso ha tardado: " + inicio + " " + fin + " " + (fin-inicio));
		// inicio = System.currentTimeMillis();
		// ejemploBusquedaFuncional();
		// fin = System.currentTimeMillis();
		// System.out.println("El proceso ha tardado: " + (fin-inicio));
		// ejemploRedimension();
		// ejemploAumentarUnoArray();
		// ejemploStringJoin();
		// eliminarUnElementoArray();
		// ordenarArray();
		ordenarInverso();
	}

}
