package com.nestor.json;

import java.util.ArrayList;
import java.util.List;

import com.nestor.json.entidades.Films;
import com.nestor.json.entidades.People;
import com.nestor.json.entidades.Posts;
import com.nestor.json.utilidades.JsonUtils;

public class App 
{
	static List<Posts> publicaciones = new ArrayList<Posts>();
	
    public static void main( String[] args )
    {
        //JsonUtils.leerJsonDesdeFichero("C:/ficheros/profesor.json");
    	// Leer con Json simple desde Internet
    	/*
        publicaciones = JsonUtils.leerPostsInternet("https://jsonplaceholder.typicode.com/posts");
        publicaciones.stream()
        .filter(e->e.getId()%2==0)  // publicaciones pares        
        .forEach(e->System.out.println(e));
        */
    	// Escribir con Json Simple
    	//JsonUtils.escribirJsonSimple();
    	
    	// Leer personaje con gson
    	/*
    	People luke = JsonUtils.leerPersonaje("https://swapi.dev/api/people/1?format=json");
    	System.out.println(luke);
    	*/
    	// devolver lista de personajes
    	/*
    	List <People> personajes1al10= JsonUtils.leerPersonajes("https://swapi.dev/api/people/", 1, 10, "?format=json");
    	personajes1al10.forEach(e->System.out.println(e));
    	*/
    	Films pelicula = JsonUtils.leerFilm("https://swapi.dev/api/films/1?format=json");
    	System.out.println(pelicula);
    }
}