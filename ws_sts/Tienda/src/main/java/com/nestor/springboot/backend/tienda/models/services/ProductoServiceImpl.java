package com.nestor.springboot.backend.tienda.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nestor.springboot.backend.tienda.models.dao.IproductoDao;
import com.nestor.springboot.backend.tienda.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IproductoService {

	@Autowired
	private IproductoDao productoDao;
	
	@Override
	@Transactional(readOnly=true) // Auto-exiges que dentro del método no usarás nada que pueda modificar los datos
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Producto findById(int id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(int id) {
		productoDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

}
