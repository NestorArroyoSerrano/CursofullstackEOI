package com.nestor.ejercicioFFC;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


import com.nestor.ejercicioFFC.entidades.Cliente;
import com.nestor.ejercicioFFC.entidades.EntidadBancaria;
import com.nestor.ejercicioFFC.utils.BienvenidaUtils;
import com.nestor.ejercicioFFC.utils.BusquedaProducto;
import com.nestor.ejercicioFFC.utils.FechasUtils;

public class App 
{
	public static final String ruta = "C:\\Users\\Néstor\\Documents\\FullstackEOI\\CursofullstackEOI\\ejercicioFFC\\src\\main\\java\\ficheros";
	
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
	
	public static void imprimirFecha(String idioma) {
		System.out.println(FechasUtils.obtenerFechaFormatoLargoPais(idioma));
	}
	

	public static String imprimirMenu(ArrayList<String> datos) {
		
		String[] resultado = {""};
		int fechaEscogida = 0;
		String fecha;
		ArrayList<String> fechas = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < datos.size(); i++) {
			//Recorres y comparas fechas
			 String datosCliente = datos.get(i);
	        resultado = datosCliente.split(";");
	        fecha = resultado[2];
			for(int j = 0; j < datos.size() ; j++) {
				//Sacas las demas fechas
				    datosCliente = datos.get(j);
			        resultado = datosCliente.split(";");
			        String fechaComparar = resultado[2];
				if(fecha != fechaComparar && !fechas.contains(fecha)) {
					fechas.add(fecha);
				}
			}
			
		}
		
		if(fechas.size() != 0) {
	        System.out.println("Hay incongruencias con la fecha de nacimiento.");
	        System.out.println("Por favor, seleccione la suya");
	        
	        for(int i = 0; i < fechas.size(); i++) {
		        System.out.println(i+1 + ": " + fechas.get(i));
	        }
	        System.out.println("Fecha escogida: ");	
	        fechaEscogida = sc.nextInt() - 1;

	        
		}

		return fechas.get(fechaEscogida);
	}

	
	
    public static void main( String[] args )
    {
    	List<String> bancos = new ArrayList<String>();
    	FileSystem sistemaFicheros=FileSystems.getDefault();
    	Path rutaFichero; 
    	String[] resultado = {""};
    	String fechaEscogida;
    	double saldoTotal;
    	
    	bancos.add("caixa.txt");
    	bancos.add("sabadell.txt");
    	bancos.add("santander.txt");
    	
    	Scanner sc = new Scanner(System.in);
        System.out.println("DNI: ");
        String dniCif = sc.nextLine();
        Cliente cliente = new Cliente();
        ArrayList<String> datosCliente = new ArrayList<String>();
        ArrayList<String> datosFichero = new ArrayList<String>();
        
        // Coges los datos de todos los bancos donde pueda estar el cliente
        for(int i = 0; i < bancos.size(); i++) {
        	rutaFichero=sistemaFicheros.getPath(ruta + "\\" + bancos.get(i)); 
        	System.out.println("rutaFichero: " + rutaFichero);
        	datosFichero = (ArrayList<String>) devolverLineasJava8(rutaFichero);
        	// Buscas informacion coincidente
        	for(int j = 0; j < datosFichero.size(); j++) {
        		resultado = datosFichero.get(j).split(";");
        		if (dniCif.equals(resultado[0])) {
        			datosCliente.add(datosFichero.get(j));
        		}
        	}         
        }
        
        if(datosCliente.size() == 0) {
        	System.out.println("No hay coincidencias de clientes");
        }
        
        for(int i = 0; i < datosCliente.size(); i++) {
        	System.out.println("datosCliente: " + datosCliente.get(i));
        }
        
        // Cogemos el primero de la lista y sacamos nombre y lenguaje
        String datos = datosCliente.get(0);
        resultado = datos.split(";");
        BienvenidaUtils bienvenida = new BienvenidaUtils(resultado[3], resultado[1]);
        System.out.println(bienvenida.hello);
        imprimirFecha(resultado[3]);
        fechaEscogida = imprimirMenu(datosCliente);
        System.out.println("Fecha escogida: " + fechaEscogida);
        
        
        double saldo = 0.0;
        for(int j = 0; j < datosCliente.size(); j++) {
            resultado = datosCliente.get(j).split(";");
                saldo += Double.parseDouble(resultado[4]);
                System.out.println("Saldo total: " + saldo);               
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        int edad = LocalDate.now().getYear() - LocalDate.parse(fechaEscogida, formatter).getYear();
        String producto = BusquedaProducto.buscarProducto(saldo, edad);
        System.out.println("Producto: " + producto);
    }
}
        

