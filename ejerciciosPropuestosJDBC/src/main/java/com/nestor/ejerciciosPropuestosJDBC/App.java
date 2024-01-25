package com.nestor.ejerciciosPropuestosJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestor.ejerciciosPropuestosJDBC.entidades.Categoria;
import com.nestor.ejerciciosPropuestosJDBC.entidades.Departamento;
import com.nestor.ejerciciosPropuestosJDBC.entidades.Empleado;

public class App 
{
	
	static final String URL = "jdbc:mysql://localhost:3306/eoi2";
	static final String USUARIO = "root";
	static final String PASSWORD = "";
	public static List<Empleado> empleados = new ArrayList<Empleado>();  // Lista de empleados vacía inicialmente
	public static List<Categoria> categorias = new ArrayList<Categoria>();  // Lista de empleados vacía inicialmente
	
	public static void probarConexion() {
	try(Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
		 System.out.println("Conexión establecida");
		 } catch (SQLException ex) {
		 System.err.println(ex.getMessage());
	 }
	}
	
	public static void listarCategorias() {
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
        {
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("Select * from categorias");
        	while(rs.next()) {  // recorre todas las filas de los resultados
        		System.out.println(rs.getInt("categoria") + ": " + rs.getString("titulo") 
        		+ " salario: " + rs.getInt("salario") + " trienio: " + rs.getInt("trienio"));
        	}
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		public static void listarEmpleados40Anyos() {
			/*
			try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
	        {
	        	Statement st = con.createStatement();
	        	ResultSet rs = st.executeQuery("Select * from empleados where edad>40");
	        	while(rs.next()) {  // recorre todas las filas de los resultados
	        		System.out.println(rs.getString("nombre") + " tiene " + rs.getInt("edad") + " años");
	        	}
				
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
			// Con PreparedStatement
			try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
	            // Tu sentencia SQL con un marcador de posición para la edad
	            String sql = "SELECT * FROM empleados WHERE edad > ?";
	            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
	                // Valor que deseas utilizar para la comparación (edad > 40 en este caso)
	                int edadLimite = 40;
	                preparedStatement.setInt(1, edadLimite);

	                // Ejecutar la consulta
	                try (ResultSet rs = preparedStatement.executeQuery()) {
	                    while (rs.next()) {  
	                        // Recorre todas las filas de los resultados
	                        System.out.println(rs.getString("nombre") + " tiene " + rs.getInt("edad") + " años");
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}
		
		public static void insertarDepartamento() {
			Scanner sc = new Scanner (System.in);
			System.out.println(" Número de departamento que quieres insertar: ");
			int dptno = Integer.parseInt(sc.nextLine());
			System.out.println(" Dime el nombre del departamento que quieres insertar: ");
			String nombre = sc.nextLine();
			
			try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
	        {
	        	Statement st = con.createStatement();
	        	String sql = "INSERT INTO departamentos VALUES (" + dptno + ", '" + nombre + "')";
	        	System.out.println(sql);
	        	int filasInsertadas = st.executeUpdate(sql);
	        	System.out.println("Se ha insertado " + filasInsertadas + (filasInsertadas==1?" fila":" filas") );    				
	        } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
		}
		private static boolean deleteDepartamento(int deptno) {
			 try(Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
			 PreparedStatement st = conn.prepareStatement(
			 "delete from departamentos where deptno = ?");
			 ) {
			 st.setInt(1, deptno);

			 int filas = st.executeUpdate();
			 if (filas > 0) {
				 System.out.println("Departamento borrado correctamente");
				 return true;
			 }else {
				 System.out.println("No se encontró el departamento que desea borrar");
				 return false;
			 }
			 } catch (SQLException ex) {
			 System.err.println(ex.getMessage());
			 return false;
			 }
			}{
			
		}
		

	
    public static void main( String[] args )
    {
    	//probarConexion();
    	//listarCategorias();
    	//listarEmpleados40Anyos();
    	//insertarDepartamento();
    	deleteDepartamento(7);
    }
 }
