package com.nestor.springboot.backend.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.springboot.backend.mvc.models.entity.Cliente;
import com.nestor.springboot.backend.mvc.models.services.IclienteService;


@CrossOrigin(origins= {"*"}) // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IclienteService clienteService;
	
	
	@GetMapping("/clientes") // Muestra todos los clientes
	public List<Cliente> index() {
		return clienteService.findAll();
	}
	@GetMapping("/clientes/{id}") // Muestra un solo cliente
	public Cliente show(@PathVariable Long id){
		return clienteService.findById(id);

	}
}
