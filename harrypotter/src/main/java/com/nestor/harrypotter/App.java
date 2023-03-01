package com.nestor.harrypotter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.nestor.harrypotter.entidades.Personaje;
import com.nestor.harrypotter.utilidades.JsonUtils;
import com.nestor.harrypotter.utilidades.SerializacionUtils;

public class App 
{
	static List<Personaje> personajes = new ArrayList<Personaje>();
	
    public static void main( String[] args )
    {
    	
    	//Obtener los datos de la API
        personajes = JsonUtils.devolverArrayGsonGenerico("https://hp-api.onrender.com/api/characters", Personaje[].class);
        personajes.stream()
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
        
        // Rellenar el campo dateOfBirthLD
        personajes.stream()
        .peek(e->{
        	if(e.getDateOfBirth()!=null) {
        		e.setDateOfBirthLD(LocalDate.parse(e.getDateOfBirth(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        	}
        })
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
        
        // Probamos la serialización
        if(SerializacionUtils.serializarListaObjetos("personajes.dat", personajes)) {
        	System.out.println("La serialización fue satisfactoria");
        } else {
        	System.out.println("La serialización falló");
        }
    }
}