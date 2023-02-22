package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios {
	
	
	public static void ejercicio7_5() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el nombre del fichero, crack");
		String nombreFichero = sc.nextLine();
		List<String> lineas = Ejemplos.devolverLineasJava8(Paths.get(nombreFichero));
		if(lineas!=null) { //he podido acceder al fichero
			//lineas.forEach(e->System.out.println(e)); // Me muestra todas las líneas de un fichero
			//String[] lineasArray = (String[]) lineas.toArray(); // Me transforma una lista de String en un array
			int elementosLista = lineas.size(); // número de elementos de la lista
			Random random = new Random(); // crea un objeto de tipo random para sacar números aleatorios
			int azar = random.nextInt(elementosLista); // saca un número aleatorio entre 0 y elementosLista-1
			int numeroAzar = new Random().nextInt(lineas.size());
			System.out.println(lineas.get(numeroAzar)); // cógeme una de las líneas al azar
		}
		
		sc.close();
	}
	public static void ejercicio2(String nombreFichero) {
		Scanner sc = new Scanner(System.in);
		String linea;
		try {
			Files.writeString(Paths.get(nombreFichero), "");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		do {
		System.out.println("Introduzca la línea que quiere insertar en el fichero (FIN) para finalizar");	
	    linea = sc.nextLine();
		if(!linea.equalsIgnoreCase("fin")) {
			try {
				Files.writeString(Paths.get(nombreFichero), linea+"\n",StandardOpenOption.APPEND);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		}while(!linea.equalsIgnoreCase("fin"));
			
	sc.close();
	}

	public static void main(String[] args) {
		//ejercicio7_5();
		ejercicio2("C:/ficheros/ejercicio.txt");


	}

}
