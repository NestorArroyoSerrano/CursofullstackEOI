package pooEjercicios;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import poo1.Equipo;
import poo1.Estadio;
import poo1.Jugador;

public class EjerciciosMain {

	public static void ejercicio1() {
		List <Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(new Jugador("Néstor", 35, 40000));
		Jugador jugador1 = new Jugador("Fran", 45, 50000);
		Jugador jugador2 = new Jugador("David", 20, 40000);
		jugadores.forEach(e->System.out.println(e));
		System.out.println(jugador2);
		
		
	}
	public static void ejemploEquipos() {
		Equipo barsa = new Equipo();
		barsa.setNombre("F.C. Barcelona");
		barsa.setPresupuesto(400000000);
		Estadio campNou = new Estadio(); // Creo el estadio y le doy datos
		campNou.setNombre("Spotify Camp Nou");
		campNou.setCapacidad(100000);
		barsa.setEstadio(campNou); // asigno el estadio al equipo
		List<Jugador> jugadoresBarsa = new ArrayList<Jugador>(); // Creo la lista y le meto jugadores
		jugadoresBarsa.add(new Jugador("Fran", 45, 100000));
		jugadoresBarsa.add(new Jugador("Paco", 70, 200000));
		jugadoresBarsa.add(new Jugador("Dani", 42, 300000));
		jugadoresBarsa.add(new Jugador("Consu", 39, 400000));
		barsa.setJugadores(jugadoresBarsa);
		System.out.println("Fin de la creación del equipo");
		// Imprimpo el equipo
		// System.out.println(barsa);

		// Probamos el constructor de copia
		Equipo madrid = new Equipo(barsa);
		madrid.setNombre("Real Madrid");
		madrid.setPresupuesto(100000);
		barsa.getEstadio().setNombre("Nuevo Campo"); // Le cambio el nombre del estadio del barsa
		madrid.getEstadio().setNombre("Santiago Bernabeu");
		madrid.getEstadio().setCapacidad(80000);
		// Accede al equipo, luego a su lista de jugadores, luego a su primer elemento
		// de la lista y luego le cambia el nombre
		barsa.getJugadores().get(0).setNombre("Francisco");
		madrid.getJugadores().get(1).setNombre("Ate");

		// Impresión de los equipos
		System.out.println(barsa); // Imprimo el Barsa
		System.out.println(madrid); // Imprimo el Madrid
	}
	
	public static void ejercicio4() {
		Equipo equipo = new Equipo();
		equipo.setNombre("Equipo EOI");
		equipo.addJugador(new Jugador("Pepito", 25, 25000));
		equipo.addJugador(new Jugador("Fran", 30, 30000));
		equipo.addJugador(new Jugador("Peter", 18, 20000));
		equipo.addJugador(new Jugador("Paco", 35, 10000));
		equipo.addJugador(new Jugador("Ampeter", 25, 30000));
		equipo.deleteJugador(0);
		equipo.getJugadores().forEach(e->System.out.println(e));
		System.out.println("La suma total de los sueldos del equipo es: " + equipo.totalSueldos());
		System.out.println(equipo);
	}
	
	public static void main(String[] args) {
		//ejercicio1();
		//ejemploEquipos();
		ejercicio4();
	}

}
