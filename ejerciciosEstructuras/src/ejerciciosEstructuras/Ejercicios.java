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
			System.out.println("Es el número más grande " + numero1 );
		}else if (numero2 > numero1 && numero2 > numero3) {
				System.out.println("Es el número más grande " +numero2);
			}else {
				System.out.println("El número más grande es " + numero3);
			}

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
		if (horas < 0 || horas > 23)  
        {
           System.out.println("La hora (en particular) es incorrecta");
        }
        else if(minutos < 0 || minutos > 59 )
        {
        	System.out.println("Los minutos son incorrectos");
        }
        else if(segundos < 0 || segundos > 59)
        {
        	System.out.println("Los segundos son incorrectos");
        }
        else 
        {
        	System.out.println(horas+":"+minutos+":"+segundos); //no rellena con ceros
        	// con printf
        	System.out.printf("%02d:%02d:%02d",horas,minutos,segundos); //correcto
        }
        
	}
	
	public static void ejercicio8() {
		int numero1 = 1;
		System.out.println(numero1 % 2==0? "El número es par": "El número es impar");
		
	}
	public static void ejercicio9() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el número del mes");
		int mes = sc.nextInt();
		
		switch (mes) {
	case 1:
		System.out.println("El mes "+mes+" es Enero y tiene 31 d�as.");
		break;
	case 2:
		System.out.println("El mes "+mes+" es Febrero tiene 28 d�as.");
		break;
	case 3:
		System.out.println("El mes "+mes+" es Marzo tiene 31 d�as.");
		break;
	case 4:
		System.out.println("El mes "+mes+" es Abril tiene 30 d�as.");
		break;
	case 5:
		System.out.println("El mes "+mes+" es Mayo tiene 31 d�as.");
		break;
	case 6:
		System.out.println("El mes "+mes+" es Junio tiene 30 d�as.");
		break;
	case 7:
		System.out.println("El mes "+mes+" es Julio tiene 31 d�as.");
		break;
	case 8:
		System.out.println("El mes "+mes+" es Agosto tiene 31 d�as.");
		break;
	case 9:
		System.out.println("El mes "+mes+" es Septiembre tiene 30 d�as.");
		break;
	case 10:
		System.out.println("El mes "+mes+" es Octubre tiene 31 d�as.");
		break;
	case 11:
		System.out.println("El mes "+mes+" es Noviembre tiene 30 d�as.");
		break;
	case 12:
		System.out.println("El mes "+mes+" es Diciembre tiene 31 d�as.");
		break;
	default:
		System.err.println("El mes introducido no existe");
	}
		 
		}
		
	

	public static void main(String[] args) {
		// ejercicio1();
		// ejercicio2();
		// ejercicio3();
		// ejercicio4();
		//ejercicio5();
		//ejercicio6();
		//ejercicio7();
		//ejercicio8();
		ejercicio9();

	}

}
