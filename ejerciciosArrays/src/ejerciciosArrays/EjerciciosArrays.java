package ejerciciosArrays;

import java.util.Scanner;

public class EjerciciosArrays {
	
	public static void ejercicio1() {
		Scanner sc = new Scanner (System.in);
		String [] meses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		System.out.println("Introduzca el número del mes");
		int numero = sc.nextInt();
		System.out.println("El mes es: " + meses [numero-1]);
		
		sc.close();
	}
	

	public static void main(String[] args) {
		ejercicio1();

	}

}
