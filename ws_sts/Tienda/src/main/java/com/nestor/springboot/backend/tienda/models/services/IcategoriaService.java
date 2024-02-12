package com.nestor.springboot.backend.tienda.models.services;

import com.nestor.springboot.backend.tienda.models.entity.Categoria;

import java.util.List;

public interface IcategoriaService {
    List<Categoria> findAll();
    Categoria findById(int id);
    void delete(int id);
    Categoria save(Categoria categoria);
}