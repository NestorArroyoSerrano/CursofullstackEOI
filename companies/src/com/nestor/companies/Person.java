package com.nestor.companies;

import java.util.Objects;

public class Person {

	String nombre;
	int edad;
	
	
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Person() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
}
