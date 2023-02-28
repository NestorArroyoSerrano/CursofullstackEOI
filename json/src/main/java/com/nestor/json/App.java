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
	    	
	    	// leer Personaje con gson
	    	/*
	    	People luke = JsonUtils.leerPersonaje("https://swapi.dev/api/people/1?format=json");
	    	System.out.println(luke);
	    	*/
	    	// devolver lista de personajes
	    	/*
	    	List<People> personajes1al10 = JsonUtils.leerPersonajes("https://swapi.dev/api/people/", 1, 10, "?format=json");
	    	personajes1al10.forEach(e->System.out.println(e));
	    	*/
	    	// Devolver película
	    	/*
	    	Films pelicula = JsonUtils.leerFilm("https://swapi.dev/api/films/1?format=json");
	    	System.out.println(pelicula);
	    	*/
	    	// Leer objetos utilizando el genérico
	    	/*
	    	People luke = JsonUtils.leerObjeto("https://swapi.dev/api/people/1?format=json", People.class);
	    	Films pelicula = JsonUtils.leerObjeto("https://swapi.dev/api/films/1?format=json", Films.class);
	    	System.out.println(luke);
	    	System.out.println(pelicula);
	    	*/
	    	// Leer lista de peliculas utilizando el genérico
	    	/*
	    	List<Films> peliculas = JsonUtils.leerObjetos("https://swapi.dev/api/films/", 1, 5, "?format=json", Films.class);
	    	peliculas.forEach(e->System.out.println(e));
	    	*/
	    	// Leer lista de personajes utilizando el genérico
	    	/*
	    	List<People> personajes = JsonUtils.leerObjetos("https://swapi.dev/api/people/", 8, 14, "?format=json", People.class);
	    	personajes.forEach(e->System.out.println(e));
	    	*/
	    	// Leer lista de posts utilizando el genérico
	    	publicaciones = JsonUtils.devolverArrayGsonGenerico("https://jsonplaceholder.typicode.com/posts",Posts[].class);
	        publicaciones.stream()
	        .filter(e->e.getId()%2==0)  // publicaciones pares        
	        .forEach(e->System.out.println(e));
	    	
	    }
	}