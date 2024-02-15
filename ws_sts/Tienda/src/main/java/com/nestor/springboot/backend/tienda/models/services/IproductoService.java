package com.nestor.springboot.backend.tienda.models.services;

import java.util.List;

import com.nestor.springboot.backend.tienda.models.entity.Producto;

public interface IproductoService {

	public List<Producto> findAll();
	public Producto findById(int id); 
	public void delete (int id);
	public Producto save(Producto producto);
}
