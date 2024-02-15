package com.nestor.springboot.backend.tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.nestor.springboot.backend.tienda.models.entity.Producto;

public interface IproductoDao extends CrudRepository<Producto, Integer > {

}
