package com.fran.clases;

import java.time.LocalDate;

public class Persona {
	
	// Creamos los atributos de la clase
	private String nombre;
	private String dni;
	private LocalDate fechaNacimiento;
	private char sexo;  // H - Hombre, M - Mujer
	private String domicilio;
	private char estadoCivil; // C - Casado, S - Soltero, D - Divorciado
	private double deuda;
	private int cuenta;
	
	private static int contador;  // Los contadores estarán en TODOS los constructores
	
	
	final private int MAYORIAEDAD = 18;
	
	// Constructores
	
	// Vacio (por Defecto)
	public Persona() {
		contador++;
	}

	// Todos los parámetros
	public Persona(String nombre, String dni, LocalDate fechaNacimiento, char sexo, String domicilio, char estadoCivil,
			double deuda, int cuenta) {
		super();  // Ejecuta el constructor de quién herada, en este caso es Object
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.domicilio = domicilio;
		this.estadoCivil = estadoCivil;
		this.deuda = deuda;
		this.cuenta = cuenta;
		contador++;
	}

	public Persona(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		contador++;
	}
	
	// Constructor de copia
	public Persona(Persona p) {
		super();
		this.nombre = p.nombre;
		this.dni = p.dni;
		this.fechaNacimiento = p.fechaNacimiento==null?LocalDate.of(1976, 7, 27):p.fechaNacimiento;
		this.sexo = p.sexo;
		this.domicilio = p.domicilio;
		this.estadoCivil = p.estadoCivil;
		this.deuda = 0;
		this.cuenta = p.cuenta;
		contador++;
	}

	// Getters and Setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if(sexo!='M' && sexo!='H') {
			this.sexo = 'M';
		} else {
			this.sexo = sexo;
		}		
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public double getDeuda() {
		if(this.nombre.equals("Fran")) {
			return 0;
		} else {
			return deuda;
		}		
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public int getCuenta() {
		return cuenta;
	}

	// Método toString
	@Override
	public String toString() {
		return "nombre: " + nombre +
				"\ndni: " + dni + 
				"\ndomicilio: " + domicilio + 
				"\nNúmero de cuenta: " + cuenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cuenta;
		long temp;
		temp = Double.doubleToLongBits(deuda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
		result = prime * result + estadoCivil;
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + sexo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cuenta != other.cuenta)
			return false;
		if (Double.doubleToLongBits(deuda) != Double.doubleToLongBits(other.deuda))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (domicilio == null) {
			if (other.domicilio != null)
				return false;
		} else if (!domicilio.equals(other.domicilio))
			return false;
		if (estadoCivil != other.estadoCivil)
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo != other.sexo)
			return false;
		return true;
	}

	// Métodos propios de la clase
	
	public boolean mayorEdad() {
		if(this.fechaNacimiento!=null) 
			return this.fechaNacimiento.getYear()>=MAYORIAEDAD?true:false;
		return false;
	}

	public static int getContador() {
		return contador;
	}
	
}
