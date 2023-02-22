package poo1.ejercicio4h;

public class Ejercicio4 {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Empleado fran = new Empleado("Fran",10000); // creo el empleado y luego lo añado a la lista
		empresa.getEmpleados().add(fran);
		empresa.getEmpleados().add(new Empleado("Dani",10000)); // Creo el empleado sobre la marcha y lo añado
		empresa.getEmpleados().add(new Empleado("Paco",20000)); // Creo el empleado sobre la marcha
		
		Empresa copia = new Empresa(empresa); // Copiar una empresa a partir de otra
		copia.getEmpleados().get(0).setNombre("Francisco"); // Cambio el nombre al primer empleado
		copia.getDireccion().setNumero(10); // Cambiar el número de la calle de la dirección de la empresa copia
		copia.getEmpleados().add(new Empleado("Nuevo", 30000)); // Añado un nuevo empleado en la copia
		
		// Mostramos los valores de la empresa original y de la copia
		System.out.println("Empresa original");
		System.out.println(empresa);
		System.out.println(" La empresa original tiene " + empresa.getEmpleados().size());
		System.out.println("Empresa copia");
		System.out.println(copia);
		System.out.println(" La empresa original tiene " + copia.getEmpleados().size());
		
		//System.out.println("El número de empleados de todas las empresas es: " + Empresa.getNumEmpleados());
	}

}
