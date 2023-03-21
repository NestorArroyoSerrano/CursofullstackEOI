package ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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

	public static void leerFicheroJava8(String nombreFichero) throws IOException { //el throws manda el error al main
		Files.readAllLines(Paths.get(nombreFichero)).forEach(l-> System.out.println(l));
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
	/**
	 * Método que lee un fichero y devuelve sus líneas en una lista
	 * @param ruta Path con la ruta del fichero
	 * @return Lista de cadenas, una por cada línea.
	 */
	
	public static List<String> devolverLineasJava8(Path ruta) { // aqui ya no mandas el error al main, aquí en el propio método se ejecuta el error si lo hubiese
		try { //prueba esto 
			List<String> lineas = Files.readAllLines(ruta, Charset.forName("UTF-8")); // voy a leer las líneas de un fichero, las voy a almacenar
			return lineas;		
		} catch (IOException e) { // y si falla
			//e.printStackTrace(); // imprime esto. Esto es el mensaje estandar del sistema
			System.out.println("No se puede acceder al fichero"); // este lo he añadido yo, un mensaje personalizado
			return null;
		} 
	}

	/**
	 * Escribe un fichero machacando lo anterior
	 * @param ruta Path con la ruta del fichero
	 * @param lineas Lista con las líneas
	 * @return True en caso de escritura correcta, false en caso contrario
	 */
	public static boolean escribirLineasJava8(Path ruta, List<String> lineas) {
		try {
			Files.write(ruta, lineas);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	/**
	 * Escribe un fichero añadiendo a lo que hubiese
	 * @param ruta Path con la ruta del fichero
	 * @param lineas Lista con las líneas
	 * @return True en caso de escritura correcta, false en caso contrario
	 */
	public static boolean anyadirLineasJava8(Path ruta, List<String> lineas) {
		try {
			Files.write(ruta, lineas,StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			return false;
		}
	}
	public static int /*devolver un entero */ controlarDivisionEntera(int numerador, int denominador) {
		try {
			int resultado = numerador/denominador;
			return resultado;
		} catch (Exception e) {
			System.out.println("No se puede dividir entre 0");
			return 0; // devuelve un 0
		}
	}
	
	public static void leerEImprimir() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		try { // el try tiene que fallar para que se ejecute el catch
			int numero = Integer.parseInt(sc.nextLine()); // coge un número
			System.out.println(numero); // lo imprime
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			
		
		sc.close();
		}
	}

	public static void main(String[] args) throws IOException {
		// Lectura de Ficheros
				/*
				//leerFicheroJava5("C:\\ficheros\\alumnos.txt");
				//leerFicheroJava8("C:\\ficheros\\alumnos.txt");
				//leerFicheroJava8(Paths.get("datos","alumnos.txt"));  // Llamada con ruta relativa independiente del Sistema Operativo		
				List<String> datosDevueltos = devolverLineasJava8(Paths.get("C:\\ficheros\\alumnos.txt"));
				if(datosDevueltos!=null)  // Si el fichero devuelve líneas, es decir, existe.
					datosDevueltos.forEach(e->System.out.println(e));   // imprimo todas las líneas 
				if(datosDevueltos!=null) { // Imprimir los que empiecen por 'M' con programación estructurada
					for(String linea : datosDevueltos) {
						if(linea.charAt(0)=='M') {
							System.out.println(linea);
						}
					}
				}
				
				if(datosDevueltos!=null) {  // Programación funcional
					datosDevueltos.stream()
						.filter(e->e.charAt(0)=='M')
						.forEach(e->System.out.println(e));
				}
				*/
				
				// Escritura de ficheros
				List<String> lineas = new ArrayList<String>();  // Declara una lista de String vacía
				lineas.add("Línea 1");
				lineas.add("Línea 2");
				lineas.add("Línea 3");
				lineas.add("Línea 4");
				// La siguiente lista tiene el mismo contenido que lineas
				List<String> lineas2 = Arrays.asList("Linea 5" , "Línea 6", "Línea 7", "Línea 8");
				if(escribirLineasJava8(Paths.get("C:\\ficheros\\alumnosLineas.txt"),lineas)) {
					System.out.println("El fichero se escribió correctamente");
				} else {
					System.out.println("Error al escribir en el fichero");
				}
				if(anyadirLineasJava8(Paths.get("C:\\ficheros\\alumnosLineas.txt"),lineas2)){
					System.out.println("Las líneas se añadieron correctamente");
				} else {
					System.out.println("Error al añadir líneas al fichero");
				}
				
				// Ejemplos de Excepciones
				
				//System.out.println(controlarDivisionEntera(10, 0));
				//leerEImprimir();
				//System.out.println("Fin del programa");
			}

		}
			