package ejerciciosEstructuras;

import java.util.Scanner;

public class Ejercicios {

	public static void ejercicio1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

		// System.out.println(numero%2==0?"El número es par":"El número es impar");
		// Operación con ternaria
		sc.close();

	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero = sc.nextInt();

		if (numero % 10 == 0) {
			System.out.println("El número es múltiplo de 10");
		} else {
			System.out.println("El número no es múltiplo de 10");
		}
		sc.close();
	}

	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un carácter y pulsa intro:");
		char caracter = sc.next().charAt(0);
		if (caracter >= 'A' && caracter <= 'Z') {
			System.out.println("El carácter ingresado es una letra mayúscula.");
		} else {
			System.out.println("El carácter ingresado no es una letra mayúscula.");
		}
		sc.close();
	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra1 = sc.nextLine();
		System.out.println("Escribe otra palabra");
		String palabra2 = sc.nextLine();

		if (palabra1.equals(palabra2)) {
			System.out.println("Ambas palabras son iguales");
		} else {
			System.out.println("No son iguales");
		}
		sc.close();

	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número (dividendo)");
		double numero1 = sc.nextDouble();
		System.out.println("Dime otro número (divisor)");
		double numero2 = sc.nextDouble();
		double resultado = numero1 / numero2;

		if (numero2 == 0) {
			System.out.println("No puede ser cero, elija otro número");
		} else {
			System.out.println("El resultado es " + resultado);

		}
		sc.close();

	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero1 = sc.nextInt();
		System.out.println("Dime un segundo número");
		int numero2 = sc.nextInt();
		System.out.println("Dime un tercer número");
		int numero3 = sc.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Es el número más grande " + numero1);
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("Es el número más grande " + numero2);
		} else {
			System.out.println("El número más grande es " + numero3);
		}
		sc.close();

	}

	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la hora: ");
		int horas = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int minutos = sc.nextInt();
		System.out.print("Introduce los segundos: ");
		int segundos = sc.nextInt();
		// Especificamos hora incorrecta o minutos incorrectos o segundos incorrectos.
		if (horas < 0 || horas > 23) {
			System.out.println("La hora (en particular) es incorrecta");
		} else if (minutos < 0 || minutos > 59) {
			System.out.println("Los minutos son incorrectos");
		} else if (segundos < 0 || segundos > 59) {
			System.out.println("Los segundos son incorrectos");
		} else {
			System.out.println(horas + ":" + minutos + ":" + segundos); // no rellena con ceros
			// con printf
			System.out.printf("%02d:%02d:%02d", horas, minutos, segundos); // correcto
		}
		sc.close();

	}

	public static void ejercicio8() {
		int numero1 = 1;
		System.out.println(numero1 % 2 == 0 ? "El número es par" : "El número es impar");

	}

	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el número del mes");
		int mes = sc.nextInt();

		switch (mes) {
		case 1:
			System.out.println("El mes " + mes + " es Enero y tiene 31 días.");
			break;
		case 2:
			System.out.println("El mes " + mes + " es Febrero tiene 28 días.");
			break;
		case 3:
			System.out.println("El mes " + mes + " es Marzo tiene 31 días.");
			break;
		case 4:
			System.out.println("El mes " + mes + " es Abril tiene 30 días.");
			break;
		case 5:
			System.out.println("El mes " + mes + " es Mayo tiene 31 días.");
			break;
		case 6:
			System.out.println("El mes " + mes + " es Junio tiene 30 días.");
			break;
		case 7:
			System.out.println("El mes " + mes + " es Julio tiene 31 días.");
			break;
		case 8:
			System.out.println("El mes " + mes + " es Agosto tiene 31 días.");
			break;
		case 9:
			System.out.println("El mes " + mes + " es Septiembre tiene 30 días.");
			break;
		case 10:
			System.out.println("El mes " + mes + " es Octubre tiene 31 días.");
			break;
		case 11:
			System.out.println("El mes " + mes + " es Noviembre tiene 30 días.");
			break;
		case 12:
			System.out.println("El mes " + mes + " es Diciembre tiene 31 días.");
			break;
		default:
			System.err.println("El mes introducido no existe");
		}
		sc.close();

	}

	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teclea un signo de puntuación, un número u otra tecla");
		char tecla = sc.next().charAt(0);

		switch (tecla) {
		case '.':
		case ',':
		case ';':
		case ':':
			System.out.println("\n Es un signo de puntuación");
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("\n Has pulsado un número");
			break;
		default:
			System.out.println("\n Has pulsado una tecla distinta  a un signo de puntuación y un número");
			break;

		}
		sc.close();
	}

	public static void ejercicio11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero1 = sc.nextInt();
		System.out.println("Dime otro número");
		int numero2 = sc.nextInt();

		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.print("Seleccionar una de las opciones anteriores: ");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("El resultado de la suma es " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("El resultado de la resta es " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("El resultado de la multiplicación es " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("El resultado de la división es " + (numero1 / numero2));
			break;
		default:
			System.err.println("No es posible realizar esa operación");

		}
		sc.close();
	}

	public static void ejercicio12() {
		double precio = 50;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		int edad = sc.nextInt();
		sc.nextLine();

		if (edad < 18) {
			System.out.println(" El precio de la entrada es " + (precio * 0.75));

		} else if (edad > 18 && edad < 65) {
			System.out.println("¿Eres socio?");
			String respuesta = sc.nextLine();
			switch (respuesta) {
			case "s": case "si": case "sí": case "S": case "SI": case "Sí":
				System.out.println(" El precio de tu entrada es: " + (precio * 0.6));
				break;
			case "No": case "no": case "NO":
			System.out.println(" El precio de tu entrada es: " + (precio));
			break;
			}
		} else {
			System.out.println("El precio de tu entrada es: " + (precio*0.25));

		}
		sc.close(); 
	}
		public static void ejercicio13() {
			int numero = 20;
			
			while (numero>0) {
				
				System.out.println(numero);
				numero--; //decremento necesario para que el bucle no sea infinito.
			}
			
			
		}
		public static void ejercicio14() {
			int total = 0, numero;
	        do
	        {
	            System.out.println(" Introduzca un número: ");
	            Scanner sc = new Scanner(System.in);
	            numero =sc.nextInt();
	            total += numero; // total = total + numero
	            System.out.println("Total vale = "+total);
	        } while (numero != 0);	
			
				
			
			
		}
		public static void ejercicio15() {
			int cifras = 0;
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime un número");
			int numero = sc.nextInt();
			
			while (numero!=0){
				numero = numero/10;
				cifras++;
			}
			System.out.println("El numero tiene " + cifras + " cifras");
		}
		public static void ejercicio16() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Dime un número: ");			
			int numero = sc.nextInt();
			
			for(int i=0; i<numero; i++){
			System.out.print("*");
			}	
			System.out.println();
			}
		
		public static void ejercicio17() {;
			for (int i=1; i<=30; i++) {
				if (i % 3 !=0) {
				System.out.println(i);
				
			}
			}	
				
			
		}
		public static void ejercicio18() {
			for (int i=5; i<=100; i+=5) {
				System.out.println(i);
			}
		}
		public static void ejercicio19() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime un número");
			int numero = sc.nextInt();
			
			for (int i=0; i<numero; i++) {
				System.out.print(i + ",");
				
			}
			System.out.println(numero);
		}

	

	public static void main(String[] args) {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		// ejercicio5();
		// ejercicio6();
		// ejercicio7();
		// ejercicio8();
		// ejercicio9();
		// ejercicio10();
		// ejercicio11();
		//ejercicio12();
		//ejercicio13();
		//ejercicio14();
		//ejercicio15();
		//ejercicio16();
		//ejercicio17();
		//ejercicio18();
		ejercicio19();

	}

}
