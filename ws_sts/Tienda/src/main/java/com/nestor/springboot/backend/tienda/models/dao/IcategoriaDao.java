package com.nestor.springboot.backend.tienda.models.dao;

import com.nestor.springboot.backend.tienda.models.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface IcategoriaDao extends CrudRepository<Categoria, Integer> {
	
}