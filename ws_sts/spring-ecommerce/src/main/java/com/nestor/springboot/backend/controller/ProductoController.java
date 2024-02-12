package com.nestor.springboot.backend.controller;


import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nestor.springboot.backend.models.Producto;
import com.nestor.springboot.backend.models.Usuario;
import com.nestor.springboot.backend.services.ProductoService;

import ch.qos.logback.classic.Logger;


@Controller
@RequestMapping("/api")
public class ProductoController {
	
	private final Logger LOGGER =  (Logger) LoggerFactory.getLogger(ProductoController.class);
	
	@Autowired
	private ProductoService productoService;

	@GetMapping("/productos")
	public String show(ModelMap model) {
		model.addAttribute("productos", productoService.findAll());
		return "productos/show";
	}
	
	@GetMapping("/create")
	public String create() {
		return "productos/create";
	}
	
	@PostMapping("/save")
	public String save(Producto producto) {
		LOGGER.info("Este es el objeto producto {}", producto );		
		Usuario u = new Usuario(1, "", "", "" ,"" ,"" ,"", "");
		producto.setUsuario(u);
		
		
		productoService.save(producto);
		return "redirect:/productos";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable Integer id, ModelMap model) {
		Producto producto = new Producto();
		Optional<Producto> optionalProducto = productoService.get(id);
		producto = optionalProducto.get();
		
		LOGGER.info("Producto buscado: {}", producto);
		model.addAttribute("producto", producto);
		
		return "productos/edit";
	}
	
	@PostMapping("/update")
	public String update() {
		return "redirect:/productos";
	}
	
	@GetMapping("/detele/{id}")
	public String delte(@PathVariable Integer id) {
		productoService.delete(id);
		return "redirect:/productos";
	}
}
