package ejercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

	/*
		Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
		stringBits("Hello") → "Hlo"
		stringBits("Hi") → "H"
		*/
	
	public static String nuevoString (String palabra) {
		
		StringBuilder resultado = new StringBuilder();

	    for (int i = 0; i < palabra.length(); i += 2) {
	        resultado.append(palabra.charAt(i));
	    }

	    return resultado.toString();
	}
	
	public static boolean doubleX(String palabra) {
		
		 // Encuentra la posición de la primera aparición de "x"
	    int index = palabra.indexOf('x');

	    // Verifica si "x" está presente y si el siguiente caracter es también "x"
	    return index != -1 && index + 1 < palabra.length() && palabra.charAt(index + 1) == 'x';
	}
	/*
	 * 
		Given a non-empty string like "Code" return a string like "CCoCodCode".	
		stringSplosion("Code") → "CCoCodCode"
		stringSplosion("abc") → "aababc"
		stringSplosion("ab") → "aab"
	 */
	
	public static String stringSplosion(String palabra) {
		 StringBuilder result = new StringBuilder();
		    
		    for (int i = 0; i < palabra.length(); i++) {
		        result.append(palabra.substring(0, i + 1));
		    }
		    
		    return result.toString();
		}
	/*
	 * Given a string, return the count of the number of times that a substring length 2 
	 * appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 */
	
	public static int last2(String palabra) {
		 // Asegurarse de que la cadena tenga al menos 2 caracteres
	    if (palabra.length() < 2) {
	        return 0;
	    }

	    // Obtener el substring de los últimos 2 caracteres
	    String lastTwoChars = palabra.substring(palabra.length() - 2);

	    // Contador para el número de ocurrencias
	    int count = 0;

	    // Iterar a través de la cadena, excluyendo los últimos 2 caracteres
	    for (int i = 0; i < palabra.length() - 2; i++) {
	        // Obtener el substring de longitud 2 en la posición actual
	        String substring = palabra.substring(i, i + 2);

	        // Verificar si el substring coincide con los últimos 2 caracteres
	        if (substring.equals(lastTwoChars)) {
	            count++;
	        }
	    }

	    return count;
	}
	public static String invertirPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        StringBuilder resultado = new StringBuilder();
        
        for (String palabra : palabras) {
            String palabraInvertida = new StringBuilder(palabra).reverse().toString();
            resultado.append(palabraInvertida).append(" ");
        }
        
        return resultado.toString().trim();
    }
	public static double sumarNumeros(List<Double> numeros) {
		
		
		return numeros.stream().reduce(0.0, Double::sum);
	}
	public static void añadeNumero(double numero) {
		List<Double> numeros = new ArrayList<>();
		
		numeros.add(numero);
	
	}

	
	
	public static void main(String[] args)throws IOException{
		//dibujaAsteriscos(5);
		/*
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
		System.out.println(nuevoString("Hola"));
		*/
		//System.out.println(doubleX("Holaaa"));
		//System.out.println(stringSplosion("Buenas"));
		//System.out.println(last2("xxghghxxghgxx"));
		//System.out.println(invertirPalabras("Hola Mundo"));
		
		  List<Double> numeros = new ArrayList<>();
	        numeros.add(1.5);
	        numeros.add(2.5);
	        numeros.add(3.5);
	        double suma = sumarNumeros(numeros);
	        System.out.println("La suma de los números es: " + suma);
	}

}
