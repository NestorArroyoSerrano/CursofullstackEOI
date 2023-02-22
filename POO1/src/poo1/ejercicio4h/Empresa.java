package poo1.ejercicio4h;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import poo1.Jugador;

public class Empresa {
	
	private String nombre;
	private Direccion direccion;
	private List<Empleado> empleados; // Aquí declaras la variable pero no permites meter elementos dentro. 
	//private static int numEmpleados; //static un valor único para todas las empresas. Si no pongo static, cada empresa tendría su propio número de empleados. 
	
	public Empresa() {
		// NO OLVIDAR DAR MEMORIA PARA ALMACENAR LOS DIFERENTES OBJETOS
		direccion = new Direccion();
		empleados = new ArrayList<Empleado>(); // Con esto permites meter elementos dentro. Asignación de memoria.
		
	}

	public Empresa(String nombre, Direccion direccion, List<Empleado> empleados) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.empleados = empleados;
		//numEmpleados++;
	}
	
	public Empresa(Empresa e) { // Hacemos copia en profundidad
		super();
		this.nombre = e.nombre;
		this.direccion = new Direccion(e.direccion); // lo metes dentro de una nueva dirección para que genere una nueva
		this.empleados = new ArrayList<Empleado>();
		//e.getJugadores().forEach(j->this.jugadores.add(new Jugador(j))); 
		e.getEmpleados().forEach(emp->this.empleados.add(new Empleado(emp)));  // en la lista empleados, para cada empleado añade un nuevo empleado.
		//numEmpleados++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	/*

	public static int getNumEmpleados() {
		return numEmpleados;
	}

	public static void setNumEmpleados(int numEmpleados) {
		Empresa.numEmpleados = numEmpleados;
	}
	*/

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", direccion=" + direccion + ", empleados=" + empleados + "]";
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
		Empresa other = (Empresa) obj;
		return Objects.equals(nombre, other.nombre);
	}
	

}
