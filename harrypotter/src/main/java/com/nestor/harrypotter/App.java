package com.nestor.harrypotter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.nestor.harrypotter.entidades.Personaje;
import com.nestor.harrypotter.utilidades.JsonUtils;
import com.nestor.harrypotter.utilidades.SerializacionUtils;

public class App 
{
	static List<Personaje> personajes = new ArrayList<Personaje>();
	final static String URI = "jdbc:mysql://localhost:3306/harry_potter";
	final static String USER = "root";
	final static String PASSWORD = "";
	public static Connection con;
	
	
	public static void ejemploSerializar() {
		// Probamos la serialización
        if(SerializacionUtils.serializarListaObjetos("personajes.dat", personajes)) {
        	System.out.println("La serialización fue satisfactoria");
        } else {
        	System.out.println("La serialización falló");
        }
	}
	
	public static void obtenerDatosApi() {
		// Obtener los datos de la API
        personajes = JsonUtils.devolverArrayGsonGenerico("https://hp-api.onrender.com/api/characters", Personaje[].class);
        personajes.stream()
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
	}
	
	public static void rellenarFechaNacLD() {
		personajes.stream()
        .peek(e->{
        	if(e.getDateOfBirth()!=null) {
        		e.setDateOfBirthLD(LocalDate.parse(e.getDateOfBirth(),DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        	}
        })
        .filter(e->e.getName().equals("Harry Potter"))
        .forEach(e->System.out.println(e));
	}
	
	public static void ejemploDesSerializar() {
		personajes = SerializacionUtils.desSerializarListaObjetos("personajes.dat");
	}
	
	public static void mostrarPersonajes() {
		personajes.forEach(e->System.out.println(e));
	}
	
	public static void probarConexion() {
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			System.out.println("La conexión se realizó correctamente ");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}
	
	public static void poblarBbdd() {
		
		Statement st;
		String sql = "";
		con = null;
		try {
			con = DriverManager.getConnection(URI, USER, PASSWORD);
			st = con.createStatement();
			st.executeUpdate("DELETE FROM personaje");  // Borrar todos los datos de la tabla. Esto lo haremos pruebas y luego lo quitaremos
			for(Personaje personaje : personajes) {
				personaje.setActor(personaje.getActor().replace("'", "''")); // Esto evita el error al intentar intoducir O'Farrell
				 sql = "INSERT INTO personaje("
				 + "id, name, species, gender, house, dateOfBirth, yearOfBirth, wizard, ancestry,"
				 + "eyeColour, hairColour, patronus, hogwartsStudent, hogwartsStaff, actor, alive, image"
				 + ") VALUES('"
				 +personaje.getId()+"','"
				 +personaje.getName()+"','"
				 +personaje.getSpecies()+"','"
				 +personaje.getGender()+"','"
				 +personaje.getHouse()+"',"
				 +((personaje.getDateOfBirthLD()!=null)?"'"+personaje.getDateOfBirthLD()+"'":"NULL")+","
				 +((personaje.getYearOfBirth()!=null)?"'"+personaje.getYearOfBirth()+"'":"NULL")+",'"
				 +((personaje.getWizard())?1:0)+"','"
				 +personaje.getAncestry()+"','"
				 +personaje.getEyeColour()+"','"
				 +personaje.getHairColour()+"','"
				 +personaje.getPatronus()+"','"
				 +((personaje.getHogwartsStudent())?1:0)+"','"
				 +((personaje.getHogwartsStaff())?1:0)+"','"
				 +personaje.getActor()+"','"
				 +((personaje.getAlive())?1:0)+"','"
				 +personaje.getImage()+"');";
				System.out.println(sql);  // En pruebas. Luego la comentamos
				st.executeUpdate(sql);
			}
			
			st.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Fallo en la conexión");
		}
	}
	
    public static void main( String[] args )
    {
    	// Proceso de Serialización
    	//obtenerDatosApi();
    	//rellenarFechaNacLD();       
        //ejemploSerializar();
    	
    	// Proceso de DesSerialización
    	//ejemploDesSerializar();
    	//rellenarFechaNacLD();
    	//mostrarPersonajes();
    	
    	// Proceso de Carga BBDD
    	//probarConexion(); // Prueba la conexión 
    	obtenerDatosApi();
    	rellenarFechaNacLD();
    	poblarBbdd();
    }
}