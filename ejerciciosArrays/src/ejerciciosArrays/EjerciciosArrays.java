package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {
	
	public static void ejercicio1() {
		Scanner sc = new Scanner (System.in);
		String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		System.out.println("Introduzca el número del mes");
		int numero = sc.nextInt();
		System.out.println("El mes es: " + meses [numero-1]);
		
		sc.close();
	}
	
	public static void ejercicio2() {
		int total = 0;
		Integer[] numeros = {1,2,3,4,5,6,7,8,9,10};		
		// La lista de números introducidos (recorrer)
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// La suma de los números
		for (int numero : numeros) {
			total += numero; //total = total + numero
		}
		System.out.println("El total es: " + total);
		// La media de los números
		System.out.println("La media es: " + (double)total/numeros.length);
		// El mayor y el menor de los números (crea un máximo y un mínimo provisional que
		// será igual al primer número del array, después vas comparando con el resto de 
		// posiciones).
		int mayorProvisional = numeros[0]; //1 inicialmente es el 1.
		int menorProvisional = numeros[0]; //1 inicialmente es el 1.
		// Opción A:
		for (int numero : numeros) {
			if(numero>mayorProvisional)
				mayorProvisional = numero;
			if(numero<menorProvisional)
				menorProvisional = numero;
		}
		System.out.println("El número mayor es " +mayorProvisional);
		System.out.println("El número menor es " +menorProvisional);
		// Opción B:
		Arrays.sort(numeros);
		System.out.println("El número mayor es " +numeros[numeros.length-1]);
		System.out.println("El número menor es " +numeros[0]);
	}
	
	public static void clasesEnvolventes () { //Wrappers
		// int -> Integer
		Integer numero;
		// double -> Double
		Double decimal;
		// float -> Float
		Float decimal2;
		// char -> Character
		Character letra;
		// boolean -> Boolean
		Boolean booleano;
		// String ya es una clase, no tiene Wrapper
		String cadena;
	}

	public static void main(String[] args) {
		//ejercicio1();
		ejercicio2();

	}

}
