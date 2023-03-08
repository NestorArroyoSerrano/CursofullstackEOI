package com.nestor.jdbc;

import java.util.ArrayList;
import java.util.List;

import com.nestor.jdbc.entidades.Tabla1;
import com.nestor.jdbc.utilidades.JdbcUtils;

public class App 
{
	
	static List<Tabla1> datos = new ArrayList<Tabla1>();
	
    public static void main( String[] args )
    {
        if(JdbcUtils.conexion()) {
        	// Aquí irá el programa
            // JdbcUtils.selectBasica();
        	datos = JdbcUtils.devolverRegistrosTabla1();
        	datos.stream()
        		.filter(e->e.getNombre().length()>4)
        		.forEach(e->System.out.println(e.getNombre()));
            JdbcUtils.desconexion();
        }
        
    }
}