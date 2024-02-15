package com.nestor.springboot.backend.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.springboot.backend.tienda.models.entity.Categoria;
import com.nestor.springboot.backend.tienda.models.entity.Producto;
import com.nestor.springboot.backend.tienda.models.services.IcategoriaService;
import com.nestor.springboot.backend.tienda.models.services.IproductoService;

@CrossOrigin(origins= {"*"})  // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/productos")
public class ProductoRestController {

	@Autowired
	private IproductoService productoService;
	
	@Autowired  // Agrega esta anotación para inyectar IcategoriaService
	 private IcategoriaService categoriaService;

	@GetMapping("")
	public List<Producto> index() {
		return productoService.findAll();
	}
	@GetMapping("/{id}")
	public Producto show(@PathVariable int id){
		return productoService.findById(id);
	}
	
	@DeleteMapping("/{id}")  // Borra un evento
	public void delete(@PathVariable int id){
		productoService.delete(id);

	}
	/*
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
	    try {
	        // Verifica si la categoría ya existe en la base de datos
	        Categoria categoria = producto.getCategoria();
	        Categoria categoriaExistente = categoriaService.findById(categoria.getIdCategoria());

	        // Si la categoría no existe, guárdala
	        if (categoriaExistente == null) {
	            categoria = categoriaService.save(categoria);
	        } else {
	            // Si la categoría existe, actualiza la referencia del producto a la categoría existente
	            producto.setCategoria(categoriaExistente);
	        }

	        // Elimina la asignación explícita del valor de id aquí
	       // producto.setId(0); // o simplemente no establezcas el id, permitiendo que se genere automáticamente

	        // Guarda el producto
	        return productoService.save(producto);
	    } catch (Exception e) {
	        return null; // Manejar el error según tus necesidades
	    }
	}
	*/
	/*
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
	    return productoService.save(producto);
	}
	*/
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create(@RequestBody Producto producto) {
	    try {
	        Categoria categoria = categoriaService.findById(producto.getCategoria().getIdCategoria());
	        producto.setCategoria(categoria);
	        return productoService.save(producto);
	    } catch (Exception e) {
	        // Maneja el error según tus necesidades
	        return null;
	    }
	}
	
	
	@PutMapping("/{id}")  // actualiza un cliente
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto,@PathVariable int id) {
		Producto objetoActualizar = productoService.findById(id); // Buscamos el elemento a cambiar
		objetoActualizar.setCategoria(producto.getCategoria()); // cambiamos los datos
		objetoActualizar.setNombre(producto.getNombre());		
		objetoActualizar.setPrecio(producto.getPrecio());
		objetoActualizar.setStock(producto.getStock());
		objetoActualizar.setImagen(producto.getImagen());
		return productoService.save(objetoActualizar); // Guardo la nueva información
	}
}