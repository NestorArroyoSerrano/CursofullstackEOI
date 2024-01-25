package com.nestor.product_manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nestor.entidades.Category;
import com.nestor.entidades.Product;


public class App 
{
	
	public static final String URL ="jdbc:mysql://localhost:3306/product-manager";
	public static final String USUARIO = "root";
	public static final String PASSWORD = "";
	public static List<Category> category = new ArrayList<Category>();
	public static List <Product> product = new ArrayList<Product>();
	
	
	public static boolean insertCategoriaProducto(int id,  String name)
			 throws SQLException {
			 boolean ok = true;
			 try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
			 conn.setAutoCommit(false);
			 try {
			 PreparedStatement st = conn.prepareStatement("insert into category values(NULL, ?)",
			 Statement.RETURN_GENERATED_KEYS);
			 st.setString(1, name);
			 st.executeUpdate();

			 ResultSet keys = st.getGeneratedKeys();
			 keys.first();
			 int idCategory = keys.getInt(1);

			 // Aquí insertaríamos el producto
			 conn.commit(); // Todo ok!
			 } catch (SQLException ex) {
			 System.err.println(ex.getMessage());
			 conn.rollback(); // Error!
			 ok = false;
			 }
			 }
			 return ok;
			}
	public static boolean insertProductoEnCategoria(int id,  String reference, String name, double price, int category)
			 throws SQLException {
			 boolean ok = true;
			 try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
			 conn.setAutoCommit(false);
			 try {
			 PreparedStatement st = conn.prepareStatement("insert into product values(NULL, ?, ?, ?, ?)",
			 Statement.RETURN_GENERATED_KEYS);
			 st.setString(1, reference);
			 st.setString(2, name);
			 st.setDouble(3, price);
			 st.setInt(4, category);
			 st.executeUpdate();

			 ResultSet keys = st.getGeneratedKeys();
			 keys.first();
			 int idProduct = keys.getInt(1);

			 // Aquí insertaríamos el producto
			 conn.commit(); // Todo ok!
			 } catch (SQLException ex) {
			 System.err.println(ex.getMessage());
			 conn.rollback(); // Error!
			 ok = false;
			 }
			 }
			 return ok;
			}
	public static void mostrarCategorias() {
	
		
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
        {
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("Select * from category");
        	while(rs.next()) {  // recorre todas las filas de los resultados
        		System.out.println(rs.getInt("id") + ": " + rs.getString("name")); 
        		
        	}
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void mostrarProductos() {
	
		
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
        {
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("Select * from product");
        	while(rs.next()) {  // recorre todas las filas de los resultados
        		System.out.println(rs.getInt("id") + ": " + rs.getString("reference") + " " +
        		rs.getString("name") + " " + rs.getDouble("price") + " categoria: " + rs.getInt("category") ); 
        		
        	}
			
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void borrarProducto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona un producto para borrar");
		int respuesta = Integer.parseInt(sc.nextLine());
	
	        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
	            conn.setAutoCommit(false); // Deshabilitar la confirmación automática

	            try {
	                Statement stmt = conn.createStatement();
	                String deleteQuery = "DELETE FROM product WHERE id = " + respuesta;
	                int rowsDeleted = stmt.executeUpdate(deleteQuery);

	                if (rowsDeleted == 1) {
	                    conn.commit(); // Confirmar la transacción si la eliminación fue exitosa
	                    System.out.println("Eliminación exitosa. Transacción confirmada.");
	                } else {
	                    conn.rollback(); // Revertir la transacción si no se eliminó el registro
	                    System.out.println("No se pudo eliminar el registro. Transacción revertida.");
	                }
	            } catch (SQLException ex) {
	                conn.rollback(); // Revertir la transacción en caso de excepción
	                System.err.println("Error durante la eliminación. Transacción revertida.");
	                ex.printStackTrace();
	            }
	        } catch (SQLException e) {
	            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	

	public static void borrarCategoriaYProducto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selecciona una categoría para borrar los productos");
		int respuesta = Integer.parseInt(sc.nextLine());
	
	        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
	            conn.setAutoCommit(false); // Deshabilitar la confirmación automática

	            try {
	                Statement stmt = conn.createStatement();
	                String deleteQuery = "DELETE FROM category WHERE id = " + respuesta;
	                int rowsDeleted = stmt.executeUpdate(deleteQuery);

	                if (rowsDeleted == 1) {
	                    conn.commit(); // Confirmar la transacción si la eliminación fue exitosa
	                    System.out.println("Eliminación exitosa. Transacción confirmada.");
	                } else {
	                    conn.rollback(); // Revertir la transacción si no se eliminó el registro
	                    System.out.println("No se pudo eliminar el registro. Transacción revertida.");
	                }
	            } catch (SQLException ex) {
	                conn.rollback(); // Revertir la transacción en caso de excepción
	                System.err.println("Error durante la eliminación. Transacción revertida.");
	                ex.printStackTrace();
	            }
	        } catch (SQLException e) {
	            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
	
	private static void displayCategories() throws SQLException {
        String query = "SELECT id, name FROM category";
    	
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
        {
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("Select * from category");
        	while(rs.next()) {  // recorre todas las filas de los resultados
        		System.out.println(rs.getInt("id") + ": " + rs.getString("name")); 
          
            }
        }
    }

    private static int selectCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el número de la categoría: ");
        int selectedCategoryId = scanner.nextInt();
        return selectedCategoryId;
    }

    private static void displayProductsInCategory() throws SQLException {
        String query = "SELECT id, name FROM product WHERE category_id = ?";
        try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
        {
        	Statement st = con.createStatement();
        	ResultSet rs = st.executeQuery("Select * from category");
        	while(rs.next()) {  // recorre todas las filas de los resultados
        		System.out.println(rs.getInt("id") + ": " + rs.getString("name")); 
        	}
        }
    }

    private static int selectProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el número del producto: ");
        int selectedProductId = scanner.nextInt();
        return selectedProductId;
    }

    private static double askForNewPrice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nuevo precio: ");
        double newPrice = scanner.nextDouble();
        return newPrice;
    }

    private static boolean updateProducto(int id, String reference, String name, double price, int
    		category) {
    		 try(Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
    		 PreparedStatement st = conn.prepareStatement(
    		 "update product set reference = ?, name = ?, price = ?, category = ? where id = ?");
    		 ) {
    		 st.setString(2, reference);
    		 st.setString(3, name);
    		 st.setDouble(4, price);
    		 st.setInt(5, category);
    		 

    		 int filas = st.executeUpdate();
    		 return filas > 0;
    		 } catch (SQLException ex) {
    		 System.err.println(ex.getMessage());
    		 return false;
    		 }
    		}
	
	






	
	
	
	
    public static void main( String[] args ) 
    {
    	/*
      try {
		insertCategoriaProducto(5,"Hola");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		*/
    	/*
		try {
			insertProductoEnCategoria(5, "2345", "TUANO", 0, 5);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
    	//mostrarProductos();
    	//borrarProducto();
    	//borrarCategoriaYProducto();
    	//mostrarCategorias();
    	//borrarCategoriaYProducto();
    	try {
			displayCategories();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	selectCategory();
    	try {
			displayProductsInCategory();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	selectProduct();
    	askForNewPrice();
    }
}
    


