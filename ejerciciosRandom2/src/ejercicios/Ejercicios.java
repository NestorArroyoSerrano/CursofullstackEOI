package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Ejercicios {

	
	public static void dibujaAsteriscos(int numero) {
		
		for (int i = 0; i<=numero; i++) {
			System.out.print("*");
		}
	}
	
	public static void recibeParametros(String cadena, int numero1, int numero2) {
		
		
	}
	
	public static double devuelveMedia(double[] numeros) {
		double resultado = 0;
		for(double numero : numeros) {
			resultado += numero;
		}
		return resultado/numeros.length;
	}
	public static int apareceSubcadena(String cadena, String subcadena) {
		int posicionBuscar = 0;
		int resultado = 0;
		while((posicionBuscar=cadena.indexOf(subcadena,posicionBuscar))!=-1) {
			resultado++;
			posicionBuscar++;
		}
		return resultado;
			
		}
	public static int apareceSubcadenab(String cadena, String subcadena) {
		int numero =-1;
		int veces = 0;
		numero = cadena.indexOf(subcadena);
		while(numero!=-1) {
			veces++;
			numero=cadena.indexOf(subcadena,numero+1);
		}
		return veces;
		
	}
	public static void ejemplosFechas() {
		
		LocalDate fecha = LocalDate.now();
		System.out.println(fecha);
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
		LocalTime dentro1Hora = ahora.plusHours(1);
		System.out.println(dentro1Hora);
		LocalTime dentroDe5Min = ahora.plusMinutes(5);
		System.out.println(dentroDe5Min);
	}
	
	public static LocalDate convertirFechaSubstring(String fechaCadena) {
		// "27-07-1976"
		/*
		String dia = fechaCadena.substring(0, 2); // "27"
		String mes = fechaCadena.substring(3, 5); // "07"
		String anyo = fechaCadena.substring(6, 10); // "1976"
		LocalDate resultado = LocalDate.of(Integer.parseInt(anyo), Integer.parseInt(mes), Integer.parseInt(dia));
		return resultado;
		*/
		return LocalDate.of(Integer.parseInt(fechaCadena.substring(6, 10)), 
				Integer.parseInt(fechaCadena.substring(3, 5)), 
				Integer.parseInt(fechaCadena.substring(0, 2)));
		
	}
	
	public static LocalDate convertirFechaSplit(String fechaCadena, String separador) {
		String [] partes = fechaCadena.split(separador);
		return LocalDate.of(Integer.parseInt(partes[2]), 
				Integer.parseInt(partes[1]), 
				Integer.parseInt(partes[0]));
	}
	
	public static LocalDate sumarTiempos(LocalDate fechaInicio, int dias, int meses, int anyos) {
		return fechaInicio.plusYears(anyos).plusMonths(meses).plusDays(dias);
	}
	
	
	
	public static LocalDate ejercicio15(String fechaCadena) {
		
	// Convertir el String en LocalDate
	 LocalDate fecha = convertirFechaSubstring(fechaCadena);
	 // Sumar tiempos a un LocalDate
	 fecha = sumarTiempos(fecha, 5, 3, 2);
	 // Devolver el resultado
	 return fecha;
	}
	public static void leerFicheros(Path ruta) throws IOException {
		//System.out.println(ruta.toString());
		//System.out.println(ruta.toAbsolutePath().toString()); // para saber la ruta que está intentando abrir
		Files.readAllLines(ruta).forEach(l->System.out.println(l));
		
	}
	public static List<String> devolverLineasJava8(Path ruta) {
		try {
			List<String> lineas = Files.readAllLines(ruta);
			return lineas;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se puede acceder al fichero. Error en devolverLineasJava8");
			return null;
			
		}
	}
	
	
	public static void main(String[] args)throws IOException{
		//dibujaAsteriscos(5);
		double [] numeros = {12.45, 23.45, 65.76};
		System.out.println(devuelveMedia(numeros));
		int veces = apareceSubcadena("cocinando cocos con chocolate", "co");
		System.out.println(veces);
		System.out.println(apareceSubcadenab("cocinando cocos con chocolate", "co"));
		ejemplosFechas();
		//leerFicheros(Paths.get("datos", "datos.txt"));
		List<String> datosDevueltos = devolverLineasJava8(Paths.get("datos", "datos.txt"));
		if(datosDevueltos!=null)
			 datosDevueltos.forEach(e->System.out.println(e));
		
	}

}
