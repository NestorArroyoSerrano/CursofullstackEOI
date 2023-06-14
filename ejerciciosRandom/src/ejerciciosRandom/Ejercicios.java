package ejerciciosRandom;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.Random;
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
	public static void dibujaAsteriscos(int n) {
		
		for (int i=0; i<n; i++) {
			System.out.print("*");
		}
	}
	
	public static void recibeCadena (String cadena, int n1, int n2) {
		System.out.println(cadena.length()>=n1 && cadena.length()<=n2?
				"Sí está entre los dos valores" : "No está entre los 2 valores");
	}
	
	public static void dibujaCuadrado(char c, int n) {
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	public static void mostrarTrabajo(String nombre, String...trabajos) {
		
		System.out.println(nombre +":");
		if(trabajos.length==0) {
			System.out.println("Esta persona no ha trabajado nunca");
		}else {
			for(int i=0; i<trabajos.length; i++) {
				System.out.println(trabajos[i]);
			}
			
		}
	
	}
	public static boolean esPrimo1(int numero) {
		
		boolean primo = true;
		for(int i=2;i<numero/2 && primo; i++) {
			
			if(numero%i==0) 
				primo=false;
			}
		return primo;
			}
		
	public static int alReves(int numero) {
		
		String cadena= numero+"";
		String nuevaCadena= "";
		for(int i=0; i<cadena.length(); i++) {
			
			nuevaCadena=cadena.charAt(i)+nuevaCadena;			
		}
		return Integer.parseInt(nuevaCadena);
	}
	public static boolean esEmirp (int numero) {
		int numeroAlReves=alReves(numero);
		return esPrimo(numero) && esPrimo(numeroAlReves);
	}
	public static int cuantasCifras (int numero) {
		int contador=1;
		
		while(numero/10!=0) {
			contador++;
			numero/=10;
		}
		return contador;
	}
	public static int alReves2(int numero) {
		int exponente=cuantasCifras(numero)-1;
		int resultado=0;
		int resto=0;
		while(numero/10!=0) {
			resto=numero%10;
			numero/=10;
			resultado+=resto*Math.pow(10, exponente);
			exponente--;
		}
		return resultado+numero;
	}
	
	public static double devuelveMedia(int [] numeros) {
		int suma=0;
		if(numeros.length!=0) {
			
		}
		for(int i=0; i<numeros.length; i++) {
			suma+=numeros[i];
		}
		return (double)suma/numeros.length;
		
	
	}
	public static String obtenCadena(String [] cadenas) {
		return cadenas[new Random().nextInt(cadenas.length)];
	}
	public static double calculaMediaPF(int [] numeros) {
		OptionalDouble resultado = Arrays.stream(numeros).average();
		double media=0;
		if(resultado.isPresent()) {
			media=resultado.getAsDouble();
		}
		return media;
	}
	
	public static int devuelveMaximo (int...numeros) {		
		int maximo;
		if(numeros.length==0) {
			maximo=0;
		
		} else {
		maximo=numeros[0];
		for(int i=1; i<numeros.length;i++) {
			maximo=Math.max(maximo,  numeros[i]);
			
			}
		}
		return maximo;
	}
	
	public static void ejercicioIfElse() {
		int numero = -5;
		
		if(numero>0) {
			System.out.println("El numero es mayor que 0");
		}else {
			System.out.println("El número es menor que 0");
		}
	}
	
	/*
	 * Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle si lo ha hecho correctamente o no.
	 */
	
	public static void pideUsuario() {
		int numero;
		Scanner sc =  new Scanner (System.in);
		System.out.println("Introduce el número 12");
		numero = sc.nextInt();
		
		if(numero==12) {
			System.out.println("El número introducido es correcto");
		} else {
			System.out.println("El número introducido no es correcto");
		}
	}
		
		/*
		 *  Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero), 
		 *  si es negativo (menor que cero) o si, por el contrario, es exactamente 0 (necesitarás enlazar 2 "if" uno tras otro).
		 */
		
		public static void pideUsuario2() {
			int numero;
			Scanner sc = new Scanner(System.in);
			System.out.println("Dime un número entero");
			numero = sc.nextInt();
			
			if(numero>0) {
				System.out.println("El número es positivo");
				
			}
				else if(numero<0) {					
					System.out.println("El número es negativo");
				}
					else {
					System.out.println("El número es exactamente 0");
				}
		}
		/*
		 * Ejercicio propuesto 5.3.3: Crea un programa que pida dos números reales al usuario y diga cuál es el mayor de ellos.
		 */
		public static void pideUsuario3() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime un número");
			int numero = Integer.parseInt(sc.nextLine());
			System.out.println("Dime otro número");
			int numero2 = Integer.parseInt(sc.nextLine());
			
			
			if(numero>numero2) {
				System.out.println(" El número " + numero + " es mayor ");
			}
			else {
				System.out.println(" El número " +numero2 + " es mayor ");
			}
		}
		/*
		 * Ejercicio propuesto 5.3.4: Crea un programa que pida al usuario y diga si ese número es múltiplo de 3 
		 * (pista: puedes utilizar la operación "módulo", el "resto de la división": %)
		 */
				
		public static void multiploDe3() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime un número");
			int numero = Integer.parseInt(sc.nextLine());
			
			if(numero%3==0) {
				System.out.println("El número elegido es múltiplo de 3");
			}else {
					System.out.println("El número no es múltiplo de 3");
				}
			sc.close();
			}
		
		/*
		 * Ejercicio propuesto 5.3.5: Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
		 */
		public static void esImpar() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime un número");
			int numero = sc.nextInt();
			
			if(numero%2==0) {
				 System.out.println("El número es par");
			} else {
					 System.out.println("El número es impar");
				 }
			sc.close();
			}
		/*
		 * Ejercicio propuesto 5.4.1: Crea un programa que pida al usuario dos números enteros y diga si los dos son positivos (el primero Y el segundo).
		 */
		public static void pideDosNumeros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número");
		int numero = Integer.parseInt(sc.nextLine());		
		System.out.println("Dime otro número");
		int numero2 = Integer.parseInt(sc.nextLine());
		
			if (numero>0 && numero2>0) {
				System.out.println("Ambos números son positivos");
			}else {
				System.out.println("Al menos uno de los dos números no es positivo");
					
				}
			sc.close();
			}
		/*
		Ejercicio propuesto 5.4.2: Crea un programa que pida al usuario dos números enteros y diga si al menos uno de los dos es positivo (el primero O el segundo).	
		*/
		public static void alMenos1() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime un número");
			int numero = sc.nextInt();
			System.out.println("Dime otro número");
			int numero2 = sc.nextInt();
			
			if(numero>0 || numero2>0) {
				System.out.println("Al menos uno de ellos es positivo");
				
			} else {
				System.out.println("Ninguno es positivo");
			}
			sc.close();
		}
		/*
		 * Ejercicio propuesto 5.4.3: Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
		 */
		
		public static void cuantosPares() {
			   Scanner sc = new Scanner(System.in);
			      int pares = 0;
			      
			      System.out.println("Introduce dos números enteros:");
			     int  num1 = sc.nextInt();
			     int  num2 = sc.nextInt();
			      
			      if (num1 % 2 == 0) {
			         pares++;
			      }
			      
			      if (num2 % 2 == 0) {
			         pares++;
			      }
			      
			      String mensaje = "De los dos números introducidos, ";
			      mensaje += (pares == 0) ? "ninguno es par." : (pares == 1) ? "sólo uno es par." : "ambos son pares.";

			      System.out.println(mensaje);
			   }
			/*
			 * Ejercicio propuesto 5.4.4: Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
			 */
		
		/*
		 *  Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes. Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".
		 */
		public static void pide3Numeros() {			
			Scanner sc = new Scanner (System.in);
			System.out.println("Dime 3 números");
			int numero = sc.nextInt();
			int numero2 =sc.nextInt();
			int numero3 = sc.nextInt();
			
			if(numero>numero2 && numero>numero3) {
				System.out.println(numero + " Es el mayor de los 3 ");
			}else if(numero2>numero && numero2>numero3) {
				System.out.println(numero2 + " Es el mayor de los 3 ");
			}else if(numero==numero2 || numero==numero3 || numero2==numero3){
				System.out.println("Hay al menos dos números iguales");
			}else {
					System.out.println(numero3 + " Es el mayor de los 3 ");
				}
				 
			 }
		/*
		 * Ejercicio propuesto 5.5.2: Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario. 
		 * Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
		 */
		public static void pideUnMes() {
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce un número");
			int numero = sc.nextInt();
			
			switch(numero) {
			case 1:
				System.out.println("El mes introducido es enero");
				break;
				
			case 2:
				System.out.println("El mes introducido es febrero");
				break;
				
			case 3:
				System.out.println("El mes introducido es marzo");
				break;
				
			case 4:
				System.out.println("El mes introducido es abril");
				break;
				
			case 5:
				System.out.println("El mes introducido es mayo");
				break;
				
			case 6:
				System.out.println("El mes introducido es junio");
				break;
				
			case 7:
				System.out.println("El mes introducido es julio");
				break;
				
			case 8:
				System.out.println("El mes introducido es agosto");
				break;
				
			case 9:
				System.out.println("El mes introducido es septiembre");
				break;
				
			case 10:
				System.out.println("El mes introducido es octubre");
				break;
				
			case 11:
				System.out.println("El mes introducido es noviembre");
				break;
				
			case 12:
				System.out.println("El mes introducido es diciembre");
				break;
				
			}
		}
		/*
		 * Ejercicio propuesto 5.5.2: Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario. 
		 * Por ejemplo, si el usuario introduce 3, deberá escribir "tres".
		 */
		public static void pasaATexto() {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Escribe un número del 1 al 10 con números");
			int numero = sc.nextInt();
			
			switch(numero) {
			case 1:
			System.out.println("Uno");
			break;		
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;		
			case 4:
				System.out.println("Cuatro");
				break;
			case 5:
				System.out.println("Cinco");
				break;		
			case 6:
				System.out.println("Seis");
				break;
			case 7:
				System.out.println("Siete");
				break;		
			case 8:
				System.out.println("Ocho");
				break;
			case 9:
				System.out.println("Nueve");
				break;		
			case 10:
				System.out.println("Diez");
				break;
			}
		}
		/*
		 * Ejercicio propuesto 5.6.1: Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 
		 * si ese número es par o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".
		 */
			public static void parTernario() {
				/*
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número");
				int numero = sc.nextInt();
				
				if(numero%2==0) {
					System.out.println("Se le asigna el valor 1");
				}else {
					System.out.println("Se le asigna el valor 0");
				}
			}
			*/
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número");
				int numero = sc.nextInt();
				
				System.out.println((numero%2==0? "El numero es valor 1": "El valor es 0"));
				
				
			}
			
			/*
			 * Ejercicio propuesto 5.6.2: Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", 
			 * que tenga el valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".
			 */
			public class MenorNumero {
			    public static void main(String[] args) {
			        Scanner sc = new Scanner(System.in);
			        byte num1, num2, menor;
			        
			        System.out.println("Introduce dos números de tipo byte:");
			        num1 = sc.nextByte();
			        num2 = sc.nextByte();
			        
			        // Solución con un "if"
			        if (num1 < num2) {
			            menor = num1;
			        } else {
			            menor = num2;
			        }
			        System.out.println("El menor número es: " + menor);
			        
			        // Solución con el operador condicional
			        menor = (num1 < num2) ? num1 : num2;
			        System.out.println("El menor número es: " + menor);
			    }
			}
			/*
			 * Ejercicio propuesto 6.1.1: Crea un programa que muestre los números del 1 al 10, usando "while"
			 */
			
			public static void bucleWhile() {
				
				int numero = 1;
				
				while(numero<=10) {
					System.out.println(numero);
					numero++;
					
				}
				
			}
			/*
			 * Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "while"
			 */
			public static void numerosPares() {
				int numero = 20;
				
				while(numero>=2) {
					if(numero%2==0)
					System.out.println(numero);
					numero--;
				}
			}
			/*
			 * Crea un programa que muestre la "tabla de multiplicar del 5", usando "while"
			 */
	
			public static void tablaDel5() {
				int numero = 5;
				
				while (numero<=50) {
					if(numero%5==0)
						System.out.println(numero);
					numero++;
				}
			}
			
			/*
			 *  Crea un programa que pida al usuario un número entero y muestre su cuadrado. 
			 *  Se repetirá mientras el usuario introduzca un número distinto de cero.
			 */
		
			public static void muestraCuadrado() {
				Scanner sc = new Scanner (System.in);
			        int num;
			        
			        do {
			            System.out.print("Introduce un número entero (0 para salir): ");
			            num = sc.nextInt();
			            if (num != 0) {
			                int cuadrado = num * num;
			                System.out.println("El cuadrado de " + num + " es: " + cuadrado);
			            }
			        } while (num != 0);
			    }
			
			/*
			 *  Crea un programa que pida al usuario su contraseña (un número entero). Se repetirá mientras introduzca una contraseña distinta de "1234".
			 */
				
			public static void usuarioContrasenya() {
				
				Scanner sc = new Scanner (System.in);
				int contrasenya;
				
				do {
					System.out.println("Introduce otra contraseña (1234 si quieres salir)");
					contrasenya = sc.nextInt();
					
				}while(contrasenya!=1234);
					System.out.println("Contraseña correcta. Acceso concedido");
				}
				
			/*
			 *  Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero). 
			 *  Se repetirá mientras el usuario introduzca un login distinto de "1809" o una contraseña distinta de "1234".
			 */
			
			public static void pideLogin() {
				Scanner sc = new Scanner (System.in);
				int login;
				int contrasenya;
				
				do {
					System.out.println("Introduce tu contraseña (1234 si quieres salir)");
					contrasenya = Integer.parseInt(sc.nextLine());
					System.out.println("Introduce tu login (1809 si quieres salir)");
					login = Integer.parseInt(sc.nextLine());
				}while(login!=1809 && contrasenya!=1234);
				System.out.println("Contraseña o login correcto // Ambos correctos");
			}
			/*
			 * Crea un programa que escriba en pantalla tantos asteriscos como el usuario indique, todos ellos en la misma línea.
			 */
			
			public static void dibujaAsteriscos() {
				
				Scanner sc = new Scanner (System.in);
				System.out.println("Di un número para escribirlo con asteriscos (*)");
				int numero = sc.nextInt();
				
				int i = 0;
				while(i<numero) {
					System.out.print("*");
					i++;
					
				}
				System.out.println();
				
				
			}
			/*
			 * Crea un programa que muestre los números del 1 al 10, usando "do-while"
			 */
			public static void muestraNumeros() {
				int i = 1;
		        do {
		            System.out.println(i);
		            i++;
		        } while (i <= 10);
		    }
		
			/*
			 * Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "do-while"
			 */
				
			public static void numerosPares2() {
				
				int numero = 20;
				
				do {
					if (numero%2==0) {
						System.out.println(numero);
					}
					numero-=2;
					
				}while(numero>=2);
				
			}
			
			/*
			 * Crea un programa que muestre la "tabla de multiplicar del 5", usando "do-while"
			 */
				
			public static void tablaDel5DoWhile() {
				
				   int i = 1;
			        do {
			            int resultado = i * 5;
			            System.out.println("5 x " + i + " = " + resultado);
			            i++;
			        } while (i <= 10);
			    }
			/*
			 * Crea un programa que pida al usuario dos números enteros y muestre su suma. 
			 * Se repetirá hasta que los dos sean 0. Emplea do-while.
			 */
				
				
			public static void pideDosNumeros2() {
				
				
				 Scanner sc = new Scanner(System.in);
			        int num1, num2, suma;

			        do {
			            System.out.print("Introduce el primer número: ");
			            num1 = sc.nextInt();

			            System.out.print("Introduce el segundo número: ");
			            num2 = sc.nextInt();

			            suma = num1 + num2;
			            System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
			        } while (num1 != 0 && num2 != 0);
			        sc.close();
			    }
			
			/*
			 * Crea un programa que pida al usuario su login (un número entero) y su contraseña (otro número entero). 
			 * Se repetirá hasta que el usuario introduzca como login "1809" y como contraseña "1234". En esta ocasión, hazlo con do-while.
			 */
			public static void pideLogin2() {
				Scanner sc =  new Scanner (System.in);
				int login;
				int contrasenya;
			
				
				do {
					System.out.println("Dime tu login");
					 login = sc.nextInt();
					System.out.println("Dime tu contraseña");
					 contrasenya = sc.nextInt();
				}while (login!=1809 && contrasenya!=1234);
				System.out.println("Has puesto 1809 y 1234 para salir.");
			}
			/*
			 *  Crea un programa que pida un número de tipo byte al usuario y 
			 *  escriba en pantalla un cuadrado formado por asteriscos, que tendrá como alto y ancho la cantidad introducida por el usuario.
			 */
			
			public static void pideByte() {
			    Scanner sc = new Scanner(System.in);

		        System.out.print("Introduce un número: ");
		        byte num = sc.nextByte();

		        int i = 1;
		        do {
		            int j = 1;
		            do {
		                System.out.print("* ");
		                j++;
		            } while (j <= num);
		            System.out.println();
		            i++;
		        } while (i <= num);
		    }
			/*
			 * Crea un programa que muestre los números del 1 al 15, usando "for"
			 */
			public static void muestraDel1Al15() {
				
				int numero;
				for ( numero = 1; numero<=15; numero++) {
				System.out.println(numero);
			}
	
			}
			/*
			 * Crea un programa que muestre los números pares del 20 al 2, decreciendo, usando "for"
			 */
			public static void muestraPares() {
				
			
			
			for (int i=20; i>=2;  i=i-2) {
				System.out.println(i);
			}
			
			}
			
			/*
			 *  Crea un programa que muestre la "tabla de multiplicar del 5", usando "for"
			 */
			
			public static void tablaDel5For() {
				
				for(int i = 5; i<=50; i+=5) {
					System.out.println(i);
				}
			}
			/*
			 * Crea un programa que muestre los números enteros del 0 al 100 que son múltiplos de 6 (el resto al dividir por 6 sea 0)
			 */
			public static void multiplosDe6() {
				
				for (int i = 0; i<=100; i++) {
					if(i%6==0) {
					System.out.println(i);
					}
				}
			}
			/*
			 *  Crea un programa que muestre los números enteros entre 0 y el que introduzca el usuario 
			 *  que sean múltiplos de 3 (el resto al dividir por 3 es 0) y a la vez múltiplos de 7 (ídem).
			 */
			public static void muestraNumeros2() {
				
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número");
				int numero = Integer.parseInt(sc.nextLine());
				
				
				for(int i=0; i<=numero;i++) {
					if(i%3==0 && i%7==0) {
						System.out.println(i);
					}
				}
			}
			/*
			 * Crea un programa que pida dos números de tipo byte al usuario y escriba en pantalla un rectángulo 
			 * formado por asteriscos, que tendrá como alto el primer número y como ancho el segundo número.
			 */

			public static void dibujaAsteriscosByte() {
				
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número para el alto del rectángulo");
				byte alto = sc.nextByte();
				System.out.println("Dime un número para el ancho del rectángulo");
				byte ancho = sc.nextByte();
				
				for(int i = 0; i<alto; i++) {
					for(int j = 0; j<ancho; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			/*
			 * Crea un programa que pida un número de tipo byte al usuario y escriba en pantalla un cuadrado hueco de ese ancho, 
			 * que tendrá un borde formado por asteriscos y su interior serán espacios en blanco. Por ejemplo, para un tamaño de 4 sería:
			 */
			
			public static void cuadradoHueco() {
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número para el ancho del rectángulo");
				byte ancho = sc.nextByte();
				
				for(int i = 0; i<ancho; i++) {
					for(int j = 0; j<ancho; j++) {
						if(i==0 || i==ancho-1 || j==0 || j==ancho-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
						}
						
					}
					System.out.println();
				}
					
				
			}
			/*
			 * Crea un programa que pida al usuario un número entero largo y muestre cuáles son sus divisores 
			 * (aquellos entre los que se puede dividir, obteniendo como resto 0).
			 */
			public static void muestraDivisores() {
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número entero largo");
				long numero = sc.nextInt();
				
				
				for(long i = 1; i<=numero; i++) {
					if(numero%i==0) {
						System.out.println(i);
					}
				}
			}
			/*
			 * Crea un programa que pida al usuario un número entero largo y diga si es primo (si sólo es divisible entre 1 y él mismo).
			 */
			
			public static void esPrimo2() {
				
				    Scanner sc = new Scanner(System.in);
			        System.out.print("Introduce un número entero largo: ");
			        long numero = sc.nextLong();
			        boolean esPrimo = true;
			        for (long i = 2; i < numero; i++) {
			            if (numero % i == 0) {
			                esPrimo = false;
			                break;
			            }
			        }
			        if (esPrimo && numero > 1) {
			            System.out.println(numero + " es primo.");
			        } else {
			            System.out.println(numero + " no es primo.");
			        }
			    }
			/*
			 * Crea un programa que pida al usuario dos números enteros largos y diga cuántos números primos hay entre ellos (ambos incluidos).
			 */
			
			public static void cuantosPrimos() {
				
			 	Scanner sc = new Scanner(System.in);
		        System.out.print("Introduce el primer número entero largo: ");
		        long numero1 = sc.nextLong();
		        System.out.print("Introduce el segundo número entero largo: ");
		        long numero2 = sc.nextLong();
		        int contador = 0;
		        for (long i = numero1; i <= numero2; i++) {
		            boolean esPrimo = true;
		            for (long j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    esPrimo = false;
		                    break;
		                }
		            }
		            if (esPrimo && i > 1) {
		                contador++;
		            }
		        }
		        System.out.println("Hay " + contador + " números primos entre " + numero1 + " y " + numero2 + ".");
		    }
			
			/*
			 *  Crea un programa que muestre los números del 1 al 20, excepto el 15, usando "for" y "continue"
			 */
			
			public static void muestraMenos15() {
				
				        for (int i = 1; i <= 20; i++) {
				            if (i == 15) {
				                continue; // Saltar al siguiente ciclo si el número es 15
				            }
				            System.out.print(i + " "); // Imprimir el número actual
				        }
				    }
				
			/*
			 *  Crea un programa que muestre los números del 1 al 10, usando "for" que vaya del 1 al 20 y "break"
			 */
			public static void muestraBreak() {
				  
				        for (int i = 1; i <= 20; i++) {
				            if (i > 10) {
				                break; // Salir del bucle si el número es mayor que 10
				            }
				            System.out.print(i + " "); // Imprimir el número actual
				        }
				    }
			/*
			 *  Crea un programa que pida al usuario un número entero y, si es par, dé el valor "true" 
			 *  a una variable booleana llamada "esPar"; es caso contrario, le dará el valor "false".
			 */
				
			public static void siEsPar() {
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime un número entero");
				
				int numero = sc.nextInt();
				
				boolean esPar=false;
				
				if(numero%2==0) {
					esPar = true;
			
				}
				System.out.println("El número " + numero + " es par: " +esPar);
				
				sc.close();
	}
			
		
			/*
			 * Crea un programa que escriba un triángulo con las letras de tu nombre, 
			 * mostrando primero la primera letra, luego las dos primeras y así sucesivamente, hasta llegar al nombre completo, como en este ejemplo:
			 */
			public static void trianguloNombre() {
				
				String nombre = "Néstor";
				for (int i = 1; i<nombre.length()+1; i++) {
					for (int j = 0; j<i;j++) {
						System.out.print(nombre.charAt(j));
					}
					System.out.println();
				}
			}
			/*
			 *  Crea un programa que pida su nombre al usuario y lo escriba con un espacio entre cada par de letras. 
			 *  Por ejemplo, a partir de "Nacho" escribiría "N a c h o " (Pista: tendrás que usar "charAt" y un bucle "for")
			 */
			public static void nombreEspacios() {
				Scanner sc = new Scanner (System.in);
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				
				for (int i = 0; i<nombre.length(); i++) {
					System.out.print(nombre.charAt(i) + " ");
				}
			}
			/*
			 *  Crea un programa que pida su nombre al usuario y lo escriba con al revés. Por ejemplo, a partir de "Nacho" escribiría "ohcaN".
			 */
			public static void nombreAlReves() {
				  Scanner sc = new Scanner(System.in);

			        System.out.print("Introduce tu nombre: ");
			        String nombre = sc.nextLine();

			        String nombreAlReves = "";

			        for (int i = nombre.length() - 1; i >= 0; i--) {
			            nombreAlReves += nombre.charAt(i);
			        }

			        System.out.println("Tu nombre al revés es: " + nombreAlReves);
			        sc.close();
			    }
			/*
			 *  Crea un programa que pida su nombre al usuario y lo escriba con la primera letra en mayúsculas y el resto en minúsculas.
			 *   Por ejemplo, a partir de "nAcho" escribirá "Nacho".
			 */
			public static void nombreLetraMayuscula() {
				 Scanner sc = new Scanner(System.in);
			     System.out.print("Introduce tu nombre: ");
			     String nombre = sc.nextLine();
			     
			     // Convertir la primera letra a mayúsculas y el resto a minúsculas
			        String nombreFormateado = nombre.substring(0,1).toUpperCase() + nombre.substring(1).toLowerCase();
			        
			        System.out.println("Tu nombre en mayúsculas y minúsculas es: " + nombreFormateado);
			    }
			/*
			 * Crea un programa que pida su nombre al usuario tantas veces como sea necesario, hasta que escriba "nacho" (o el nombre que tú prefijes en el programa). 
			 * Deberá permitir que ese nombre se introduzca tanto en mayúsculas como en minúsculas. Cuando introduzca el nombre correcto, se le saludará y terminará el programa.
			 */
			
			public static void escribeNacho() {
				Scanner sc = new Scanner (System.in);
				
				String nombre;
				do {
					System.out.println("Escribe Nacho si quieres salir");
					 nombre = sc.nextLine();
					
				}while(!nombre.equalsIgnoreCase("nacho"));
				System.out.println("Hola, Nachete!");
					
				sc.close();
				}
			/*
			 * Ejercicio propuesto 7.3.2.1: Crea un programa que pida su nombre al usuario y lo escriba con al revés, usando un StringBuilder. 
			 * Por ejemplo, a partir de "Nacho" escribiría "ohcaN".
			 */
			
			public static void escribeNachoAlReves() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Dime tu nombre");
				String nombre = sc.nextLine();
				
				StringBuilder nombreAlReves = new StringBuilder(nombre);
				nombreAlReves.reverse();
				
				System.out.println("Tu nombre al revés es " + nombreAlReves.toString());
				
			}
			
			/*
			 * Crea un programa que pida su nombre al usuario y cambie la primera letra por una "A", 
			 * excepto en el caso de que ya fuera una "A", y entonces se convertiría en una "B".
			 */
			public static void cambiaPrimera() {
				
					Scanner sc = new Scanner(System.in);
					System.out.println("Ingresa tu nombre: ");
			        String nombre = sc.nextLine();
			        
			        char primeraLetra = nombre.charAt(0);
			        
			        if (primeraLetra == 'A') {
			            primeraLetra = 'B';
			        } else {
			            primeraLetra = 'A';
			        }
			        
			        StringBuilder sb = new StringBuilder(nombre);
			        sb.setCharAt(0, primeraLetra);
			        String nuevoNombre = sb.toString();
			        
			        System.out.println("Tu nuevo nombre es: " + nuevoNombre);
			    }
				
			/*
			 * Crea un programa que pida su nombre al usuario y cree una nueva cadena de texto formada por "Don " seguido del nombre. 
			 * Hazlo de dos formas: primero concatenando dos cadenas y luego usando "insert" en un StringBuilder.
			 */
			public static void nombreDon() {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingresa tu nombre: ");
	        String nombre = sc.nextLine();
	        //System.out.println("Don " + nombre);
	        
	        StringBuilder sb = new StringBuilder(nombre);
	        sb.insert(0, "Don ");
	        System.out.println(sb);
			}
			
			/*
			 * Crea un programa que pida su nombre al usuario y convierta las letras 
			 * impares a mayúsculas y las pares a minúsculas. Por ejemplo, a partir de la cadena "nAcho" se obtendría "NaChO".
			 */
			public static void convierteLetras() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Ingresa tu nombre: ");
		        String nombre = sc.nextLine();
		        
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < nombre.length(); i++) {
		            char letra = nombre.charAt(i);
		            if (i % 2 == 0) {
		                sb.append(Character.toLowerCase(letra));
		            } else {
		                sb.append(Character.toUpperCase(letra));
		            }
		        }
		        
		        String nuevoNombre = sb.toString();
		        System.out.println("Tu nuevo nombre es: " + nuevoNombre);
		    }
		
			/*
			 * Crea un programa que pida al usuario 5 números reales, que guardará en un array. 
			 * Luego calculará y mostrará su media (la suma de todos los datos, dividida entre la cantidad de datos) y los valores que están por encima de la media.
			 */
			
			public static void pideUsuarioArray() {
				Scanner sc = new Scanner (System.in);
				double[] numeros = new double [5];
				double suma  = 0;
				
				  for (int i = 0; i < 5; i++) {
			            System.out.print("Introduce el número " + (i+1) + ": ");
			            numeros[i] = sc.nextDouble();
			            suma += numeros[i];
			        }

			        double media = suma / 5;
			        System.out.println("La media de los números introducidos es: " + media);

			        System.out.print("Los números por encima de la media son: ");
			        for (int i = 0; i < 5; i++) {
			            if (numeros[i] > media) {
			                System.out.print(numeros[i] + " ");
			            }
			        }
			    }
			/*
			 * Crea un programa que pida al usuario 8 números enteros, los guarde en un array, halle y muestre el valor más alto que contiene (su máximo) 
			 * y el valor más bajo que contiene (su mínimo). Pista: puedes empezar suponiendo que el primer valor es el máximo provisional; a partir de ahí, recorre todos los demás con un "for"; 
			 * si alguno de los datos es mayor que el máximo provisional, pasará a ser el nuevo máximo; el mínimo se calculará de forma similar.
			 */
			public static void pide8Numeros() {
				int[] numeros = new int[8];
		        int max = Integer.MIN_VALUE; // Inicializar el valor máximo con el valor mínimo posible
		        int min = Integer.MAX_VALUE; // Inicializar el valor mínimo con el valor máximo posible
		        
		        // Pedir al usuario 8 números enteros
		        Scanner sc = new Scanner(System.in);
		        for (int i = 0; i < 8; i++) {
		            System.out.print("Ingrese un número entero: ");
		            numeros[i] = sc.nextInt();
		        }
		        
		        // Encontrar el valor máximo y mínimo en el array
		        for (int i = 0; i < 8; i++) {
		            if (numeros[i] > max) {
		                max = numeros[i];
		            }
		            if (numeros[i] < min) {
		                min = numeros[i];
		            }
		        }
		        
		        // Mostrar el valor máximo y mínimo
		        System.out.println("El valor máximo es: " + max);
		        System.out.println("El valor mínimo es: " + min);
		    }
			
			/*
			 * Crea un programa que prepare un array que contenga la cantidad de días que hay en cada mes del año. 
			 * A partir de entonces el usuario introducirá un número de mes (por ejemplo, 4 para abril) 
			 * y el programa le responderá cuántos días tiene ese mes. Se repetirá hasta que el usuario introduzca un mes menor que 1 o mayor que 12
			 */
			
			public static void arrayCantidadDias() {
				 // Array con la cantidad de días en cada mes
		        int[] diasEnMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		        
		        Scanner scanner = new Scanner(System.in);
		        int mes;
		        
		        do {
		            // Pedir al usuario que introduzca el número del mes
		            System.out.print("Introduce el número del mes (1-12): ");
		            mes = scanner.nextInt();
		            
		            if (mes >= 1 && mes <= 12) {
		                // Mostrar la cantidad de días en el mes correspondiente
		                int dias = diasEnMes[mes - 1];
		                System.out.println("El mes " + mes + " tiene " + dias + " días.");
		            } else {
		                // Mostrar un mensaje de error si el número de mes es inválido
		                System.out.println("Número de mes inválido. Por favor, introduce un número entre 1 y 12.");
		            }
		        } while (mes >= 1 || mes <= 12);
		        
		        scanner.close();
		    }
			/*
			 *  Crea un programa que prepare un array que contenga el nombre de cada mes del año. 
			 *  El usuario introducirá un número de mes (por ejemplo, 4 para abril) y el programa le dirá el nombre de ese mes.
			 */
			
			public static void adivinaMes() {
				String [] meses = {"Enero","Febrero","Marzo","Abril",
						"Mayo","Junio","Julio","Agosto",
						"Septiembre","Octubre","Noviembre","Diciembre"};
				
				Scanner sc = new Scanner (System.in);
				int mes;
				
			do {
				System.out.println("Introduce el número del mes (1-12)");
					mes = sc.nextInt();
					if(mes>=1 && mes<=12) {
						String nombre = meses[mes-1];
						System.out.println("El mes " + mes + " es " + nombre);
					}else {
						System.out.println("Número de mes inválido. Por favor introduce un valor válido (1-12)");
					}
			}while (mes>=1 && mes<=12);
				
			
			}
			/*
			 * Si has estudiado estadística, crea un programa que pida al usuario 10 números
			 *  reales de doble precisión, los guarde en un array y luego muestre su media aritmética, varianza y desviación típica.
			 */
			public static void estadistica() {
				 // Pedimos al usuario que introduzca los 10 números
		        Scanner sc = new Scanner(System.in);
		        double[] numeros = new double[10];
		        for (int i = 0; i < 10; i++) {
		            System.out.print("Introduce el número " + (i+1) + ": ");
		            numeros[i] = sc.nextDouble();
		        }

		        // Calculamos la media aritmética
		        double media = 0;
		        for (double num : numeros) {
		            media += num;
		        }
		        media /= numeros.length;

		        // Calculamos la varianza
		        double varianza = 0;
		        for (double num : numeros) {
		            varianza += Math.pow(num - media, 2);
		        }
		        varianza /= numeros.length;

		        // Calculamos la desviación típica
		        double desviacion = Math.sqrt(varianza);

		        // Mostramos los resultados
		        System.out.println("La media aritmética es: " + media);
		        System.out.println("La varianza es: " + varianza);
		        System.out.println("La desviación típica es: " + desviacion);
		    }
		
			/*
			 *  Crea un programa que pida al usuario 10 números enteros largos, los guarde en un array y después pregunte qué número quiere buscar y 
			 *  le contestará si ese número forma parte de los 10 iniciales o no. 
			 *  Volverá a preguntar qué número desea buscar, hasta que el usuario introduzca "-1" para indicar que no quiere seguir buscando
			 */
			
			public static void pide10Largos() {
				// Pedimos al usuario que introduzca los 10 números
		        Scanner sc = new Scanner(System.in);
		        long[] numeros = new long[10];
		        for (int i = 0; i < 10; i++) {
		            System.out.print("Introduce el número " + (i+1) + ": ");
		            numeros[i] = sc.nextLong();
		        }

		        // Preguntamos al usuario qué número desea buscar
		        long numBuscado = 0;
		        while (numBuscado != -1) {
		            System.out.print("Introduce el número que deseas buscar (-1 para salir): ");
		            numBuscado = sc.nextLong();

		            // Buscamos el número en el array
		            boolean encontrado = false;
		            for (long num : numeros) {
		                if (num == numBuscado) {
		                    encontrado = true;
		                    break;
		                }
		            }

		            // Mostramos el resultado de la búsqueda
		            if (encontrado==true) {
		                System.out.println("El número " + numBuscado + " forma parte de los 10 iniciales");
		            } else {
		                System.out.println("El número " + numBuscado + " no forma parte de los 10 iniciales");
		            }
		        }
		    }
			/*
			 *  Crea un programa que prepare un array de hasta 1000 números enteros. El usuario podrá elegir añadir un nuevo dato 
			 *  (tendrás que llevar la cuenta la cantidad de datos que ya hay introducidos), buscar para comprobar si aparece un cierto dato, o salir del programa.
			 */
			public static void array1000() {
				 // Creamos el array y una variable para llevar la cuenta de los datos
		        int[] numeros = new int[1000];
		        int numDatos = 0;

		        // Creamos el menú y un bucle para mostrarlo y procesar la opción elegida
		        Scanner sc = new Scanner(System.in);
		        int opcion = 0;
		        while (opcion != 3) {
		            System.out.println("1. Añadir un nuevo dato");
		            System.out.println("2. Buscar un dato");
		            System.out.println("3. Salir");
		            System.out.print("Elige una opción: ");
		            opcion = sc.nextInt();

		            switch (opcion) {
		                case 1:
		                    // Pedimos al usuario que introduzca el nuevo dato
		                    if (numDatos >= 1000) {
		                        System.out.println("No se pueden añadir más datos. El array está lleno.");
		                    } else {
		                        System.out.print("Introduce el nuevo dato: ");
		                        numeros[numDatos] = sc.nextInt();
		                        numDatos++;
		                    }
		                    break;

		                case 2:
		                    // Pedimos al usuario que introduzca el dato a buscar
		                    System.out.print("Introduce el dato que quieres buscar: ");
		                    int datoBuscado = sc.nextInt();

		                    // Buscamos el dato en el array
		                    boolean encontrado = false;
		                    for (int i = 0; i < numDatos; i++) {
		                        if (numeros[i] == datoBuscado) {
		                            encontrado = true;
		                            break;
		                        }
		                    }

		                    // Mostramos el resultado de la búsqueda
		                    if (encontrado) {
		                        System.out.println("El dato " + datoBuscado + " aparece en el array.");
		                    } else {
		                        System.out.println("El dato " + datoBuscado + " no aparece en el array.");
		                    }
		                    break;

		                case 3:
		                    System.out.println("Saliendo del programa...");
		                    break;

		                default:
		                    System.out.println("Opción no válida.");
		                    break;
		            }
		        }
		    }
			/*
			 *  Si has estudiado lo que es un vector, crea un dos arrays de tres elementos, cada uno de los cuales representará un vector de tres dimensiones.
			 *   Pide al usuario los datos para ambos vectores, luego muéstralos en la forma "(5, 7, -2)", después calcula (y muestra) su producto escalar y su producto vectorial.
			 */
			public static void vectores() {
				 Scanner sc = new Scanner(System.in);
			        int[] vector1 = new int[3];
			        int[] vector2 = new int[3];

			        // Pedimos al usuario que ingrese los datos para el primer vector
			        System.out.println("Ingrese los valores del primer vector:");
			        for (int i = 0; i < vector1.length; i++) {
			            System.out.print("Valor " + (i+1) + ": ");
			            vector1[i] = sc.nextInt();
			        }

			        // Pedimos al usuario que ingrese los datos para el segundo vector
			        System.out.println("Ingrese los valores del segundo vector:");
			        for (int i = 0; i < vector2.length; i++) {
			            System.out.print("Valor " + (i+1) + ": ");
			            vector2[i] = sc.nextInt();
			        }

			        // Mostramos los vectores ingresados
			        System.out.println("Primer vector: (" + vector1[0] + ", " + vector1[1] + ", " + vector1[2] + ")");
			        System.out.println("Segundo vector: (" + vector2[0] + ", " + vector2[1] + ", " + vector2[2] + ")");

			        // Calculamos el producto escalar
			        int productoEscalar = 0;
			        for (int i = 0; i < vector1.length; i++) {
			            productoEscalar += vector1[i] * vector2[i];
			        }
			        System.out.println("Producto escalar: " + productoEscalar);

			        // Calculamos el producto vectorial
			        int[] productoVectorial = new int[3];
			        productoVectorial[0] = vector1[1] * vector2[2] - vector1[2] * vector2[1];
			        productoVectorial[1] = vector1[2] * vector2[0] - vector1[0] * vector2[2];
			        productoVectorial[2] = vector1[0] * vector2[1] - vector1[1] * vector2[0];
			        System.out.println("Producto vectorial: (" + productoVectorial[0] + ", " + productoVectorial[1] + ", " + productoVectorial[2] + ")");
			    }
			
			/*
			 * Si has estudiado lo que es una matriz, crea un array de 3x3 elementos, 
			 * pide al usuario los datos de esas 9 posiciones y luego calcula el determinante de esa matriz bidimensional.
			 */
			public static void matriz3x3() {
				 Scanner sc = new Scanner(System.in);
			        int[][] matriz = new int[3][3];

			        // Pedimos al usuario que ingrese los datos de la matriz
			        System.out.println("Ingrese los datos de la matriz:");
			        for (int i = 0; i < matriz.length; i++) {
			            for (int j = 0; j < matriz[i].length; j++) {
			                System.out.print("Elemento [" + i + "][" + j + "]: ");
			                matriz[i][j] = sc.nextInt();
			            }
			        }

			        // Mostramos la matriz ingresada
			        System.out.println("La matriz ingresada es:");
			        for (int i = 0; i < matriz.length; i++) {
			            for (int j = 0; j < matriz[i].length; j++) {
			                System.out.print(matriz[i][j] + "\t");
			            }
			            System.out.println();
			        }

			        // Calculamos el determinante de la matriz
			        int determinante = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
			                         - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
			                         + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);

			        System.out.println("El determinante de la matriz es: " + determinante);
			    }
			/*
			 * Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos, excepto la segunda fila, 
			 * que estará rellena de letras "A" y luego muestra el contenido del array en pantalla. Deberá aparecer algo como:
			 */
			public static void array5x5() {
				
				 char [][] array = new char[5][5];
				 
				 //Rellenamos el array con puntos
				 for (int i = 0; i < array.length; i++) {
			            for (int j = 0; j < array[i].length; j++) {
			                array[i][j] = '.';
			            }
			        }

			        // Rellenamos la segunda fila con letras "A"
			        for (int j = 0; j < array[1].length; j++) {
			            array[1][j] = 'A';
			        }

			        // Mostramos el contenido del array en pantalla
			        for (int i = 0; i < array.length; i++) {
			            for (int j = 0; j < array[i].length; j++) {
			                System.out.print(array[i][j] + " ");
			            }
			            System.out.println();
			        }
			    }
			
			/*
			 * Crea un programa que cree un array de 5x5 caracteres, lo rellene con puntos en todas las 
			 * posiciones excepto aquellas en las que el número de fila es igual al número de columna, 
			 * en las que pondrá un X. Luego muestra su contenido en pantalla, que deberá ser algo como:
			 */
			
			public static void array5x5conX() {
				 char[][] array = new char[5][5];

			        // Rellenamos el array con puntos, excepto en las posiciones en las que i == j
			        for (int i = 0; i < array.length; i++) {
			            for (int j = 0; j < array[i].length; j++) {
			                if (i == j) {
			                    array[i][j] = 'X';
			                } else {
			                    array[i][j] = '.';
			                }
			            }
			        }

			        // Mostramos el contenido del array en pantalla
			        for (int i = 0; i < array.length; i++) {
			            for (int j = 0; j < array[i].length; j++) {
			                System.out.print(array[i][j] + " ");
			            }
			            System.out.println();
			        }
			    }
			
			public static void dibujarCuadrado3x3() {
				
	
				
				for(int i = 0; i<3; i++) {
					for (int j = 0; j<3; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			public static void dibujaCuadrado2(int tamanyo) {
				

				for(int i = 0; i<tamanyo;i++) {
					for(int j = 0; j<tamanyo;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			
			public static void dibujaRectángulo(int alto, int ancho) {
				
				for(int i = 0; i<alto; i ++) {
					for(int j = 0; j<ancho; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
			/*
			 *  Crea una función que calcule el cubo de un número real (float) que se indique como parámetro.
			 *   El resultado deberá ser otro número real. Probar esta función para calcular el cubo de 3.2 y el de 5.
			 */
			
			public static float cubo(float num) {
				float resultado = num * num * num;
				return resultado;
			}
			/*
			 *  Crea una función que calcule el menor de dos números enteros que recibirá como parámetros. El resultado será otro número entero.
			 */
			
			public static int menorDeDos(int numero, int numero2) {
				
				if(numero<numero2) {
					return numero;
				}else{
				return numero2;
				}
			}
			
			/*
			 *  Crea una función que devuelva la primera letra de una cadena de texto. Probar esta función para calcular la primera letra de la frase "Hola".
			 */
			public static char letra(String cadena) {
				
				return cadena.charAt(0);
			}
			/*
			 * Crea una función que devuelva la última letra de una cadena de texto. Probar esta función para calcular la última letra de la frase "Hola".
			 */
			public static char obtenerUltimaLetra(String texto) {
				  int longitud = texto.length();
				  return texto.charAt(longitud - 1);
				}
			/*
			 * Crea una función "esPrimo", que reciba un número y devuelva el valor booleano "true" si es un número primo o "false" en caso contrario.
			 */
			public static boolean esPrimo (int numero) {
				boolean primo = true;
				for(int i=2;i<numero/2 && primo; i++) {
					
					if(numero%i==0) 
						primo=false;
					}
				return primo;
					}
				
			/*
			 *  Crea una función que reciba un array de números y un número. y te devuelva
				cuantas veces aparece ese número en el array.
			 */
			public static int cuantasVeces(int [] array, int numero) {
				  int contador = 0;
				    for (int i = 0; i < array.length; i++) {
				      if (array[i] == numero) {
				        contador++;
				      }
				    }
				    return contador;
				  }
				
			/*
			 * Crea una función que reciba un array de cadenas y te lo devuelva ordenado
			 * alfabéticamente de la ‘z’ a la ‘a’
			 */
			public static String [] devuelveOrdenado (String [] cadenas) {
				
			Arrays.sort(cadenas, Comparator.reverseOrder());
			return cadenas;
			/*
			 * return Arrays.stream(cadenas)
                 .sorted(Comparator.reverseOrder())
                 .toArray(String[]::new);
			 */
			}
			/*
			 * Crea una función que reciba una cadena con una serie de números separados por
				punto y coma “;”, y devuelva la media de dichos números.
			 */
			public static double devuelveLaMedia(int [] numeros) {
				
				int suma=0;
				if(numeros.length!=0) {
					
				}
				for(int i=0; i<numeros.length; i++) {
					suma+=numeros[i];
				}
				return (double)suma/numeros.length;
				
				}
			
			public static int cuantasVecesAparece (String cadena, String subcadena) {
				
				  int contador = 0;
				    int indice = 0;
				    while ((indice = cadena.indexOf(subcadena, indice)) != -1) {
				        contador++;
				        indice++;
				    }
				    return contador;
				}
			
			/*
			 * Crea una función que reciba un número indeterminado de parámetros enteros y
				devuelva el máximo. Ten en cuenta que si recibes cero números, debes devolver
				cero también.

			 */
			public static int encontrarMaximo(int... numeros) {
			    if (numeros.length == 0) {
			        return 0;
			    }
			    int maximo = numeros[0];
			    for (int i = 1; i < numeros.length; i++) {
			        if (numeros[i] > maximo) {
			            maximo = numeros[i];
			        }
			    }
			    return maximo;
			}
			
			/*
			 * Crea una función que reciba un array de cadenas por parámetro y devuelva una de
			las cadenas al azar. Pista: puedes generar un número aleatorio entre 0 y la última
			posición del array usando new Random().nextInt(array.length).
			A continuación pide al usuario que adivine la palabra seleccionada (tiene 3 intento s,
			usa un bucle). Si la acierta felicítale, y si no, dile cual era la correcta.
			 */
			
			public static String cadenaAlAzar(String [] cadenas) {
				
				 Random random = new Random();
			        int indiceAleatorio = random.nextInt(cadenas.length);
			        return cadenas[indiceAleatorio];
			        
			}
			
			/*
			 * Crea una función que reciba un array de números y devuelva su media.
			 */
			
			public static double devuelveMedia2(int [] numeros) {
				
				int suma = 0;
				
				
				for(int i=0; i<numeros.length; i++) {
					suma+=numeros[i];
					if(numeros.length!=0) {
						
					}
				}
				return (double)suma/numeros.length;
				
			}
			/*
			 * Crea una función que reciba un número y devuelva un booleano indicando si el número recibido es primo o no. 
			 * Llama a la función varias veces y muestra el resultado devuelto. 
			 * Recuerda que un número primo es aquel que solo es divisible (resto == 0) entre 1 y él mismo.
			 */
			
			public static boolean esPrimo3(int numero) {
				
			boolean primo= true;
				for (int i = 2; i<numero/2; i ++) {
					if(numero%i==0) 
						primo = false;
						
					}
					return primo;
				}
					
			/*
			 * Crea una función con 2 parámetros. El primero será una cadena y representa al nombre de una persona, 
			 * mientras que el segundo contendrá al resto de parámetros recibidos (…), 
			 * que serán cadenas con los trabajos que la persona ha realizado
			 */
			
			public static void mostrarTrabajo2(String nombre, String...trabajos) {
				
				System.out.println(nombre +":");
				if(trabajos.length==0) {
					System.out.println("Esta persona no ha trabajado nunca");
				}else {
					for(int i=0; i<trabajos.length; i++) {
						System.out.println(trabajos[i]);
					}
					
				}
			}
			public static void dibujaCuadradoConCaracter(char caracter, int numero) {
				
				for(int i = 0; i<numero; i++) {
					for(int j = 0; j<numero; j++) {
					System.out.print(caracter + " ");
					
				}
				System.out.println();
				}
			}
			public static void estaEnElRango(String cadena, int numero1, int numero2) {
				
				System.out.println(cadena.length()>=numero1 && cadena.length()<=numero2?
						"Sí está entre los dos valores" : "No está entre los 2 valores");
					
				}
			public static void dibujaAsteriscos2(int numero) {
				
				for(int i = 0; i<numero; i ++) {
					System.out.print("*");
				}
			}
			
			//Ejercicios de Programa Resuelto 150 minutos de ejercicios básicos en Java
			
			public static void companyaAutomoviles() {
				Scanner sc = new Scanner (System.in);
				
				int A = 24;
				int B = 33;
				int C = 38;
				int cantA;
				int cantB;
				int cantC;
				
				System.out.println("Dime que cantidad de coches vendiste del coche A");
				cantA = sc.nextInt();
				System.out.println("Dime que cantidad de coches vendiste del coche B");
				cantB = sc.nextInt();
				System.out.println("Dime que cantidad de coches vendiste del coche C");
				cantC = sc.nextInt();
				
				int comision = cantA*A + cantB*B + cantC*C;
			
				System.out.println(" La comisión que te llevas es: " + comision);
			}
			
			public static void gradosCelsiusaFahrenheit() {
				
				Scanner sc = new Scanner (System.in);
				
				double F, C;
				
				System.out.println("Ingresa la cantidad de grados Celsius a convertir: ");
				C = sc.nextDouble();
				
				F = 9.0/5.0 * C + 32;
				
				System.out.println(C + " grados Celsius equivalen a " +F + " grados Fahrenheit.");
			}
			
			public static void corredorMaraton() {
				
				Scanner sc = new Scanner (System.in);
				
				int h, m;
				double tiempoH, tiempoM, tiempoS, km_h, km_m, km_s, m_m, m_s;
				
				System.out.println("Ingresa la cantidad de horas: ");
				h = sc.nextInt();
				System.out.println("Ingresa la cantidad de minutos");
				m = sc.nextInt();
				
				tiempoH = h + (m/60.0);
				tiempoM = (h*60) + m;
				tiempoS = (h*3600) + (m*60);
			
				km_h = 42.195 / tiempoH;
				km_m = 42.195 / tiempoM;
				km_s = 42.195 / tiempoS;
				m_m = 42195 / tiempoM;
				m_s = 42195 / tiempoS;
				
				System.out.println("La velocidad media del corredor fue: \n"
						+ km_h + "Km/h\n"
						+ km_m + " Km/min\n"
						+ km_s + " Km/s\n"
						+ m_m + " m/min\n"
						+ m_s + "m/s.");
				
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
		//ejercicio19();
		/*
		for(int i=0; i<3; i++)
		dibujaAsteriscos(5);
		*/
		//recibeCadena("Hola", 1, 3);
		//dibujaCuadrado('s',5);
		//mostrarTrabajo("Juan", "Camionero", "Cartero", "Barrendero");
		//mostrarTrabajo("Pedro", "Peluquero", "Cartero", "Fontanero");
		//mostrarTrabajo("Pepe", "Paseador de perros", "Cartero", "Electricista");
		//mostrarTrabajo("Pepa");
		/*
		if (esPrimo(9)) {
			System.out.println("Es primo");
		}
		System.out.println(esPrimo(9)? "Es primo": "No es primo");
		*/
		
		//System.out.println(alReves(345));
		/*
		if(esEmirp(19)) {
			System.out.println("Es emirp");
		}else {
			System.out.println("No es emirp");
			*/
		
		/*
		System.out.println(cuantasCifras(1211));
		}
	
		*/
		//System.out.println(alReves2(345));
		/*
		int[] numeros = {2,3,4,5,6,1,2};
		System.out.println(devuelveMedia(numeros));
		*/
		
		/*
		String [] cadenas = {"Blanco", "Negro", "Azul", "Rojo", "Naranja"};
		
		System.out.println( obtenCadena(cadenas));
		*/
		/*
		System.out.println(devuelveMaximo(1,4,3,7,1,3));
		System.out.println(devuelveMaximo(1,23,0,7,-1,3));
		*/
		//ejercicioIfElse();
		//pideUsuario();
		//pideUsuario2();
		//pideUsuario3();
		//multiploDe3();
		//esImpar();
		//pideDosNumeros();
		//alMenos1();
		//cuantosPares();
		//pide3Numeros();
		//pideUnMes();
		//pasaATexto();
		//parTernario();
		//bucleWhile();
		//numerosPares();
		//tablaDel5();
		//muestraCuadrado();
		//usuarioContrasenya();
		//pideLogin();
		//dibujaAsteriscos();
		//muestraNumeros();
		//numerosPares2();
		//tablaDel5DoWhile();
		//pideDosNumeros2();
		//pideLogin2();
		//pideByte();
		//muestraDel1Al15();
		//muestraPares();
		//tablaDel5For();
		//multiplosDe6();
		//muestraNumeros2();
		//dibujaAsteriscosByte();
		//cuadradoHueco();
		//muestraDivisores();
		//esPrimo2();
		//cuantosPrimos();
		//muestraMenos15();
		//muestraBreak();
		//siEsPar();
		//trianguloNombre();
		//nombreEspacios();
		//nombreAlReves();
		//nombreLetraMayuscula();
		//escribeNacho();
		//escribeNachoAlReves();
		//cambiaPrimera();
		//nombreDon();
		//convierteLetras();
		//pideUsuarioArray();
		//pide8Numeros();
		//arrayCantidadDias();
		//adivinaMes();
		//pide10Largos();
		//matriz3x3();
		//array5x5();
		//array5x5conX();
		//dibujarCuadrado3x3();
		//dibujaCuadrado2(6);
		//dibujaRectángulo(7,15);
		/*
		float num1 = 3.2f;
        float num2 = 5.0f;

        float resultado1 = cubo(num1);
        float resultado2 = cubo(num2);

        System.out.println("El cubo de " + num1 + " es: " + resultado1);
        System.out.println("El cubo de " + num2 + " es: " + resultado2);
        */
		/*
		int numero = 50;
		int numero2 = 70;
		
		int resultado = menorDeDos(numero,  numero2);
		System.out.println("El menor entre " +numero + " y " +numero2 + " es " + resultado );
		*/
		/*
		String frase = "Hola";
		char primeraLetra = letra(frase);
		System.out.println("La primera letra de \"" + frase + "\" es \"" + primeraLetra + "\"");
		*/
		/*
		 String texto = "Hola";
		  char ultimaLetra = obtenerUltimaLetra(texto);
		  System.out.println("La última letra de \"" + texto + "\" es \"" + ultimaLetra + "\"");
		  */
		//System.out.println(esPrimo(15)? "Sí es primo" : "No es primo");
		/*
		 int[] array = { 3, 4, 5, 6, 3, 2, 1, 3 };
		    int numero = 5;
		    int veces = cuantasVeces(array, numero);
		    System.out.println("El número " + numero + " aparece " + veces + " veces en el array.");
		    */
		/*
		String [] cadenas = {"Hola", "Amic", "Que", "Tal", "Estás", "Zorro"};
		String [] cadenasOrdenadas = devuelveOrdenado(cadenas);
		System.out.println(Arrays.toString(cadenasOrdenadas));
		  */
		/*
			int [] numeros = {1,2,4,5,6,8,19};
			System.out.println(devuelveLaMedia(numeros));
			*/
		/*
		String cadena = "La casa de la praderaca";
		String subcadena = "ca";
		int resultado = cuantasVecesAparece(cadena, subcadena);
		System.out.println(resultado); // Salida: 5
		*/
		
		/*
		int maximo = encontrarMaximo(4,7,21,34,56,8,1234,183);
		System.out.println("El número máximo es: " + maximo);
		*/
		/*
		String[] palabras = {"perro", "gato", "elefante", "jirafa", "leon"};
        String palabraAleatoria = cadenaAlAzar(palabras);
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce una palabra:");
            String palabraIntroducida = scanner.nextLine();
            if (palabraIntroducida.equals(palabraAleatoria)) {
                System.out.println("¡Felicidades, has acertado!");
               break;
            } else {
                System.out.println("Lo siento, esa no es la palabra correcta.");
            }
        }
        
        System.out.println("La palabra correcta era: " + palabraAleatoria);
        */
		/*
		int [] numeros = {1,34,556,2455,2313,45};
		double media = devuelveMedia2(numeros);
		System.out.println("La media de los números elegidos es " +media);
		*/
		//dibujaCuadradoConCaracter('a', 5);
		//dibujaAsteriscos2(20);
		//dibujaAsteriscos2(20);
		//dibujaAsteriscos2(20);
		//companyaAutomoviles();
		//gradosCelsiusaFahrenheit();
		corredorMaraton();
		
    }

	}



