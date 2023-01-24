package estructuras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
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
		int edad = 40;

		/*
		 * if(edad>=18) System.out.println("Eres mayor de edad"); else
		 * System.out.println("Eres menor de edad");
		 */

		System.out.println(edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad");

		/*
		 * int descuento; if(edad>=18) { descuento=5; } else { descuento=20; }
		 */

		int descuento = edad >= 18 ? 5 : 20;
		System.out.println(descuento);

		/*
		 * int tresValores; if(edad<18) { tresValores=1; } else if(edad>=18 && edad<=65)
		 * { tresValores=2; } else { tresValores=3; }
		 */

		int tresValores = edad < 18 ? 1 : (edad >= 18 && edad <= 65) ? 2 : 3;

		System.out.println("TresValores vale " + tresValores);

		int euros = 10;
		if (euros > 1) {
			System.out.println("Cuesta " + euros + " euros");
		} else {
			System.out.println("Cuesta " + euros + " euro");
		}

		System.out.println("Cuesta " + euros + " euro" + (euros != 1 ? "s" : ""));
		System.out.println("Cuesta " + euros + (euros != 1 ? "euros" : "euro"));

	}

	public static void ejemploAmbitosVariables() {
		int numero = 5;
		int edad = 20;

		if (edad > 18) {
			// int numero=3; // En Java da error
			int valor = 4;
			System.out.println(numero);
		}
		System.out.println("hola");
		// System.out.println(valor); // Da error porque la variable no existe fuera del
		// if
	}

	/**
	 * Este programa se ejecuta hasta que el usuario adivine la contraseña
	 */
	public static void ejemploWhile1() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		String password = "1234";
		boolean adivina = false;
		while (!adivina) { // (adivina==false)
			System.out.println("Introduzca la contraseña:");
			String respuesta = sc.nextLine();
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste.\nSigue intentándolo");
			}
		}
		System.out.println("Enhorabuena! acertaste.");
		sc.close();
	}

	/**
	 * El programa permite adivinar la password en 3 oportunidades
	 */
	public static void ejemploWhile2() {
		Scanner sc = new Scanner(System.in); // Para leer datos por pantalla
		String password = "1234";
		int intentos = 0;
		boolean adivina = false;
		while (!adivina && intentos < 3) { // (adivina==false)
			System.out.println("Introduzca la contraseña (Tienes " + (3 - intentos) + " intentos):");
			String respuesta = sc.nextLine();
			intentos++;
			if (respuesta.equals(password)) {
				adivina = true;
			} else {
				System.out.println("Fallaste");
			}
		}
		System.out.println(adivina ? "Acertaste" : "Gastaste todas tus intentos");

		/*
		 * if(adivina) { // (adivina==true) System.out.println("Acertaste"); } else {
		 * System.out.println("Gastaste todas tus intentos"); }
		 */
		sc.close();
	}
	public static void ejemploDoWhile3() {
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		do {
			System.out.println("1. Primera opción");
			System.out.println("2. Segunda opción");
			System.out.println("3. Tercera opción");
			System.out.println("4. Cuarta opción");
			System.out.println("0. Salir");
			opcion=sc.nextInt();
			sc.nextLine();
			
		}while(opcion!=0);
		sc.close();
	}

	public static void acaboCurso() {
		int diasQuedan = 0;
		LocalDate fecha = LocalDate.now(); // día de hoy (23/01/2023)
		while (fecha.isBefore(LocalDate.parse("2023-03-31"))) {
			if (fecha.getDayOfWeek() != DayOfWeek.SATURDAY && fecha.getDayOfWeek() != DayOfWeek.SUNDAY) {
				System.out.println(fecha);
				diasQuedan++;
			}
			fecha = fecha.plusDays(1); // fecha = fecha + 1 dia;
		}
		System.out.println("Te quedan " + diasQuedan + " días");
	}
	public static void imprimirHoraFecha() {
		// Java 8
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime fechaHora = LocalDateTime.now();
		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(fechaHora);
		// Java 5
		Date fechaJava5 = new Date(); // huid
	}
	public static void ejemploFor1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Repetición número " + (i+1));
		}
	}
	public static void ejemploFor2() { //Bucle infinito
		for (;;) {
			System.out.println("Repetición número ");
		}
	}
	public static void ejemploForWhile() {
		int i = 0;
		while(i<10) {
			System.out.println("Repetición numero " + (i));
			i++;
		}
	}
	public static void ejemploFor3() {
		for (int i = 10; i>0; i--) {
			System.out.println("Repetición número " + (i));
		}
	}

	public static void main(String[] args) {
		// ejemploIf();
		// ejemploIfElse();
		// ejemploIfElseIfElse();
		// ifElseIfSinElse();
		// ejemploSwitch();
		// ejemploTernarias();
		// ejemploAmbitosVariables();
		// ejemploWhile1();
		//ejemploWhile2();
		//ejemploFor1();
		ejemploFor3();
	}

}
