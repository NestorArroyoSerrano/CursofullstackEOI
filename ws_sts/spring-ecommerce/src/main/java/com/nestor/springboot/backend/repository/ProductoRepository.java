package com.nestor.springboot.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nestor.springboot.backend.models.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}

