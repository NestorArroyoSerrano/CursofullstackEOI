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

	public static void main(String[] args) {
		ejercicio1();

	}

}
