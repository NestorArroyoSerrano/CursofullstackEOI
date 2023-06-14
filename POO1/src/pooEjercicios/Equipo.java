package pooEjercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	private String nombre;
	private Estadio estadio;
	private List<Jugador> jugadores;
	private double presupuesto;
	
	public Equipo() {
		
	}

	public Equipo(String nombre, Estadio estadio, List<Jugador> jugadores, double presupuesto) {
		super();
		this.nombre = nombre;
		this.estadio = estadio;
		this.jugadores = jugadores;
		this.presupuesto = presupuesto;
	}
	public Equipo(Equipo e) {
		super();
		this.nombre = e.nombre;
		this.presupuesto = e.presupuesto;
		this.estadio = new Estadio(e.estadio);
		this.jugadores = new ArrayList<Jugador>();
		e.getJugadores().forEach(j->this.jugadores.add(new Jugador (j)));
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", estadio=" + estadio + ", jugadores=" + jugadores + ", presupuesto="
				+ presupuesto + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	/**
	 * Añadir el jugador a la lista de jugadores del equipo
	 * @param j
	 */
	public void addJugador(Jugador j) {
		jugadores.add(j);
	}
	/**
	 * Devuelve el número de jugadores del equipo
	 * @return
	 */
	public int getNumJugadores() {
		return jugadores.size();
	}


	public Jugador getJugador(int posicion) {
		try {
			return jugadores.get(posicion);
		} catch (Exception e) {
			return null;
		}
	}
		
	public void deleteJugador(int posicion) {
		try {
			jugadores.remove(posicion);
		} catch (Exception e) {
			return;
		}
	}
		
	public double totalSueldos() {
			double sumaSueldos=0;
			for(Jugador jugador:jugadores) {
				sumaSueldos+= jugador.getSueldo();
			}
		return sumaSueldos;
		
	}
	
	/*
	public boolean addJugador(Jugador j) {
		try {
			jugadores.add(j);
			return true;
		} catch (Exception e) {
			return false;
		}
		*/
	}
	
	

