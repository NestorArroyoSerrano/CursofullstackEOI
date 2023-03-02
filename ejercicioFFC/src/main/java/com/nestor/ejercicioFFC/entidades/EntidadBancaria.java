package com.nestor.ejercicioFFC.entidades;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EntidadBancaria {

	public Cliente cliente;
	static final String ruta = "C:\\Users\\Néstor\\Documents\\FullstackEOI\\CursofullstackEOI\\ejercicioFFC\\src\\main\\java\\ficheros";
	public EntidadBancaria(Cliente cliente) {
		super();
		this.cliente = cliente;
	}
	
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
}
