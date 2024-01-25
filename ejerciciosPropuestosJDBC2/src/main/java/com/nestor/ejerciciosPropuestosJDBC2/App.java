package com.nestor.ejerciciosPropuestosJDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.nestor.ejerciciosPropuestosJDBC2.entidades.Category;
import com.nestor.ejerciciosPropuestosJDBC2.entidades.Product;

public class App 
	{
	static final String URL= "jdbc:mysql://localhost:3306/product-manager" ;
	static final String USUARIO= "root"; 
	static final String PASSWORD= "";

	private static boolean insertCategoria(int id, String name ) throws SQLException  {
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
			 int idCategoria = keys.getInt(1);

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
	private static boolean insertProducto(int id, String reference, String name, double price, int category ) throws SQLException  {
		 boolean ok = true;
		    try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
		        conn.setAutoCommit(false);
		        try {
		            PreparedStatement st = conn.prepareStatement("INSERT INTO product VALUES (NULL, ?, ?, ?, ?)",
		                    Statement.RETURN_GENERATED_KEYS);

		            // Debes establecer los valores para todos los parámetros, incluido el primer parámetro.
		            st.setString(1, reference);
		            st.setString(2, name);
		            st.setDouble(3, price);
		            st.setInt(4, category);

		            st.executeUpdate();

		            ResultSet keys = st.getGeneratedKeys();
		            keys.first();
		            int idProducto = keys.getInt(1);

		            // Aquí podrías hacer más operaciones si es necesario

		            conn.commit(); // Todo ok!
		        } catch (SQLException ex) {
		            System.err.println(ex.getMessage());
		            conn.rollback(); // Error!
		            ok = false;
		        }
		    }
		    return ok;
	}
	public static void listarCategorias() {
	Scanner sc = new Scanner (System.in);
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
	
	private static boolean deleteCategoria(int id, String name) throws SQLException {
	    boolean ok = true;
	    try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
	        conn.setAutoCommit(false);
	        try {
	            // Eliminar productos relacionados
	            PreparedStatement deleteProducts = conn.prepareStatement("DELETE FROM product WHERE category = ?");
	            deleteProducts.setInt(1, id);
	            deleteProducts.executeUpdate();

	            // Eliminar la categoría
	            PreparedStatement deleteCategory = conn.prepareStatement("DELETE FROM category WHERE id = ? AND name = ?");
	            deleteCategory.setInt(1, id);
	            deleteCategory.setString(2, name);
	            deleteCategory.executeUpdate();

	            conn.commit(); // Todo ok!
	        } catch (SQLException ex) {
	            System.err.println(ex.getMessage());
	            conn.rollback(); // Error!
	            ok = false;
	        }
	    }
	    return ok;
	}
	public static void mostrarYEliminar() {
		   Scanner scanner = new Scanner(System.in);
	        // Mostrar categorías
	        System.out.println("Categorías disponibles:");
	        listarCategorias();

	        // Solicitar al usuario que seleccione una categoría para eliminar
	        System.out.print("Ingrese el ID de la categoría que desea eliminar: ");
	        int idToDelete = scanner.nextInt();
	        scanner.nextLine(); // Consumir el salto de línea

	        try {
	            // Obtener el nombre de la categoría para mostrarlo al usuario
	            String categoryName = getCategoryNameById(idToDelete);

	            // Confirmar con el usuario antes de eliminar
	            System.out.println("¿Está seguro que desea eliminar la categoría: " + categoryName + "? (S/N)");
	            String confirmation = scanner.nextLine();

	            if (confirmation.equalsIgnoreCase("S")) {
	                // Eliminar la categoría
	                if (deleteCategoria(idToDelete, categoryName)) {
	                    System.out.println("Categoría eliminada exitosamente.");
	                } else {
	                    System.out.println("Error al eliminar la categoría.");
	                }
	            } else {
	                System.out.println("Operación de eliminación cancelada.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            scanner.close();
	        }
	    }

	    // Métodos listarCategorias, deleteCategoria y getCategoryNameById aquí...

	
	private static String getCategoryNameById(int idToDelete) {
		
		return null;
	}
	
	public static void mostrarProductos() {
		Scanner sc = new Scanner (System.in);
		try (Connection con = DriverManager.getConnection(URL, USUARIO, PASSWORD))
	    {
	    	Statement st = con.createStatement();
	    	ResultSet rs = st.executeQuery("Select * from product");
	    	while(rs.next()) {  // recorre todas las filas de los resultados
	    		System.out.println(rs.getInt("id") + ": " + rs.getString("reference") +" " +
	    		rs.getString("name") + "  " +  " precio: " + rs.getDouble("price") +   " categoría: " + rs.getInt("category"));
	    	}
			
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	public static void nuevoPrecio() {
		try {
            // Mostrar categorías y permitir que el usuario seleccione una
            int categoriaSeleccionada = seleccionarCategoria();
            
            // Mostrar productos de la categoría seleccionada y permitir que el usuario seleccione uno
            int productoSeleccionado = seleccionarProductoDeCategoria(categoriaSeleccionada);

            // Preguntar al usuario por un nuevo precio y actualizarlo
            actualizarPrecioProducto(productoSeleccionado);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	
	 public static int seleccionarCategoria() throws SQLException {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Categorías disponibles:");
	        listarCategorias();

	        System.out.print("Ingrese el ID de la categoría deseada: ");
	        int idCategoria = scanner.nextInt();
	        scanner.nextLine(); // Consumir el salto de línea

	        return idCategoria;
	    }

	    public static int seleccionarProductoDeCategoria(int idCategoria) throws SQLException {
	        Scanner scanner = new Scanner(System.in);

	        // Mostrar productos de la categoría seleccionada
	        System.out.println("Productos de la categoría seleccionada:");
	        listarProductosDeCategoria(idCategoria);

	        // Solicitar al usuario que seleccione un producto
	        System.out.print("Ingrese el ID del producto deseado: ");
	        int idProducto = scanner.nextInt();
	        scanner.nextLine(); // Consumir el salto de línea

	        return idProducto;
	    }

	    private static void listarProductosDeCategoria(int idCategoria) {
			
		}
		public static void actualizarPrecioProducto(int idProducto) {
	        Scanner scanner = new Scanner(System.in);

	        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
	             PreparedStatement st = conn.prepareStatement("UPDATE product SET price = ? WHERE id = ?")) {

	            // Obtener el precio actual del producto seleccionado
	            double precioActual = obtenerPrecioProducto(idProducto);
	            System.out.println("Precio actual del producto: " + precioActual);

	            // Solicitar al usuario el nuevo precio
	            System.out.print("Ingrese el nuevo precio para el producto: ");
	            double nuevoPrecio = scanner.nextDouble();
	            scanner.nextLine(); // Consumir el salto de línea

	            // Actualizar el precio del producto
	            st.setDouble(1, nuevoPrecio);
	            st.setInt(2, idProducto);

	            int filas = st.executeUpdate();
	            if (filas > 0) {
	                System.out.println("Precio del producto actualizado correctamente.");
	            } else {
	                System.out.println("Error al actualizar el precio del producto.");
	            }

	        } catch (SQLException ex) {
	            System.err.println(ex.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }

	    public static double obtenerPrecioProducto(int idProducto) throws SQLException {
	        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD);
	             PreparedStatement st = conn.prepareStatement("SELECT price FROM product WHERE id = ?")) {

	            st.setInt(1, idProducto);
	            ResultSet rs = st.executeQuery();

	            if (rs.next()) {
	                return rs.getDouble("price");
	            } else {
	                throw new SQLException("Producto no encontrado.");
	            }
	        }
	    }
	    private static List<Category> obtenerTodasLasCategorias(Connection conn) throws SQLException {
	        List<Category> categorias = new ArrayList<>();
	        String query = "SELECT * FROM category";

	        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");
	                categorias.add(new Category(id, name));
	            }
	        }

	        return categorias;
	    }

	    private static List<Product> obtenerProductosPorCategoria(Connection conn, int categoryId) throws SQLException {
	        List<Product> productos = new ArrayList<>();
	        String query = "SELECT * FROM product WHERE category = ?";

	        try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
	            preparedStatement.setInt(1, categoryId);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                int id = resultSet.getInt("id");
	                String reference = resultSet.getString("reference");
	                String name = resultSet.getString("name");
	                double price = resultSet.getDouble("price");

	                productos.add(new Product(id, reference, name, price, categoryId));
	            }
	        }

	        return productos;
	    }
	    
	    public static void ejercicio7() {
	    	 Map<Category, List<Product>> mapaCategorias  = new HashMap<>();
	    	 
	    	 Category categoria1= new Category(7, "iPhones");
	    	 Category categoria2 = new Category(8, "Android");
	    	 
	    	 Product producto1 = new Product(9, "5001", "Honor 70", 299.99, 8);
	    	 Product producto2 = new Product(10, "1234", "iPhone 14", 1299.99, 7);
	    	 Product producto3 = new Product(11, "5678", "Honor 50", 199.97, 8);
	    	 Product producto4 = new Product(12, "0003", "iPhone 13", 1099.98, 7);
	    	 
	    	 
	    	 for (Map.Entry<Category, List<Product>> entry : mapaCategorias.entrySet()) {
	    		 Category categoria = entry.getKey();
	             List<Product> productos = entry.getValue();

	             System.out.println("Categoría: " + categoria.getName());
	             System.out.println("Productos:");
	             for (Product producto : productos) {
	                 System.out.println("  - " + producto.getName() + " - Precio: " + producto.getPrice());
	             }
	             System.out.println();
	         }
	    }
	    	 public static void ejercicio7a() {
	    		 // Crear el Map que almacena por cada categoría un listado de productos
	    	        Map<Category, List<Product>> mapaCategorias2 = new HashMap<>();
	    	        
	    	        try (Connection conn = DriverManager.getConnection(URL, USUARIO, PASSWORD)) {
	    	            // Obtener todas las categorías
	    	            List<Category> categorias = obtenerTodasLasCategorias(conn);

	    	            // Llenar el Map con las categorías y productos
	    	            for (Category categoria : categorias) {
	    	                // Obtener todos los productos de la categoría
	    	                List<Product> productosCategoria = obtenerProductosPorCategoria(conn, categoria.getId());

	    	                // Agregar la categoría y la lista de productos al Map
	    	                mapaCategorias2.put(categoria, productosCategoria);
	    	            }

	    	            // Recorrer el Map y mostrar su contenido
	    	            System.out.println("Contenido del Mapa:");
	    	            for (Map.Entry<Category, List<Product>> entry : mapaCategorias2.entrySet()) {
	    	                Category categoria = entry.getKey();
	    	                List<Product> productos = entry.getValue();

	    	                System.out.println("Categoría: " + categoria.getName());
	    	                System.out.println("Productos:");
	    	                for (Product producto : productos) {
	    	                    System.out.println("  - " + producto.getName() + " - Precio: " + producto.getPrice());
	    	                }
	    	                System.out.println();
	    	            }
	    	        } catch (SQLException e) {
	    	            e.printStackTrace();
	    	        }
	    	    }
			
			
	     
	    	 
	    

	
		
	
	
    public static void main( String[] args ) 
    {
    	/*
    	try {
			insertCategoria(12, "prueba");
		} catch (SQLException e) {
			System.out.println("Producto no insertado");
			e.printStackTrace();
			*/
    	/*
    	try { 
    		insertProducto(0, "0001", "AMD PRUEBA", 122.22, 4);
			System.out.println("Producto insertado correctamente");
		} catch (SQLException e) {
			System.out.println("Producto no insertado");
			e.printStackTrace();
		}
		*/
    	/*
    	listarCategorias();
    	try {
			deleteCategoria(15, "prueba");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	*/
    	//mostrarYEliminar();
    	//mostrarProductos();
    	//nuevoPrecio();
    	//ejercicio7();
    	ejercicio7a();
		}
	}
    

