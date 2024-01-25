package com.fran.clases;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona p1 = new Persona();  // Llama al constructor vacio
        Persona p2 = new Persona("Fran","111");  // Llama a uno de los constructores con parámetros
        Persona p3 = new Persona("Fran", "222", LocalDate.of(1976, 7, 27), 'H', "Mi casa", 'S', 1000.0, 12345);
        Persona p4 = p3;  // No estás creando un nuevo objeto, simplemente un alias al mismo objeto, porque es otra forma de accceder a la misma dirección de memoria
        Persona p5 = new Persona(p2);  // Utilizo el constructor de copia
        
        System.out.println("Nombre: " + p1.getNombre() + " Sexo: " + p1.getSexo());
        p1.setNombre("Adrián");
        p1.setSexo('A');
        System.out.println("Nombre: " + p1.getNombre() + " Sexo: " + p1.getSexo());
        System.out.println(p3.getDeuda());
        System.out.println(p3);
        
        //Modifico p3 (se cambia en p4 porque son lo mismo)
        p3.setNombre("Nombre cambiado");
        // p4 es igual a p3 => SI
        System.out.println(p4); // también se puede System.out.println(p4.toString());        
        
        if(p3.equals(p4)) {
        	System.out.println("Son la misma persona");
        } else {
        	System.out.println("No son la misma persona");
        }
        
        Persona p6 = new Persona(p3);
        if(p3.equals(p6)) {
        	System.out.println("Son la misma persona");
        } else {
        	System.out.println("No son la misma persona");
        }
        
        if(p1.mayorEdad()) {
        	System.out.println("Es mayor de edad");
        }
        
        System.out.println("El número de personas es: " + Persona.getContador());
        
        Profesor pr1 = new Profesor();
        pr1.setNombre("Fran");
        System.out.println(pr1);
        Profesor pr2 = new Profesor("Fran", "111", "EOI", 10000);
        System.out.println(pr2);
        Profesor pr3 = new Profesor("EOI", 10000);
        System.out.println(pr3);
        if(pr2.equals(pr3)) {
        	System.out.println("son el mismo profesor");
        }else {
        	System.out.println("NO son el mismo profesor");
        }
        
        //Humano h1 = new Humano();
        Hombre h1 = new Hombre();
        h1.nombreInverso();
        
    }
}
