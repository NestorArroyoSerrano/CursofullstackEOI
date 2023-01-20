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
	public static void ejercicio3() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un carácter y pulsa intro:");
		char caracter = sc.next().charAt(0);
        if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("El carácter ingresado es una letra mayúscula.");
        } else {
            System.out.println("El carácter ingresado no es una letra mayúscula.");
        }
    }
	public static void ejercicio4() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe una palabra");
		String palabra1 = sc.nextLine();
		System.out.println("Escribe otra palabra");
		String palabra2 = sc.nextLine();
		
		if (palabra1.equals(palabra2)) {
			System.out.println("Ambas palabras son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
			
		}
		
	public static void ejercicio5() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime un número (dividendo)");
		double numero1 = sc.nextDouble();
		System.out.println("Dime otro número (divisor)");
		double numero2 = sc.nextDouble();
		double resultado = numero1/numero2;
		
	
		if (numero2==0) {
			System.out.println("No puede ser cero, elija otro número");
		}else {
			System.out.println("El resultado es " +resultado);
		
			
		}
	}
	


	public static void main(String[] args) {
		//ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		ejercicio5();

	}

}
