package holaMundo;

import java.util.Scanner;

/**
 * Esta es la clase inicial del curso
 * 
 * @author Néstor
 * @since 1.0
 */
public class holaMundo {

	public static void ejemplosComentarios() {
		/*
		 * Este es mi primer programa Néstor 17/01/2023
		 */
		System.out.println("Hola Néstor");
		System.out.println("Hola mundo");
		System.out.println("Segunda línea");
		System.out.println("Tercera línea");
		System.out.println("Otra línea");

	}

	private static void ejemplosTipos() {
		int numero = 5;
		int numero2 = 7;
		int suma = numero + numero2;
		int resta = numero2 - numero;
		double division = (double) numero2 / numero;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La división es: " + division);
		System.out.println("La división sobre la marcha es: " + ((double) numero2 / numero));
		// Número con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		System.out.println("La multiplicación es: " + decimales1 * decimales2);
		System.out.println("La suma es: " + (decimales1 + decimales2));
		double sumadecimales = numero + decimales1;
		System.out.println("Suma con decimales es: " + sumadecimales);
		// Enteros largos
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println("Suma de los dos números: " + (maxInt + minInt));
		long largo1 = 200000000;
		long largo2 = 100000000;
		System.out.println("La suma de dos largos correctamente es: " + (largo1 + largo2));
		char letraA = 'a';
		char letraB = 'b';
		System.out.println("La suma de letra A y letra B es: " + (letraA + letraB));
		System.out.println("La suma de letra A y letra B es: " + letraA + letraB);

	}

	private static void ejercicio1() {
		int numero1 = 36;
		int numero2 = 27;
		System.out.println(numero1 + numero2);

	}

	private static void ejercicio2() {
		int numero1 = 15;
		int numero2 = 4;
		int suma = numero1 + numero2;
		int resta = numero1 + numero2;
		int division = numero1 / numero2;
		int multiplicacion = numero1 * numero2;
		int resto = numero1 % numero2;
		System.out.println("15 + 4 = " + suma);
		System.out.println("15 - 4 = " + resta);
		System.out.println("15/4 = " + division);
		System.out.println("15*4 = " + multiplicacion);
		System.out.println("15%4 = " + resto);

	}

	public static void ejemplosString() {
		String cadena1; // String cadena1 = "Néstor"
		cadena1 = "Néstor";
		String cadena2 = "Hola", cadena3 = "adiós";
		String cadena4 = cadena2 + cadena1; // "HolaNéstor"
		String cadena5 = cadena2 + " " + cadena1; // "Hola Néstor"
		String prefijo = "34";
		String telefono = "666666666";
		int numero = 26;
		System.out.print(prefijo + "-" + telefono);
		System.out.println("Otra cosa");
		System.out.printf("%s tiene %d años", cadena1, numero); // Print formato

		String nestor = "Néstor";
		// String int = "String"; // Da error
		var generica = "Hola";
		var generica2 = 1;
		var generica3 = generica + generica2;
	}

	public static void ejemplosBoolean() {
		// Son valores que solo pueden almacenar true o false;
		boolean verdad = true;
		boolean falso = false;
		boolean comparacion1 = 10 < 20; // true
		System.out.println(10 < 20); // true
		System.out.println(comparacion1); // true
		// Condiciones de comparación <,>,<=,>=,==, !=, <>
		int numero1 = 10;
		int numero2 = 20;
		boolean c1 = 10 < 20; // true
		boolean c2 = 10 > 20; // false
		boolean c3 = 10 <= 20; // true
		boolean c4 = 10 >= 20; // false
		boolean c5 = 10 == 20; // false
		boolean c6 = 10 != 20; // true
		String cadena1 = "hola";
		String cadena2 = "adiós";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1.equals(cadena2)); // false
		System.out.println(cadena1.equals(cadena3)); // true
		System.out.println(cadena1.equals(cadena4)); // false
		boolean cadenasIguales = cadena1.equals(cadena2); // false
		numero1 = 5;
		double numero3 = 5.0;
		double numero4 = 5.1;
		System.out.println(numero1 == numero3); // true o false? -> true
		System.out.println(numero1 == numero4); // true o false? -> false
		System.out.println((11 / 2) == numero1); // true o false? -> true
		System.out.println((11.0 / 2) == numero1); // true o false? -> false
		System.out.println((11 % 2) == 1); // true o false? -> true
		System.out.println((11 % 2) == 0); // true o false? -> false
		System.out.println(23 % 4); // el resto da 3
	}

	public static void tablasVerdad() {
		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe");
		System.out.println(esPepeMayor); // true

		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10)
				|| (sexo.equals("Femenino") && anyosCarnet > 5);
		System.out.println(tieneDescuento); // false

	}

	public static void ejercicio3() {
		int valor1 = 10, valor2 = 10;
		System.out.println(valor1 < valor2); // (valor1 + " es menor que " + valor2 + ": " + (valor1<valor2));
		System.out.println(valor1 == valor2); // (valor1 + " es igual que " + valor2 + ": " + (valor1==valor2)); /
												// System.out.printf("%d y %d son iguales: %b \n", valor1, valor2,
												// valor1==valor2);
		System.out.println(valor1 >= valor2);
	}

	public static void ejercicio5() {
		int N = 1;
		System.out.println("Valor inicial de N = " + N);
		N = N + 77; // N+= 77; N = 78
		System.out.println("N + 77 = " + N);
		N = N - 3; // N-= 3; N = 75
		System.out.println("N -3 = " + N);
		N = N * 2; // N*= 2; N = 150
		System.out.println("N * 2 = " + N);

	}

	public static void ejemplosIncrementosDecrementos() {
		int numero = 10;
		// pre-incrementos
		++numero; // 11
		System.out.println(numero); // 11
		// post-incremento
		numero++; // 12
		System.out.println(numero); // 12
		// pre-decrementos
		--numero; // 11
		System.out.println(numero); // 11
		// post-decremento
		numero--; // 10
		System.out.println(numero); // 10
		//// LO IMPORTANTE ES EL MOMENTO EN QUE INCREMENTA O DECREMENTA
		System.out.println(++numero); // 11 y número = 11
		System.out.println(numero++); // 11 y número = 12
		System.out.println(numero); // 12

		System.out.println(++numero + numero++); // 26 (13 + 13) y luego numero=14 // a+b = b+a
		System.out.println(numero++ + ++numero); // 26 (13 + 13) y luego numero=14 // a+b = b+a
		System.out.println(numero); // 14
		int numero2 = ++numero; // numero2 = 15; numero = 15;
		System.out.println("numero2 = " + numero2 + " numero = " + numero);
		int numero3 = numero++; // numero3 = 15; numero = 16;
		System.out.println("numero2 = " + numero3 + " numero = " + numero);
	}

	public static void ejemplosConstantes() {
		final double IVA = 0.21;
		final double PI = 3.1416;
		double precioVaquero = 50;
		System.out.println("El precio final es: " + (precioVaquero * (1 + IVA)));
		// PI = 3.14159
	}

	public static void conversionesNumerosCadenas() {
		int numero = 10;
		String cadena = "11";
		System.out.println(cadena + numero); // 1110
		// Convertir cadena a número
		System.out.println(Integer.parseInt(cadena) + numero); // 21
		int prefijo = 34;
		int telefono = 666666666;
		System.out.println(prefijo + telefono); // 666666700
		System.out.println("" + prefijo + telefono); // 34666666666
		// Convertir número a cadena
		System.out.println(String.valueOf(prefijo) + String.valueOf(telefono)); // 34666666666
		System.out.println("00" + prefijo + "-" + telefono); // 0034-666666666
	}

	public static void ejercicio6() {
		//Ejemplo para almacenar valores iniciales de variables que podrán cambiar en el código
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		final int auxB = B; //2

		System.out.println("Valores iniciales: A=" + A + " B=" + B + " C=" + C + " D=" + D);
		B=C;
		System.out.println("B toma el valor de C -> B = " + B);
		C=A;
		System.out.println("C toma el valor de A -> C = " + C);
		A=D;
		System.out.println("A toma el valor de D -> A = " + A);
		D=auxB;
		System.out.println("D toma el valor de B -> D = " + D);

	}
	public static void ejemplosSaltos() {
		//System.out.println("Hola\n\tNéstor\nBien?");
		System.out.println("Elige una opción"); 
		System.out.println("\t1) Añadir producto"); 
		System.out.println("\t2) Borrar producto");
		
	}
	public static void ejemplosFormateos() {
		String nestor = "Néstor";
		String consuelo = "Consuelo";
		String pepe = "Pepe";
		double salario1 = 95567.89;
		double salario2 = 2589.3674;
		double salario3 = 234.23;
		System.out.printf("%12s%14s\n","NOMBRE","SALARIO");
		System.out.println("-------------------------");
		System.out.printf("%12s%14f€\n",nestor,salario1);
		System.out.printf("%12s%14f€\n",consuelo,salario2);
		System.out.printf("%12s%14f€\n",pepe, salario3);
	}
	public static void ejemplosScanner() { //Leer de la consola
		Scanner sc = new Scanner(System.in); // abro consola
		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine(); //En nombre tendré lo que ponga por pantalla 
		System.out.println("Introduzca su localidad");
		String localidad = sc.nextLine();
		System.out.println("Introduzca su salario");
		double salario = sc.nextDouble();
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Introduzca cuanto desearía ganar");
		double deseado = sc.nextDouble();
		sc.nextLine();
		System.out.println("Hola " + nombre + " me encanta " + localidad + " este es tu salario " + salario + " este es el salario que desearía ganar " + deseado);
		sc.close(); // cerrar el Scanner
	}
	public static void ejemplosScanner2() {
		Scanner sc = new Scanner(System.in); // abro consola
		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine(); //En nombre tendré lo que ponga por pantalla 
		System.out.println("Introduzca su localidad");
		String localidad = sc.nextLine();
		System.out.println("Introduzca su salario");
		double salario = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine(); // Limpiar el buffer
		System.out.println("Introduzca cuanto desearía ganar");
		double deseado = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		System.out.println("Hola " + nombre + " me encanta " + localidad + " este es tu salario " + salario + " este es el salario que desearía ganar " + deseado);
		sc.close(); // cerrar el Scanner
		
		
	}
	public static void ejercicio15() {
		Scanner sc = new Scanner(System.in);
		final double IVA = 0.21;
		System.out.println("Producto 1:");
		String producto1 = sc.nextLine();
		System.out.println("Precio 1:");
		double precio1 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		System.out.println("Producto 2:");
		String producto2 = sc.nextLine();
		System.out.println("Precio 2:");
		double precio2 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		System.out.println("Producto 3:");
		String producto3 = sc.nextLine();
		System.out.println("Precio 3:");
		double precio3 = Double.parseDouble(sc.next().replace(',', '.'));
		sc.nextLine();
		
		//impresión de datos
		
		System.out.printf("-------------------------------------------\n");
		System.out.printf("%-15s%12s%12s\n", "NOMBRE", "PRECIO", "IVA");		
		System.out.printf("%-15s%12.2f€%12.2f\n", producto1,precio1,precio1*(1+IVA));
		System.out.printf("%-15s%11.2f€%12.2f\n", producto2,precio2,precio2*(1+IVA));
		System.out.printf("%-15s%11.2f€%12.2f\n", producto3,precio3,precio3*(1+IVA));
		sc.close();
	}
		
	public static void main(String[] args) {
		// ejemplosComentarios();
		// ejemplosTipos();
		// ejercicio1();
		// ejercicio2();
		// ejemplosString();
		// ejemplosBoolean();
		// ejercicio3();
		// tablasVerdad();
		// ejercicio5();
		// ejemplosIncrementosDecrementos();
		// ejemplosConstantes();
		//conversionesNumerosCadenas();
		//ejercicio6();
		//ejemplosSaltos();
		//ejemplosFormateos();
		//ejemplosScanner();
		//ejemplosScanner2();
		ejercicio15();

	}

}