package com.nestor.proyectoclases.utilidades;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FicherosUtils {
	
	/**
	 * Método que lee un fichero y devuelve sus lineas en una lista
	 * @param ruta Path con la ruta del fichero
	 * @return Lista de cadenas, una por cada línea.
	 */
	public static List<String> devolverLineasJava8(Path ruta){
		try {
			List<String> lineas = Files.readAllLines(ruta,Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se puede acceder al fichero. Error en devolverLineasJava8");
			return null;
		}
	}

}
