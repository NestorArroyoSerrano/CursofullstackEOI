package ejerciciosEstructuras;

import java.util.Scanner;

public class Ejercicios {
	
	
	public static void ejercicio1() {
		
	Scanner sc =  new Scanner(System.in);
	System.out.println("Dime un número");
	int numero = sc.nextInt();
	
	if (numero%2==0) {
		System.out.println("El número es par");
	} else {
		System.out.println("El número es impar");
	}
	
			
	}
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero = sc.nextInt();
		
		if (numero%10==0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
	}

	public static void main(String[] args) {
		//ejercicio1();
		ejercicio2();

	}

}
