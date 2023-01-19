package estructuras;

import java.util.Scanner;

public class Estructuras {

	public static void ejemploIf() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine();

		if (nombre.equals("Néstor")) {
			System.out.println("Hola Néstor");

			System.out.println("Pasa un buen día!");
			sc.close();
		}
	}

	public static void ejemploIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine();

		if (nombre.equals("Néstor")) {
			System.out.println("Hola Néstor");

			System.out.println("Pasa un buen día!");

		} else {
			System.out.println("Hola persona desconocida");
		}
	}

	public static void ejemploIfElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido: ");
		int numero = sc.nextInt();

		if (numero == 1) {
			System.out.println("Ha salido un 1");
		} else if (numero == 2) {
			System.out.println("Ha salido un 2");
		} else if (numero == 3) {
			System.out.println("Ha salido un 3");
		} else if (numero == 4) {
			System.out.println("Ha salido un 4");
		} else if (numero == 5) {
			System.out.println("Ha salido un 5");
		} else if (numero == 6) {
			System.out.println("Ha salido un 6");
		} else {
			System.out.println("¿Que tipo de dado tienes que puede salir diferente de 1 a 6?");

		}
	}

	public static void ifElseIfSinElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu equipo preferido");
		String equipo = sc.nextLine();
		String equipoMayusculas = equipo.toUpperCase();

		if (equipo.toLowerCase().equals("barcelona")) { // Pasa a minúscula y compara
			System.out.println("Visca el Barça!");
		} else if (equipo.toUpperCase().equals("MADRID")) { // Pasa a mayúscula y compara
			System.out.println("Hala Madrid!");
		} else if (equipo.equalsIgnoreCase("atletico")) // Compara sin tener en cuenta mayúsculas y minúsculas
			System.out.println("Aupa Atleti");
		System.out.println("Bienvenido a nuestro programa de fútbol");
		sc.close();
	}

	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe que número ha salido: ");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Ha salido un uno");
			break;
		case 2:
			System.out.println("Ha salido un dos");
			break;
		case 3:
			System.out.println("Ha salido un tres");
			break;
		case 4:
			System.out.println("Ha salido un cuatro");
			break;
		case 5:
			System.out.println("Ha salido un cinco");
			break;
		case 6:
			System.out.println("Ha salido un seis");
			break;
		default:
			System.out.println("¿Qué tipo de dado tienes tú?");

		}

		sc.close();

	}
	public static void ejemploTernarias() {
		int edad = 15;
		/*
		if(edad>=18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
		*/
		System.out.println(edad>=18? "Eres mayor de edad":"Eres menor de edad");
		
		int descuento = edad>=18?5:20;
		System.out.println(descuento);
	}

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		//ifElseIfSinElse();
		//ejemploSwitch();
		ejemploTernarias();
	}

}
