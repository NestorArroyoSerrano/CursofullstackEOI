package com.nestor.prueba;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
	
	
	//Invertir una cadena 
	private void  m1InvertString(String texto) {
		String [] array = texto.split("");
		StringBuilder nuevoTexto = new StringBuilder();
		for (int i = array.length; i >0; i--) {
			nuevoTexto.append(array[i-1]);
		}
		System.out.println(nuevoTexto);
	}
	
	public void m2InvertString(String texto) {
		String nuevoTexto = new StringBuilder(texto).reverse().toString();
		System.out.println(nuevoTexto);
		
	}
	
	public void numeroCapicua(int numero) {
		String numeroTexto = String.valueOf(numero);
		String reverseNumero = new StringBuilder(numeroTexto).reverse().toString();
		
		if(numeroTexto.equals(reverseNumero)) {
			System.out.println("Es capicúa");
		}else {
			System.out.println("No es capicúa");
		}
	}
	public static void contarCaracteres (String texto) {
		 int i, length;
		    int[] counter = new int[26]; // Usaremos solo letras del alfabeto (a-z)

		    // Convertir el texto a minúsculas para ignorar mayúsculas y minúsculas
		    texto = texto.toLowerCase();

		    length = texto.length();

		    for (i = 0; i < length; i++) {
		        char c = texto.charAt(i);

		        // Verificar si el carácter es una letra minúscula
		        if (c >= 'a' && c <= 'z') {
		            counter[c - 'a']++; // Incrementar el contador correspondiente
		        }
		    }

		    for (i = 0; i < 26; i++) {
		        if (counter[i] != 0) {
		            char letra = (char) ('a' + i); // Convertir el índice en una letra
		            System.out.println(letra + ": " + counter[i]);
		        }
		    }
		}
	
	public static void caracteresRepetidos(String texto) {
		int i, length;
	    int[] counter = new int[26]; // Usaremos solo letras del alfabeto (a-z)

	    // Convertir el texto a minúsculas para ignorar mayúsculas y minúsculas
	    texto = texto.toLowerCase();

	    length = texto.length();

	    for (i = 0; i < length; i++) {
	        char c = texto.charAt(i);

	        // Verificar si el carácter es una letra minúscula
	        if (c >= 'a' && c <= 'z') {
	            counter[c - 'a']++; // Incrementar el contador correspondiente
	        }
	    }

	    for (i = 0; i < 26; i++) {
	        if (counter[i] > 1) {
	            char letra = (char) ('a' + i); // Convertir el índice en una letra
	            System.out.println(letra + ": " + counter[i]);
	        }
	    }
	}
	public static void esMultiploDe2(int numero) {
		if (numero % 2 == 0 ) {
			System.out.println("Es múltiplo");
		}else {
			System.out.println("No es múltiplo");
		}
	}
	public static void anyoBisiesto(int anyo) {
		boolean esAnyoBisiesto = LocalDate.of(anyo, 1, 1).isLeapYear();
		System.out.println(esAnyoBisiesto);
	}
	
	public static void ramdomOrderString(String text) {
		String [] array = text.split("");
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
	}
	
	
	// Ejercicios Generales documento descargado
	
	public static void pideNumero() {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = Integer.parseInt(sc.nextLine());

        // Convierte el número a positivo para contar las cifras
        int numeroPositivo = Math.abs(numero);

        // Convierte el número a una cadena y calcula su longitud
        int numCifras = String.valueOf(numeroPositivo).length();

        System.out.println("El número tiene " + numCifras + " cifras.");
    }
	
	public static void pideNumero2() {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número entero: ");
	        int numero = sc.nextInt();

	        // Convierte el número a positivo para contar las cifras
	        int numeroPositivo = Math.abs(numero);

	        int numCifras = 0;

	        // Bucle para contar las cifras
	        while (numeroPositivo > 0) {
	            numeroPositivo /= 10;
	            numCifras++;
	        }

	        System.out.println("El número tiene " + numCifras + " cifras.");
	    }
	
	public static void convierteAKelvin() {
		Scanner sc = new Scanner(System.in);
        char respuesta;

        do {
            System.out.print("Introduce la temperatura en grados Celsius: ");
            double gradosCelsius = sc.nextDouble();

            double gradosKelvin = gradosCelsius + 273.15;

            System.out.println("La temperatura en grados Kelvin es: " + gradosKelvin);

            System.out.print("¿Repetir proceso? (S/N): ");
            respuesta = sc.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
    }
	
	public static void leerTablaDeMultiplicar() {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número entero N: ");
	        int N = sc.nextInt();

	        System.out.println("Tabla del " + N);
	        System.out.println("--------------");

	        for (int i = 1; i <= 10; i++) {
	            int resultado = N * i;
	            System.out.println(N + " * " + i + " = " + resultado);
	        }
	    }
	
	public static void leerNumeroNegativo() {
		  Scanner sc = new Scanner(System.in);

	        int numerosTerminadosEn2 = 0;

	        System.out.println("Introduce números (introduce un número negativo para finalizar):");

	        while (true) {
	            System.out.print("Número: ");
	            int numero = sc.nextInt();

	            if (numero < 0) {
	                break; // Salir del bucle si se ingresa un número negativo
	            }

	            // Comprobar si el número termina en 2
	            if (numero % 10 == 2) {
	                numerosTerminadosEn2++;
	            }
	        }

	        System.out.println("Se leyeron " + numerosTerminadosEn2 + " números terminados en 2.");
	    }
	
	public static void NumerosAmigos() {
	    
	        int numero1 = 220;
	        int numero2 = 284;

	        if (sonAmigos(numero1, numero2)) {
	            System.out.println(numero1 + " y " + numero2 + " son números amigos.");
	        } else {
	            System.out.println(numero1 + " y " + numero2 + " no son números amigos.");
	        }
	    }

	    // Función para calcular la suma de los divisores propios de un número
	    public static int sumaDivisoresPropios(int numero) {
	        int suma = 1; // Incluye 1 como divisor propio
	        for (int i = 2; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                suma += i;
	            }
	        }
	        return suma;
	    }

	    // Función para verificar si dos números son amigos
	    public static boolean sonAmigos(int numero1, int numero2) {
	        return (sumaDivisoresPropios(numero1) == numero2) && (sumaDivisoresPropios(numero2) == numero1);
	    }
	
	public static void serieFibonacci() {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce el valor de N para la serie de Fibonacci: ");
	        int N = sc.nextInt();

	        int[] fibonacciSerie = new int[N];

	        // Los primeros dos términos de la serie son 1
	        fibonacciSerie[0] = 1;
	        fibonacciSerie[1] = 1;

	        // Calcular los siguientes términos de la serie
	        for (int i = 2; i < N; i++) {
	            fibonacciSerie[i] = fibonacciSerie[i - 1] + fibonacciSerie[i - 2];
	        }

	        System.out.println("Los primeros " + N + " números de la serie de Fibonacci son:");
	        for (int i = 0; i < N; i++) {
	            System.out.print(fibonacciSerie[i] + " ");
	        }
	    }
	
	public static void decimalABinario() {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int numeroDecimal = sc.nextInt();

        String binario = decimalABinario(numeroDecimal);

        System.out.println("El número binario es: " + binario);
    }

    public static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero = numero / 2;
        }

        return binario.toString();
    }
	
	
		
	
	public static void decimalABinario2() {
		
		int numero = 20;
		System.out.println(Integer.toBinaryString(numero));
	}
	
		
	
	    public static int binaryToDecimal(String binary) {
	        int decimal = 0;
	        int exponent = 0;

	        // Recorre el número binario de derecha a izquierda.
	        for (int i = binary.length() - 1; i >= 0; i--) {
	            // Convierte el dígito binario en un entero.
	            int digit = Character.getNumericValue(binary.charAt(i));
	            // Multiplica el dígito por 2 elevado a la posición.
	            decimal += digit * Math.pow(2, exponent);
	            exponent++;
	        }

	        return decimal;
	    }

	   
	    public static String convertirANumerosRomanos(int numero) {
	    	
	        
	    	 if (numero < 1 || numero > 3999) {
	             return "Número fuera del rango válido (1-3999)";
	         }

	         String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	         String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	         String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	         String[] miles = {"", "M", "MM", "MMM"};

	         // Obtenemos las cifras del número
	         int unidad = numero % 10;
	         int decena = (numero / 10) % 10;
	         int centena = (numero / 100) % 10;
	         int millar = (numero / 1000);

	         // Construimos el número romano combinando las cifras
	         String numeroRomano = miles[millar] + centenas[centena] + decenas[decena] + unidades[unidad];

	         return numeroRomano;
	     }
	    
	    public static String cifrarCesar(String texto, int N) {
	        StringBuilder resultado = new StringBuilder();
	        for (int i = 0; i < texto.length(); i++) {
	            char caracter = texto.charAt(i);
	            if (Character.isLetter(caracter)) {
	                char base = Character.isUpperCase(caracter) ? 'A' : 'a';
	                resultado.append((char) ((caracter - base + N) % 26 + base));
	            } else {
	                resultado.append(caracter);
	            }
	        }
	        return resultado.toString();
	    }

	    public static String descifrarCesar(String texto, int N) {
	        return cifrarCesar(texto, 26 - N);
	    }

	    public static boolean esCapicua(int numero) {
	        String numeroStr = Integer.toString(numero);
	        String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();
	        return numeroStr.equals(numeroInvertido);
	    }
	    public static void comprobarCapitua() {
	    	Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número para comprobar si es capicúa: ");
	        int numero = scanner.nextInt();

	        if (esCapicua(numero)) {
	            System.out.println(numero + " es un número capicúa.");
	        } else {
	            System.out.println(numero + " no es un número capicúa.");
	        }
	        
	        scanner.close(); // Cerrar el scanner cuando hayas terminado de usarlo.
	    }
	
	    
			
		
	
	
	
	
	
public static void main(String[] args) {
	App app = new App();
	//app.m1InvertString("Que tal amigo");
	//app.m2InvertString("Buenas");
	//app.numeroCapicua(525);
	//app.contarCaracteres("Melón");
	//app.caracteresRepetidos("Holaaaa");
	//app.esMultiploDe2(13);
	//app.anyoBisiesto(2021);
	//pideNumero();
	//convierteAKelvin();
	//leerTablaDeMultiplicar();
	//leerNumeroNegativo();
	//NumerosAmigos();
	//serieFibonacci();
	//decimalABinario2();
	//decimalABinario();
	/*
	 String binaryNumber = "1100101"; // Cambia esto al número binario que quieras convertir.
     int decimalNumber = binaryToDecimal(binaryNumber);
     System.out.println("El número binario " + binaryNumber + " es igual a " + decimalNumber + " en decimal.");
     */
	/*
	Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un número entre 1 y 3999: ");
    int numero = scanner.nextInt();

    String numeroRomano = convertirANumerosRomanos(numero);
    System.out.println("El número romano equivalente es: " + numeroRomano);
	}
	*/

	/*
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingresa un texto: ");
    String texto = scanner.nextLine();

    System.out.print("Ingresa el valor de N: ");
    int N = scanner.nextInt();

    scanner.nextLine(); // Consumir el salto de línea

    System.out.print("¿Quieres codificar o decodificar? (c/d): ");
    char opcion = scanner.nextLine().charAt(0);

    String resultado = "";
    if (opcion == 'c') {
        resultado = cifrarCesar(texto, N);
    } else if (opcion == 'd') {
        resultado = descifrarCesar(texto, N);
    } else {
        System.out.println("Opción no válida. Debes elegir 'c' para codificar o 'd' para decodificar.");
        return;
    }

    System.out.println("Texto resultante: " + resultado);
	*/
	comprobarCapitua();
	}
}
