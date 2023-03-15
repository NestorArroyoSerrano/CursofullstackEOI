package com.nestor.BibliotecaH2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nestor.BibliotecaH2.entidades.Autores;
import com.nestor.BibliotecaH2.entidades.Libros; 

public class App 
{
	
	static SessionFactory sessionFactory;
	static Session session;
	
	public static void openSession() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        if(session!=null) {
        	System.out.println("Sesión abierta correctamente");
        } else {
        	System.out.println("Fallo al abrir la sesión");
        }
	}
	
	public static void closeSession() {
		sessionFactory.close();
		session.close();
	}
	
	public static void mostrarLibros() {
		List<Libros> libros = session.createSelectionQuery("from Libros",Libros.class).list();
		//List<Libros> libros2 = session.createQuery("from Libros").list();
		libros.forEach(e->System.out.println("Nombre del libro: " + e.getTitulo() 
				+ " Nombre del autor: " + e.getAutores().getNombre()));
	}
	
	public static void mostrarAutores() {
		List<Autores> autores = session.createSelectionQuery("from Autores",Autores.class).list();
		autores.forEach(e->System.out.println(e));
	}
	
	public static void anyadirAutor(String cod, String nombre, Set<Libros> libros) {
		 Transaction trans = session.beginTransaction();  // abro la transacción
		 Autores autor = new Autores(cod,nombre,libros);
		 session.persist(autor);  // antiguo save
		 trans.commit();  // confirmo los cambios en la transacción
		 session.clear();
	}
	
	public static void anyadirLibro(int id, Autores autor, String nombre) {
		Transaction trans = session.beginTransaction();  // abro la transacción
		session.persist(new Libros(id,autor,nombre));  // antiguo save
		trans.commit();  // confirmo los cambios en la transacción
		session.clear();  // Para que coja los datos de los set en tiempo real.
	}
	
	public static void updateAutor(String nombreAntiguo, String nombreNuevo) {
		// Busco que quiero actualizar
		List<Autores> autores = session.createSelectionQuery("from Autores where nombre='" + nombreAntiguo + "'",Autores.class).list();
		Transaction trans = session.beginTransaction();
		autores.forEach(e->{
			e.setNombre(nombreNuevo);
			session.merge(e);  // Hibernate <6.0 era update
		});  // Me actualiza los nombres en todos los resultados		
		trans.commit();
		session.clear();
	}
	
	public static void deleteLibro(int id) {
		List<Libros> libros = session.createSelectionQuery("from Libros where id=" + id ,Libros.class).list();
		if(libros.size()>0) {  // Ha encontrado el libro con esa ID
			Transaction trans = session.beginTransaction();
			session.remove(libros.get(0));  // Hibernate <6.0 era delete
			trans.commit();
			session.clear();
		} else {
			System.out.println("No existe ese id a borrar");
		}
	}
	
	
    public static void main( String[] args )
    {
    java.util.logging.Logger.getLogger("org.hibernate").setLevel(java.util.logging.Level.SEVERE);
    openSession();
    //mostrarLibros();
    //mostrarAutores();
    //anyadirAutor("AAAAA", "Nombre de prueba", new HashSet<Libros>(0));
    //anyadirLibro(10, new Autores("WSHAK"), "Libro de prueba");
    //mostrarLibros();
    //updateAutor("Nombre de prueba", "Nombre actualizado");
    deleteLibro(6);
    mostrarAutores();
    closeSession();
    }
}
