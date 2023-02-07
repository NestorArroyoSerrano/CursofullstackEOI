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

	public static void ejercicio13() { // Realiza una aplicación que nos pida un número de ventas a introducir, después
										// nos pedirá tantas ventas por teclado
		// como número de ventas se hayan indicado. Al final mostrará la suma de todas
		// las ventas. Piensa que es lo que se repite y lo que no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de ventas");
		int numVentas = sc.nextInt();

		/*
		 * Declaramos una variable para sumar las ventas, si lo declaramos dentro del
		 * bucle, no podriamos acceder fuera del bucle a la suma de las ventas. Esto es
		 * por el ámbito.
		 */
		int sumaVentas = 0;
		for (int i = 0; i < numVentas; i++) {
			// indico el numero de venta
			System.out.println("Introduce el precio de la venta " + (i + 1));
			int venta = sc.nextInt();

			// Acumulamos el valor de la venta
			sumaVentas = sumaVentas + venta;
		}

		System.out.println(sumaVentas);
	}

	public static void ejercicio14() { // Realiza una aplicación que nos calcule una ecuación de segundo grado. Debes
										// pedir las variables a, b y c por teclado y comprobar antes que el
		// discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa el
		// método sqlrt de Math. Te recomiendo que uses mensajes de traza.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor de a");
		int a = sc.nextInt();
		System.out.println("Introduce el valor de b");
		int b = sc.nextInt();
		System.out.println("Introduce el valor de c");
		int c = sc.nextInt();

		double discriminante = Math.pow(b, 2) - (4 * a * c);

		// Mensaje de traza
		System.out.println(">>" + discriminante);

		if (discriminante > 0) {
			// Tambien se puede hacer por parte si lo ves más facil
			// recuerda que debes tener en cuenta la prioridad de elementos
			double x1 = ((b * (-1)) + Math.sqrt(discriminante)) / (2 * a);
			double x2 = ((b * (-1)) - Math.sqrt(discriminante)) / (2 * a);

			System.out.println("El valor de x1 es " + x1 + " y el valor de x2 es " + x2);
		} else {
			System.out.println("El discriminante es negativo");
		}
	}

	public static void ejercicio15() { // Lee un número por teclado y comprueba que este numero es mayor o igual que
										// cero, si no lo es lo volverá
		// a pedir (do while), después muestra ese número por consola.
		int codigo;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce un número mayor que 0");
			codigo = Integer.parseInt(sc.nextLine());
		} while (codigo <= 0);

		System.out.println(codigo);
	}

	public static void ejercicio16() { // Escribe una aplicación con un String que contenga una contraseña cualquiera.
										// Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando
										// aciertes ya no pedirá mas la contraseña y mostrara un
		// mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3
		// intentos y si acierta sale, aunque le queden intentos)
		Scanner sc = new Scanner(System.in);
		String contra = "1234";
		final int INTENTOS = 3;

		boolean acierto = false;

		for (int i = 0; i < INTENTOS; i++) {
			System.out.println("Introduce contraseña");
			String password = sc.nextLine();

			if (password.equals(contra)) {
				System.out.println("Enhorabuena, has acertado");
				acierto = true;
			} else {
				System.out.println("Has fallado");
			}
		}
	}

	public static void ejercicio17() { // Crea una aplicación que nos pida un día de la semana y que nos diga si es un
										// dia laboral o no. Usa un switch para ello.

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un día de la semana");
		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("El día es el lunes");
			break;
		case 2:
			System.out.println("El día es el martes");
			break;
		case 3:
			System.out.println("El día es el miércoles");
			break;
		case 4:
			System.out.println("El día es el jueves");
			break;
		case 5:
			System.out.println("El día es el viernes");
			break;
		case 6:
			System.out.println("El día es el sábado");
			break;
		case 7:
			System.out.println("El día es el domingo");
			break;
			default:
				System.out.println("Introduce un número del 1 al 7");
		}
	}
	public static void ejercicio18() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime otro número");
		int numero2 = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i<10; i++) {
			int numeroAleatorio =(int)Math.floor(Math.random()*(numero1-numero2)+numero2);
			System.out.println(numeroAleatorio);
		}
		
	}
	public static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
        int numero=0;
        do{
            System.out.println("Introduce un numero");
            numero=sc.nextInt();
        }while(numero<0); int contador=0; for (int i=numero;i>0;i/=10){
            //Incrementamos el contador
            contador++;
        }
  
        //Controlamos en el caso de que haya una cifra o mas
        if (contador==1){
            System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+numero+ " tiene "+contador+" cifras");
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
		// ejercicio11();
		// ejercicio12();
		// ejercicio13();
		// ejercicio14();
		// ejercicio15();
		//ejercicio16();
		//ejercicio17();
		//ejercicio18();
		ejercicio19();

	}

}
