package com.nestor.utilidades;

import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;


public class MenuUtils {

	/**
	 * Metódo genérico que dada una url con un json donde se encuentra un objeto
	 * devuelve un objeto de la clase asociada.
	 * Ejemplo de llamada: JsonUtils.devolverObjetoGsonGenerico("https://swapi.dev/api/people/1/?format=json",People2.class)
	 * @param <T> Nombre de la clase
	 * @param url
	 * @param clase Clase con la que trabajaremos
	 * @return
	 */
	
	public static <T> T leerObjeto(String url, Class<T> clase) {
		return new Gson().fromJson(InternetUtils.readUrl(url), clase);
	}
	
	public static void imprimirMenu(List<String> opciones) {
		for(int i=0; i<opciones.size();i++) {
			System.out.println((i+1) + ".-" + opciones.get(i));
		}
	}
	
	public static void imprimirMenu(String... opciones) {
		int iterador = 1;
		for(String opcion : opciones) {
			System.out.println(iterador++ + ".-" + opcion);			
		}
		System.out.println("0.-Salir");
	}
	

		
	}
	

