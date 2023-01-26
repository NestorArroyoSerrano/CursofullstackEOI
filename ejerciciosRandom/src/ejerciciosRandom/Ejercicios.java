package ejerciciosRandom;

import java.util.Scanner;

public class Ejercicios {
	public static void ejercicio1() { // Declara dos variables numéricas (con el valor que desees), muestra por
										// consola la suma,
		// resta, multiplicación, división y módulo (resto de la división).

		int numero1 = 20;
		int numero2 = 10;
		System.out.println("La suma es " + (numero1 + numero2));
		System.out.println("La resta es " + (numero1 - numero2));
		System.out.println("La multiplicación es " + (numero1 * numero2));
		System.out.println("La división es " + (numero1 / numero2));
		System.out.println("El módulo es " + (numero1 % numero2));

	}

	public static void ejercicio2() { // Declara 2 variables numéricas (con el valor que desees), he indica cual es
										// mayor de los dos.
		// Si son iguales indicarlo también. Ves cambiando los valores para comprobar
		// que funciona.

		int num1 = 30;
		int num2 = 20;
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else {
			System.out.println(num1 + " y " + num2 + " son iguales");
		}
	}

	public static void ejercicio3() { // Declara un String que contenga tu nombre, después muestra un mensaje de
										// bienvenida por consola.
		// Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = sc.nextLine();

		System.out.println("Bienvenido " + nombre);
		sc.close();

	}

	public static void ejercicio4() { // Haz una aplicación que calcule el área de un círculo(pi*R2).
		// El radio se pedirá por teclado (recuerda pasar de String a double con
		// Double.parseDouble). Usa la constante PI y el método pow de Math.
		double pi = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el radio que quieras ");
		double radio = sc.nextDouble();

		System.out.println("El área del círculo es " + pi * (radio * radio));
		sc.close();
	}

	/*
	 * public class CircleArea { public static void main(String[] args) { Scanner
	 * scanner = new Scanner(System.in);
	 * System.out.print("Ingrese el radio del círculo: "); double radio =
	 * scanner.nextDouble(); double area = Math.PI * Math.pow(radio, 2);
	 * System.out.println("El área del círculo es: " + area); } }
	 */
	public static void ejercicio6() { // Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no
										// lo es, también debemos indicarlo.
		int numero = 28;
		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
	}

	public static void ejercicio7() { // Lee un número por teclado y muestra por consola, el carácter al que pertenece
										// en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int num = sc.nextInt();
		char asciiChar = (char) num;
		System.out.println("El carácter asociado a " + num + " en la tabla ASCII es " + asciiChar);
	}

	public static void ejercicio8() { // Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un
										// carácter (char) y muestre su código en la tabla ASCII.
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un carácter: ");
		char character = sc.next().charAt(0);
		int asciiChar = (int) character;
		System.out.println("El carácter asociado a " + character + " en la tabla ASCII es " + asciiChar);
	}

	public static void ejercicio9() { // Lee un número por teclado que pida el precio de un producto (puede tener
										// decimales) y
		// calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		double numero = sc.nextDouble();
		System.out.println("El precio final de tu producto es " + numero * (1 + 0.21));
	}

	public static void ejercicio10() { // Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

		int numero = 1;
		while (numero <= 100) {
			System.out.println(numero);
			numero++;
		}

	}

	public static void ejercicio11() { // Haz el mismo ejercicio anterior con un bucle for.
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

	public static void ejercicio12() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		//ejercicio11();
		ejercicio12();

	}

}
