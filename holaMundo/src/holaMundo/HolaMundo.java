package holaMundo;

/**
 * Esta es la clase inicial del curso
 * 
 * @author Néstor
 * @since 1.0
 */
public class HolaMundo {

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
		double division = (double)numero2/numero;
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La división es: " + division);
		System.out.println("La división sobre la marcha es: " + ((double)numero2/numero));
		// Número con decimales
		double decimales1 = 3.14;
		double decimales2 = 2.22;
		System.out.println("La multiplicación es: " + decimales1 * decimales2);
		System.out.println("La suma es: " + (decimales1  + decimales2));
		double sumadecimales = numero + decimales1;
		System.out.println("Suma con decimales es: " + sumadecimales);
		//Enteros largos
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		
		System.out.println("Suma de los dos números: " + (maxInt + minInt));

	}

	public static void main(String[] args) {
		//ejemplosComentarios();
		ejemplosTipos();

	}

}