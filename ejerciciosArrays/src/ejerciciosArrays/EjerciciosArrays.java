package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArrays {

	public static void ejercicio1() {
		Scanner sc = new Scanner(System.in);
		String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };
		System.out.println("Introduzca el número del mes");
		int numero = sc.nextInt();
		System.out.println("El mes es: " + meses[numero - 1]);

		sc.close();
	}

	public static void ejercicio2() {
		int total = 0;
		Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// La lista de números introducidos (recorrer)
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// La suma de los números
		for (int numero : numeros) {
			total += numero; // total = total + numero
		}
		System.out.println("El total es: " + total);
		// La media de los números
		System.out.println("La media es: " + (double) total / numeros.length);
		// El mayor y el menor de los números (crea un máximo y un mínimo provisional
		// que
		// será igual al primer número del array, después vas comparando con el resto de
		// posiciones).
		int mayorProvisional = numeros[0]; // 1 inicialmente es el 1.
		int menorProvisional = numeros[0]; // 1 inicialmente es el 1.
		// Opción A:
		for (int numero : numeros) {
			if (numero > mayorProvisional)
				mayorProvisional = numero;
			if (numero < menorProvisional)
				menorProvisional = numero;
		}
		System.out.println("El número mayor es " + mayorProvisional);
		System.out.println("El número menor es " + menorProvisional);
		// Opción B:
		Arrays.sort(numeros);
		System.out.println("El número mayor es " + numeros[numeros.length - 1]);
		System.out.println("El número menor es " + numeros[0]);
	}


	public static void ejercicio3() {
		 Scanner sc = new Scanner(System.in);
	        double[] numbers = new double[10];
	        double sum = 0;

	        // Pedir al usuario que ingrese 10 números con decimales
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingrese un número con decimales: ");
	            numbers[i] = sc.nextDouble();
	            sum += numbers[i];
	        }

	        // Calcular la media
	        double average = sum / 10;
	        System.out.println("La media es: " + average);

	        // Mostrar los números que están por encima de la media
	        System.out.print("Los números por encima de la media son: ");
	        for (int i = 0; i < 10; i++) {
	            if (numbers[i] > average) {
	                System.out.print(numbers[i] + " ");
	            }
	        }
	    }
	public static void ejercicio4() {
		int mes, dia, diasTotales = 0;

		int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime un número de mes");
		mes = sc.nextInt();
		sc.nextLine();
		System.out.println("Dime un día del mes en números");		
		dia = sc.nextInt();
		
		for (int i=0; i<mes-1; i++) {
			diasTotales+=dias[i];
			
		}
		diasTotales+=dia;
		System.out.println("El día elegido es: " +diasTotales);
		sc.close();
	}
	public static void ejercicio5() {
		Scanner sc=new Scanner(System.in);
		double[] notas;
		String[] nombres;
		int cantidadNotas;
		
		// Pedir al usuario la cantidad de notas
		// cuando sepa cantidad --> notas=new double[cantidad]
		//Con un bucle pido notas y nombres y guardo en cada array.
		//Mostrar cada nombre con su nota.
		
		System.out.print("Introduzca cantida de notas:");
		cantidadNotas=sc.nextInt();
		
		notas=new double[cantidadNotas];
		nombres=new String[cantidadNotas];
		
		for(int i=0;i<notas.length;i++)
		{
			System.out.print("Introduzca nombre de alumno: ");
			nombres[i]=sc.next();
			System.out.print("Introduzca la nota de "+nombres[i]+" ");
			notas[i]=sc.nextDouble();
		}
		
		for(int i=0;i<notas.length;i++)
		{
			System.out.println("Nombre: "+nombres[i]+" nota: "+notas[i]);
		}
		
		//Calcular la media de las notas 
		//Sacar por pantalla los nombres de los alumnos por encima de la media
		
		double suma=0,media;		
		for(double n:notas) {
			suma+=n;
		}
		media=suma/notas.length;
		
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>media)
				System.out.println(nombres[i]);
		}
		
		// Nombre con la nota más alta
		double maximo=notas[0];
		int posicion=0;
		for(int i=0;i<notas.length;i++) {
			if(maximo<notas[i]) {
				maximo=notas[i];
				posicion=i;
			}		
		}
		System.out.println("La nota más alta la tiene: "+ nombres[posicion]);
		sc.close();
	}
	
		public static void ejercicio13() {
			Scanner sc = new Scanner(System.in);
			String[][] productos = new String[10][3];  // Podemos almacenar hasta 10 productos con 3 campos
			//String[][] productos = {{"mesa","99,50","3"},{"silla","14,95","4"}};  // 2 productos con 3 campos
			
			// Obtener los datos de productos
			System.out.println("¿Cuántos productos desea almacenar? (máximo 10)");
			int numProductos = Integer.parseInt(sc.nextLine());
			if(numProductos>10 || numProductos<0) {
				System.out.println("No se pueden almacenar más de 10 productos o números negativos");
				sc.close();  // cierro el scanner porque el programa no va a llegar al final de la función
				return;  // salgo de la función
			} else {  // número entre 0 y 10
				for(int i=0;i<numProductos;i++) {
					System.out.println("Introduzca el nombre del producto " + (i+1));
					productos[i][0]=sc.nextLine();
					System.out.println("Introduzca el precio del producto " + (i+1));
					productos[i][1]=sc.nextLine();
					System.out.println("Introduzca la cantidad del producto " + (i+1));
					productos[i][2]=sc.nextLine();
				}
			}
			
			// Mostrar los datos
			System.out.printf("%-17s%10s%10s%10s\n","NOMBRE","PRECIO","CANTIDAD","TOTAL");
			/*for(int i=0; i<42;i++) {
				System.out.print("-");
			}*/		
			System.out.println(String.valueOf('-').repeat(47));
			for(int i=0;i<numProductos;i++) {  // Si usaramos datos fijos seria productos.length
				double precio = Double.parseDouble(productos[i][1].replace(',', '.'));
				int cantidad = Integer.parseInt(productos[i][2]);
				double total = precio * cantidad;
				System.out.printf("%-17s%9.2f€%10d%9.2f€\n",productos[i][0],precio,cantidad,total);
			}
			
			
			sc.close();
		}
	
	
	

	

	public static void main(String[] args) {
		// ejercicio1();
		//ejercicio2();
		//ejercicio3();
		//ejercicio4();
		//ejercicio5();
		ejercicio13();
		System.out.println("FIN");

	}

}
