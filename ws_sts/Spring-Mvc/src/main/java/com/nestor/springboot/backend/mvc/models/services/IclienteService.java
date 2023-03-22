package com.nestor.springboot.backend.mvc.models.services;

import java.util.List;

import com.nestor.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteService {
	
	public List<Cliente> findAll();
	public Cliente findById(Long id);

}
