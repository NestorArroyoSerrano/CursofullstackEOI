package com.nestor.ejercicioFFC.utils;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.nestor.ejercicioFFC.App;

public class BusquedaProducto {
	

	public static String buscarProducto(double saldo, int edad) {
		
		List<String> productos = new ArrayList<String>();
    	FileSystem sistemaFicheros=FileSystems.getDefault();
    	ArrayList<String> datosFichero = new ArrayList<String>();
    	Path rutaFichero=sistemaFicheros.getPath(App.ruta + "\\" + "productosofertados.txt"); 
    	datosFichero = (ArrayList<String>) App.devolverLineasJava8(rutaFichero);
    	String[] resultado = {""};
    	String[] productoOfertado = null;
    	
    	//Recorres la lista de productos y comparas
    	for(int j = 0; j < datosFichero.size(); j++) {
    		resultado = datosFichero.get(j).split(";");
    		if ((Integer.parseInt(resultado[0]) <= edad && Integer.parseInt(resultado[1]) >= edad) && (Integer.parseInt(resultado[2]) <= saldo && Integer.parseInt(resultado[3]) >= saldo)) {
    			if(productoOfertado != null) {
    				//comparas el salario mínimo
    				if(Integer.parseInt(resultado[2]) > Integer.parseInt(productoOfertado[2])){
    					productoOfertado = resultado;
    				}
    			}
    			else {
    				productoOfertado = resultado;
    			}
    		}
    	}    
		
    	return productoOfertado[4];
    	
	}
}