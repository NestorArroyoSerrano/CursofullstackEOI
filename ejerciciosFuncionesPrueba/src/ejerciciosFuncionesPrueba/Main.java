package ejerciciosFuncionesPrueba;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void dibujaAsteriscos(int numeros) {
		
		
		for (int i = 0; i<numeros; i ++) {
			System.out.print("*");
		}
	}
	
	public static void recibeCadena(String cadena, int num1, int num2) {
		System.out.println(cadena.length()>=num1 && cadena.length()<=num2? "La cadena está dentro del rango" : "La cadena está fuera del rango");
	}

	public static void dibujaCuadrado(char a, int numero) {
		
		
		for (int alto = 0; alto<numero; alto ++) {
			for (int ancho = 0;ancho<numero; ancho++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	public static void personaTrabajo(String nombre, String ... trabajos){
		
		System.out.println(nombre + ": ");
		
		if(trabajos.length==0) {
			System.out.println("Esta persona no ha trabajado nunca");
		} else {
			for(int i = 0; i<trabajos.length; i ++) {
				System.out.println(trabajos[i]);
			}
			
		}
	}
	
	public static boolean esPrimo(int numero) {
	
		boolean primo = true;	 
		for (int i = 2; i<numero; i++) {
			if(numero %i==0) 
			primo = false;
			}
			
			return primo;
		}
			
	public static double devuelveMedia(int [] numeros) {
		int suma = 0;
		if (numeros.length!=0) {
		for(int i = 0; i<numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return (double) suma/numeros.length;
		}
		return 0;          
		
		
	}
	
	public static String devuelveCadenas(String [] cadenas) {
			
		return cadenas [new Random().nextInt(cadenas.length)];
	}
	
	public static void juegoCadenas() {
		
		String [] cadenas = {"hola", "pedro", "diciembre", "navidad", "mal"};
		String cadena = devuelveCadenas(cadenas);
		int contador = 0;
		Scanner sc = new Scanner (System.in);
		String palabraUsuario = "";
		
		while(!palabraUsuario.equalsIgnoreCase(cadena) && contador <3){
			System.out.println("Intenta acertar la palabra");
			palabraUsuario = sc.nextLine();
			contador++;
		}
			if(palabraUsuario.equalsIgnoreCase(cadena)) {
				System.out.println("¡Muy bien, has acertado!");
			}else {
				System.out.println("Has fallado 3 intentos, la palabra era: " + cadena);
			}
		}
	
	public static int devuelveMaximo (int...numeros) {
		
		int maximo;
		
		if (numeros.length==0) {
			maximo = 0;		
		}else {
			maximo = numeros[0];			
			for(int i = 0; i<numeros.length;  i++) {
				maximo = Math.max(maximo, numeros[i]);
			}
			
		}
		return maximo;
		
	}
	public static int devuelveCuantas(String cadena, String subcadena) {
		
		int posicion = 0;
		int contador = 0;
		
		while(posicion>=0) {
			posicion = cadena.indexOf(subcadena, posicion);
			if(posicion>=0) {
				contador++;
				posicion+=subcadena.length();
			}
			
		}
		return contador;

	}
	
	public static double devuelveMedia(String cadena) {
		
		String [] numerosCadena = cadena.split(";");
		int [] numeros = new int [numerosCadena.length];
		for(int i = 0; i<numerosCadena.length; i++) {
			numeros[i]= Integer.parseInt(numerosCadena[i]);
		}
		
		return devuelveMedia(numeros);
		
	}
	
	public static void devuelveOrdenado(String [] cadenas) {
		Arrays.sort(cadenas, Collections.reverseOrder());
	}
	
	public static int cuantasVecesAparece( int [] numeros, int numero) {
		
		int contador = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i]==numero) {
				contador++;
			}
		}
		
		return contador;
		
	}
	public static int cuantasVecesApareceFuncional(int [] numeros, int numero) {
		
		return (int) Arrays.stream(numeros).filter(n->n==numero).count();
	}
	
	
	public static String devolverFechaEspanyol(LocalDate fecha) {
		String cadena = null;
		cadena = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
		return cadena;
	}
	public static void ejercicio13(String fechaCadena) {
		// Obtener dia, mes y año con subString
				
				int dia = Integer.parseInt(fechaCadena.substring(0,2));
				int mes = Integer.parseInt(fechaCadena.substring(3,5));
				int anyo = Integer.parseInt(fechaCadena.substring(6,10));
				
				 // Hacer algo con dia, mes y año (por ejemplo, imprimirlos)
		        System.out.println("Día: " + dia);
		        System.out.println("Mes: " + mes);
		        System.out.println("Año: " + anyo);
				
				// Obtener dia, mes y año con split
				/*String[] partesCadena = fechaCadena.split("-");
				int dia = Integer.parseInt(partesCadena[0]);
				int mes = Integer.parseInt(partesCadena[1]);
				int anyo = Integer.parseInt(partesCadena[2]);*/
		      //LocalDate fecha = LocalDate.of(anyo, mes, dia);		
				
				
				// Obtener dia, mes y año con DateTimeFormatter
				//LocalDate fecha = LocalDate.parse(fechaCadena,DateTimeFormatter.ofPattern("dd-M-y"));
				LocalDate fecha = LocalDate.parse(fechaCadena,DateTimeFormatter.ofPattern("d-M-y"));
				LocalDate fechaSumada = fecha.plusYears(2).plusMonths(3).plusDays(5);
				System.out.println(devolverFechaEspanyol(fechaSumada));
				
				// Ejercicio en 1 línea
				// System.out.println(devolverFechaEspanyol(LocalDate.parse(fechaCadena,DateTimeFormatter.ofPattern("d-M-y")).plusYears(2).plusMonths(3).plusDays(5)));
				
			}
	
		
	

	public static void main(String[] args) {
		//dibujaAsteriscos(20);
		//recibeCadena("Pedro", 4, 10);
		//recibeCadena("Hola tío que tal estás", 1 , 7);
		// dibujaCuadrado('b', 10);
		//personaTrabajo("Pedro");
		//System.out.println(esPrimo(4));
		//System.out.println(esPrimo(10)? " Si es primo " : "No es primo");
		//juegoCadenas();
		//System.out.println(devuelveMaximo(1,2,3,4, 24, 56, 7));
		//System.out.println(devuelveCuantas("Mi papa come papas con pasas", "pa"));
		//System.out.printf("%.2f", devuelveMedia("1;2;3;4;5;6;7;8"));
		
		/*
		int[] numeros = {1,5,9,1,8,6,5,1,9,4,2};
		int apariciones = cuantasVecesApareceFuncional(numeros, 1);
		System.out.println(apariciones);
		*/
		// ejercicio13("05-12-2023");
		
	}

}
