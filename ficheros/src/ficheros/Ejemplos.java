package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ejemplos {
		/**
		 * Función que nos lee todo el contenido de un fichero y nos imprime sus líneas por consola
		 * utilizando Java 5
		 * @param nombreFichero
		 **/

		public static void leerFicheroJava5(String nombreFichero) {
			File archivo = null;
			FileReader fr = null;
			BufferedReader br = null;

			try {
				// Apertura del fichero y creacion de BufferedReader para poder
				// hacer una lectura comoda (disponer del metodo readLine()).
				archivo = new File(nombreFichero);
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);

				// Lectura del fichero
				String linea;
				while ((linea = br.readLine()) != null)
					System.out.println(linea);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// En el finally cerramos el fichero, para asegurarnos
				// que se cierra tanto si todo va bien como si salta
				// una excepcion.
				try {
					if (null != fr) {
						fr.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	/**
	 * Función que nos lee todo el contenido de un fichero y nos imprime sus líneas por consola
	 * utilizando Java 8
	 * Files nos permite trabajar con el contenido de los ficheros.
	 * Paths nos permite trabajar con las rutas del ordenador (ej: C:/ficheros/archivo.txt)
	 * @param nombreFichero
	 * @throws IOException
	 * @author Néstor
	 */

	public static void leerFicheroJava8(String nombreFichero) throws IOException {
		Files.readAllLines(Paths.get(nombreFichero)).forEach(l -> System.out.println(l));
	}
	/**
	 * Función que nos lee todo el contenido de un fichero y nos imprime sus líneas por consola
	 * utilizando Java 8
	 * Files nos permite trabajar con el contenido de los ficheros.
	 * @param ruta Recibe una variable de tipo Path con la ruta del fichero
	 * @throws IOException
	 * @author Néstor
	 */
	public static void leerFicheroJava8(Path ruta) throws IOException {
		Files.readAllLines(ruta).forEach(l -> System.out.println(l));
	}
	
	public static List<String> devolverLineasJava8(Path ruta) {
		try { //prueba esto 
			List<String> lineas = Files.readAllLines(ruta); // voy a leer las líneas de un fichero, las voy a almacenar
			return lineas;		
		} catch (IOException e) { // y si falla
			//e.printStackTrace(); // imprime esto
			System.out.println("No se puede acceder al fichero");
			return null;
		} 
	}

	public static void main(String[] args) throws IOException {
		{
			//leerFicheroJava5("C:\\ficheros\\ejemplo.txt");
			//leerFicheroJava8("C:\\ficheros\\ejemplo.txt");
			//leerFicheroJava8(Paths.get("datos", "datos.txt")); // Llamada con ruta relativa
			List <String> datosDevueltos = devolverLineasJava8(Paths.get("C:\\ficheros\\ejemplo.txt"));
			//System.out.println("Esta línea se ejecuta");
			if(datosDevueltos!=null)
			datosDevueltos.forEach(e->System.out.println(e));

		}
	}
}
